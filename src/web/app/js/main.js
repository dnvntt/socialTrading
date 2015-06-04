'use strict';

var Traders = Backbone.Collection.extend({
    url: "/api/v1/traders"
});

var dispatcher = new Flux.Dispatcher();
var traders = new Traders();

dispatcher.register(function(message) {
    console.log(message);
});


var TraderLine = React.createClass({
    follow: function() {
        alert("Following trader " + this.props.trader.id)
    },

    render: function() {
        return (
            <div className="trader clearfix">
            <div className="block">
            <img src="/img/trader1.jpg" className="img-thumbnail"/>
            </div>

            <div className="block basic-info">
            <h2>{this.props.trader.get("name")}</h2>
            <p className="text-muted">{this.props.trader.get("description")}</p>
            </div>

            <div className="block">
            <span className="text-label">Amount following</span><br/>
            <span>${this.props.trader.get("amountFollowing")}</span><br/>

            <span className="text-label">People following</span><br/>
            <span>{this.props.trader.get("peopleFollowing")}</span><br/>

            <span className="text-label">ROI</span><br/>
            <span>{this.props.trader.get("roi")}%</span>
            </div>

            <div className="block">
            <button type="submit" 
            className="btn btn-primary"
            onClick={this.follow}>Follow</button>
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
        this.props.traders.on("add remove reset", function() {
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


React.render(
    <TraderList traders={traders}/>,
    document.getElementById('example')
);

traders.fetch();
