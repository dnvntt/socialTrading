(function() {

alert("haoe")

var Traders = Backbone.Collection.extend({
  url: "/api/traders"
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
          <h2>{this.props.trader.name}</h2>
          <p className="text-muted">{this.props.trader.description}</p>
        </div>

        <div className="block">
        <span className="text-label">Amount following</span><br/>
        <span>${this.props.trader.amountFollowing}</span><br/>

        <span className="text-label">People following</span><br/>
        <span>{this.props.trader.peopleFollowing}</span><br/>

        <span className="text-label">ROI</span><br/>
        <span>{this.props.trader.roi}%</span>
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

var TraderList = React.createClass({
  render: function() {
    var traders = [
    {name: "Trung", description: "Haha", amountFollowing: 999, peopleFollowing: 34, roi: 344, id: 3434},
    {name: "Trung", description: "Haha", amountFollowing: 999, peopleFollowing: 34, roi: 344, id: 3434},
    {name: "Trung", description: "Haha", amountFollowing: 999, peopleFollowing: 34, roi: 344, id: 3434},
    ];
    var traderNodes = [
    <TraderLine trader={traders[0]}/>,
    <TraderLine trader={traders[1]}/>, 
    <TraderLine trader={traders[2]}/>
    ];

    return (
      <div className="trader-list">
        {traderNodes}
      </div>
    );
  }
});


React.render(
  <TraderList/>,
  document.getElementById('example')
);

})();
