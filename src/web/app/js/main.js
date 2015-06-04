'use strict';

var React = require("react");
var Backbone = require("backbone");
var $ = require("jquery");
var _ = require("underscore");
var Bootstrap = require("bootstrap-sass");
var BootstrapSlider = require("bootstrap-slider");


var Traders = Backbone.Collection.extend({
    url: "/api/v1/traders"
});

var traders = new Traders();


var TraderLine = React.createClass({
    follow: function() {
        alert("Following trader " + this.props.trader.id)
    },

    render: function() {
        console.log(this.props.trader);
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

var Slider = React.createClass({
    componentDidMount: function() {
        $(React.findDOMNode(this.refs.haha)).slider({
            formatter: function(value) {
                return 'Current value: ' + value;
            }
        });
    },

    render: function() {
        return (
            <input ref="haha"
            data-slider-id='ex1Slider' 
            type="text" 
            data-slider-min="0"
            data-slider-max="20"
            data-slider-step="1"
            data-slider-value="14"/>
        );
    }
});

var TraderList = React.createClass({
    componentDidMount: function() {
        var _this = this;
        this.props.traders.on("add remove reset", function() {
            console.log("New data");
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
            <Slider/>
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
