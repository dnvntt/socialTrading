'use strict';

var Traders = Backbone.Collection.extend({
    url: "/api/v1/traders",

    comparator: function(item) {
        return item.get('id');
    }
});

var FollowingRels = Backbone.Collection.extend({
    model: Backbone.Model.extend({
        idAttribute: "traderId"
    }),
});

var Follower = Backbone.Model.extend({
    defaults: {
        followingTraders: new FollowingRels()
    },

    initialize: function() {
        var _this = this;

        dispatcher.register(function(message) {
            switch (message.type) {
                case "ask_to_follow_trader":
                    $.post("/api/v1/follower/" + _this.id + "/following", {
                        traderid: message.trader.id,
                        money: 213,
                        maxopen: 3
                    }).then(function() {
                        _this.fetch();
                        traders.fetch();
                    });
                    break;
                case "ask_to_unfollow_trader":
                    $.ajax({
                        url: "/api/v1/follower/" + _this.id + "/following/" + message.trader.id,
                        method: "DELETE",
                        success: function() {
                            _this.fetch();
                            traders.fetch();
                        }
                    });
                    break;
            }
        });
    },

    parse: function(res) {
        var _this = this;
        console.log("parsing follower");
        this.get("followingTraders").url = "/api/v1/follower/" + this.id + "/following";
        this.get("followingTraders").fetch().then(function() {
            console.log("followingTraders fetched")
                _this.get("followingTraders").trigger("change")
        });
        return res;
    },

    isFollowing: function(trader) {
        return this.get("followingTraders").get(trader.get("id")) !== undefined;
    }
});

var dispatcher = new Flux.Dispatcher();
var traders = new Traders();
var me = new Follower();
me.url = "/api/v1/me";
me.fetch();

dispatcher.register(function(message) {
    console.log(message);
});


var TraderLine = React.createClass({
    followBtnToggled: function() {
        if (me.isFollowing(this.props.trader)) {
            dispatcher.dispatch({
                type: "ask_to_unfollow_trader",
                trader: this.props.trader
            });
        } else {
            dispatcher.dispatch({
                type: "ask_to_follow_trader",
                trader: this.props.trader
            });
        }
    },

    render: function() {
        var followBtnClasses = "btn ";
        if (me.isFollowing(this.props.trader)) {
            var followButtonText = "Unfollow";
            followBtnClasses += "btn-danger";
        } else {
            followButtonText = "Follow";
            followBtnClasses += "btn-primary";
        }

        return (
            <div className="trader clearfix">
              <div className="block">
                <img src="/img/trader1.jpg" className="img-thumbnail"/>
              </div>

              <div className="block basic-info">
                <h2>{this.props.trader.get("name")}</h2>
                <p className="text-muted">
                  {this.props.trader.get("id")}
                  {this.props.trader.get("description")}
                </p>
              </div>

              <div className="block">
                <span className="text-label">Amount following</span><br/>
                <span>${this.props.trader.get("cash")}</span><br/>

                <span className="text-label">People following</span><br/>
                <span>{this.props.trader.get("peopleFollowing")}</span><br/>

                <span className="text-label">ROI</span><br/>
                <span>{this.props.trader.get("roi")}%</span>
              </div>

              <div className="block">
                <button type="submit" 
                        className={followBtnClasses}
                        onClick={this.followBtnToggled}>{{followButtonText}}</button>
              </div>
            </div>
        );
    }
});

var RiskSlider = React.createClass({
    // TODO: Detect when the user stops sliding then send the new value to server
    getInitialState: function() {
        return {
            value: 50
        };
    },

    onChange: function(event) {
        var newValue = event.target.value;
        if (newValue != this.state.value) {
            this.setState({value: event.target.value});
            dispatcher.dispatch({
                type: "risk-factor-changed",
                value: event.target.value
            });
        }
    },

    render: function() {
        return (
            <input ref="self"
                   type="range"
                   min="10"
                   max="100"
                   step="10"
                   value={this.state.value}
                   onChange={this.onChange}/>
        );
    }
});

var TraderList = React.createClass({
    componentDidMount: function() {
        var _this = this;

        me.on("change add remove", function() {
            _this.forceUpdate();
        });

        me.get("followingTraders").on("change", function() {
            console.log("followingTraders changed")
                _this.forceUpdate();
        });

        this.props.traders.on("change add remove reset", function() {
            _this.forceUpdate();
        });
    },

    render: function() {
        var nodes = this.props.traders.map(function(trader) {
            return (
                <TraderLine trader={trader}/>
            );
        });

        return (
            <div className="trader-list">
              {nodes}
            </div>
        );
    }
});

var NavBar = React.createClass({
    logoutBtnClicked: function() {
        $.post("/api/v1/logout").then(function() {
            location.reload();
        }).fail(function() {
            alert("Lỗi. Không thể đăng xuất!");
        });
    },
    render: function() {
        return (
            <nav className="navbar navbar-default">
              <div className="container-fluid">
                <div className="navbar-header">
                  <a className="navbar-brand" href="#">
                    <span className="accent">D</span>uber
                  </a>
                </div>

                <div className="collapse navbar-collapse">
                  <ul className="nav navbar-nav navbar-right">
                    <li><p className="navbar-text">Hello, {me.id}</p></li>
                    <li><button className="btn btn-default navbar-btn" onClick={this.logoutBtnClicked}>Logout</button></li>
                  </ul>
                </div>
              </div>
            </nav>
        );
    }
});

var App = React.createClass({
    componentDidMount: function() {
        var _this = this;
        dispatcher.register(function(message) {
            switch(message.type) {
                case "auth.authenticated":
                    _this.setState({authChecking: false, loggedIn: true, screen: "wizard"});
                    _this.forceUpdate();
            }
        });
    },

    getInitialState: function() {
        var _this = this;
        $.get("/api/v1/me").then(
            function() {
                _this.setState({authChecking: false, loggedIn: true});
                _this.forceUpdate();
            }).fail(
                function() {
                    _this.setState({authChecking: false, loggedIn: false});
                    _this.forceUpdate();
                });

        return {
            screen: "home",
            authChecking: true,
            loggedIn: false
        };
    },

    startInvesting: function() {
        // TODO Check if this is the first time this user logged in

        this.setState({
            screen: this.state.loggedIn ? "wizard" : "login"
        });

        this.forceUpdate();
    },

    render: function() {
        // FIXME Proper routing
        var inner;
        if (this.state.screen === "home") {
            inner = <HomeScreen onTransit={this.startInvesting}/>;
        } else if (this.state.screen === "login") {
            if (this.state.authChecking) {
                inner = (<h2>Checking authentication...</h2>);
            } else {
                inner = <LoginScreen/>;
            }
        } else if (this.state.screen === "wizard") {
            inner = <WizardScreen/>
        } else if (this.state.screne === "account") {
                                                     inner = <TraderList/>
        }

        return (
            <div className="container-fluid top-container">
                <NavBar/>
                {inner}

                <footer>
                <span>Bản quyền © Công ty cổ phần chứng khoán VNDIRECT</span>
                </footer>
            </div>
        );
    }
});

var LoginScreen = React.createClass({
    login: function() {
        $.post("/api/v1/login", {
            "user": this.refs.username.getDOMNode().value,
            "pass": this.refs.password.getDOMNode().value
        }).then(function() {
            dispatcher.dispatch({
                type: "auth.authenticated"
            });
        }).fail(function() {
            alert("NOPE!")
        });
    },

    render: function() {
        return (
        <div className="form-login">
            <h2>Mời quý khách đăng nhập</h2>
            <input className="form-control" type="text" ref="username" placeholder="Tên đăng nhập"/>
            <input className="form-control" type="password" ref="password" placeholder="Mật khẩu"/>
            <input className="btn btn-primary btn-block" type="submit" value="Đăng nhập" onClick={this.login}/>
        </div>
        );
    }
});


var HomeScreen = React.createClass({
    transitToApp: function() {
        console.log("haha");
        this.props.onTransit();
    },

    render: function() {
        return (
            <div className="home-container">

            <div className="hero">
                <img src="/img/shoutout.png"/>

                <div className="row">
                    <div className="col-md-8">
                        <p>
                        Mạng đầu tư <span className="accent">Duber</span> - 
                        Hệ thống giúp bạn tự động sao chép chiến lược của các nhà đầu tư lãi nhất trên thị trường. 
                        </p>
                    </div>

                    <div className="col-md-4">
                        <button className="btn btn-lg btn-primary" onClick={this.transitToApp}>
                        Đầu tư ngay!
                        </button>
                    </div>
                </div>
            </div>

            <div className="row features">
                <div className="col-md-4">
                    <h3>Tiết kiệm thời gian</h3>
                    <p>
                    Chỉ cần đăng ký duy nhất một tài khoản VNDIRECT,
                    bạn đã trở thành một phần của cộng đồng Duber.
                    </p>
                </div>
                <div className="col-md-4">
                    <h3>Lãi nhất thị trường</h3>
                    <p>
                    Lựa chọn các nhà đầu tư lãi nhất trên thị trường
                    và Duber sẽ tự động sao chép các hoạt động đầu tư
                    của họ vào tài khoản của bạn.
                    </p>
                </div>
                <div className="col-md-4">
                    <h3>Minh bạch thông tin</h3>
                    <p>
                    Quản lý tài khoản dễ dàng, hiển thị minh bạch thông tin
                    đầu tư của bạn và Nhà đầu tư bạn theo dõi.
                    </p>
                </div>
            </div>

            </div>
        );
    }
});


var TraderCarousel = React.createClass({
    componentDidMount: function() {
        var thumb = this.refs.thumbSlider.get();
        $(this.refs.thumbSlider.getDOMNode()).slick();
        $(this.refs.detailSlider.getDOMNode()).slick();
    },

    render: function() {
        return (
            <div>
                <div ref="detailSlider"></div>

                <div ref="thumbSlider">
                  <div>your content</div>
                  <div>your content</div>
                  <div>your content</div>
                </div>
            </div>
        );
    }
});


var WizardScreen = React.createClass({
    render: function() {
        return (
            <div className="container-fluid wizard">
                <div className="panel panel-default">
                    <div className="panel-heading">
                        <h2 className="panel-title">Cài đặt Tài khoản của bạn</h2>
                    </div>

                    <div className="panel-body">
                        <div className="step">
                            <h3>Bước 1: Đặt mức độ rủi ro bạn sẵn sàng chấp nhận</h3>
                            <RiskSlider/>
                        </div>

                        <div className="step">
                            <h3>Bước 2: Chọn Nhà đầu tư bạn sẽ copy chiến lược</h3>
                            <TraderCarousel traders={traders}/>
                        </div>

                        <div className="step">
                            <h3>Bước 3: Chọn số tiền đặt cho Nhà đầu tư bạn vừa chọn</h3>
                            <input type="text"/> triệu VND
                        </div>

                        <div className="button-row clearfix">
                            <button className="btn btn-primary">Hoàn thành</button>
                            <button className="btn btn-default">Bỏ qua</button>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
});


React.render(
    <App/>,
    document.getElementById('example')
);

traders.fetch();