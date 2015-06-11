var AccountScreen = React.createClass({
    render: function() {
        return (
            <div>
            <InfoBox/>
            <StockList/>
            </div>
        );
    }
});


var InfoBox = React.createClass({
    render: function() {
        // FIXME Decouple from `me`
        var styles = {
            personalInfo: {
                float: "left",
                marginRight: 20,
                textAlign: "center"
            },
            accountInfo: {
                overflow: "hidden",
                fontSize: "16px"
            },
            accountInfoRow: {
                marginBottom: "1em"
            },
            riskSlider: {
                marginBottom: 30,
                marginLeft: 10,
                marginRight: 10
            },
            label: {
                marginRight: "1em"
            },
        };

        return (
            <div className="panel panel-default">
            <div className="panel-body clearfix">
                <div ref="personalInfo" style={styles.personalInfo}>
                    <img src="/img/avatar.png"/>
                    <strong>Superman</strong><br/>
                    {me.id}
                </div>

                <div ref="accountInfo" style={styles.accountInfo}>
                    <div className="row" style={styles.accountInfoRow}>
                        <div className="col-md-6">
                            <span className="highlight-label" style={styles.label}>NAV</span>
                            <strong className="text-success">$23123213</strong>
                        </div>
                        <div className="col-md-6">
                            <span className="highlight-label" style={styles.label}>Tổng lãi/lỗ</span>
                            <strong className="text-success">$445</strong>
                        </div>
                    </div>

                    <div className="row" style={styles.accountInfoRow}>
                        <div className="col-md-12">
                            <h4>Mức độ rủi ro:</h4>
                            <RiskSlider ref="riskSlider" style={styles.riskSlider}/>
                        </div>
                    </div>
                </div>
            </div>
            </div>
        );
    }
});


var StockList = React.createClass({
    render: function() {
        return (
            <div className="panel panel-default">
                <div className="panel-heading">
                    <h3 className="panel-title">Danh mục của tôi</h3>
                </div>

                <div className="panel-body">
                    <p>Hiện tại quý khách chưa có lệnh đặt nào.</p>
                </div>
            </div>
        );
    }
});