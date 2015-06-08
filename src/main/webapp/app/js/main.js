'use strict';

var Traders = Backbone.Collection.extend({
    url: "/api/v1/traders",
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
        console.log(this.props.trader)

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
                <RiskSlider/>
                {nodes}
            </div>
        );
    }
});

var NavBar = React.createClass({
    render: function() {
        return (
            <nav className="navbar navbar-default">
                <div className="container">
                    <div className="navbar-header">
                        <a className="navbar-brand" href="#">
                           <img alt="Brand" 
                           width="20"
                           height="20"
                           src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACgAAAAoCAMAAAC7IEhfAAAA81BMVEX///9VPnxWPXxWPXxWPXxWPXxWPXxWPXz///9hSYT6+vuFc6BXPn37+vz8+/z9/f2LeqWMe6aOfqiTg6uXiK5bQ4BZQX9iS4VdRYFdRYJfSINuWI5vWY9xXJF0YJR3Y5Z4ZZd5ZZd6Z5h9apq0qcW1qsW1q8a6sMqpnLyrn76tocCvpMGwpMJoUoprVYxeRoJjS4abjLGilLemmbrDutDFvdLPx9nX0eDa1OLb1uPd1+Td2OXe2eXh3Ofj3+nk4Orl4evp5u7u7PLv7fPx7/T08vb08/f19Pf29Pj39vn6+fuEcZ9YP35aQn/8/P1ZQH5fR4PINAOdAAAAB3RSTlMAIWWOw/P002ipnAAAAPhJREFUeF6NldWOhEAUBRvtRsfdfd3d3e3/v2ZPmGSWZNPDqScqqaSBSy4CGJbtSi2ubRkiwXRkBo6ZdJIApeEwoWMIS1JYwuZCW7hc6ApJkgrr+T/eW1V9uKXS5I5GXAjW2VAV9KFfSfgJpk+w4yXhwoqwl5AIGwp4RPgdK3XNHD2ETYiwe6nUa18f5jYSxle4vulw7/EtoCdzvqkPv3bn7M0eYbc7xFPXzqCrRCgH0Hsm/IjgTSb04W0i7EGjz+xw+wR6oZ1MnJ9TWrtToEx+4QfcZJ5X6tnhw+nhvqebdVhZUJX/oFcKvaTotUcvUnY188ue/n38AunzPPE8yg7bAAAAAElFTkSuQmCC"/>
                        </a>
                    </div>

                    <nav>
                        <ul className="nav navbar-nav navbar-right">
                        <li><p className="navbar-text">Hello, {me.id}</p></li>
                        <li><button className="btn btn-default navbar-btn">Logout</button></li>
                        </ul>
                    </nav>
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
                _this.setState({authChecking: false, loggedIn: true});
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
            authChecking: true,
            loggedIn: false
        };
    },

    logout: function() {
        alert("Logging out is not implemented yet!");
    },

    render: function() {
        if (this.state.authChecking) {
            return (<h2>Checking authentication...</h2>);
        } else {
            if (this.state.loggedIn) {
                return (
                    <div>
                        <NavBar/>
                        <div className="container">
                        <TraderList traders={traders}/>
                        </div>
                    </div>
                );
            } else {
                return <LoginScreen/>;
            }
        }
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


React.render(
    <App/>,
    document.getElementById('example')
);

traders.fetch();
