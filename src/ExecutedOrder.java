public class ExecutedOrder {
	private String orderId;
	private String account;
	private String transactTime;
	private int side;
	private String symbol;
	private String tradeDate;
	private int qty;
	private int price;
	private int matchedQty;
	private int matchedPrice;
	private String eventName;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getTransactTime() {
		return transactTime;
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
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getTradeDate() {
		return tradeDate;
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
	public int getMatchedQty() {
		return matchedQty;
	}
	public void setMatchedQty(int matchedQty) {
		this.matchedQty = matchedQty;
	}
	public int getMatchedPrice() {
		return matchedPrice;
	}
	public void setMatchedPrice(int matchedPrice) {
		this.matchedPrice = matchedPrice;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
}
