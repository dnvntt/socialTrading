package vn.com.vndirect.socialtrading;

public class SendOrder {

    private String orderId;
	private String account;
    private String transactTime;

	// FIXME Refactor to use enum
    private int side;
    private String symbol;
    private String tradeDate;

	// FIXME Refactor to use enum
    private int type;
    private int qty;
    private int price;
    private String eventName;


    public int getType() {
		return type;
	}
    /*
    		1= MP
    		2= LO
    		3= ATO
    		5= ATC
    		6= MOK
    		7= MAK
    		8= MTL
     */
	public void setType(int type) {
		this.type = type;
	}

	public String getOrderId() {
		return orderId.trim();
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getAccount() {
		return account.trim();
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getTransactTime() {
		return transactTime.trim();
	}

	public void setTransactTime(String transactTime) {
		this.transactTime = transactTime;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public String getSymbol() {
		return symbol.trim();
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getTradeDate() {
		return tradeDate.trim();
	}

	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	public String getEventName() {
		return eventName.trim();
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +   
                ", account='" + account + '\'' +  ", symbol=" + symbol + 
                ", side=" + side +   ", tradeDate=" +  tradeDate+  ", transactTime=" +  transactTime+ ", qty=" + qty + ", price=" + price +
                  ", type=" + type + ", eventName=" + eventName +
                '}';
    }
}
