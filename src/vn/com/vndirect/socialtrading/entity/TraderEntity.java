package vn.com.vndirect.socialtrading.entity;

public class TraderEntity {
	private String id;
	private int numberFollow;
	private float moneyFollow;
	private float cash;
	private float stockOnhandValue;
	private String name;
	private String username;

	public TraderEntity() {}
	
	public TraderEntity(String id1,int numberFollow1,float moneyFollow1,float cash1,float stockOnhandValue1)
	{
		id=id1;numberFollow= numberFollow1;cash=cash1; stockOnhandValue=stockOnhandValue1;
	}
	
	public String getId() {
		return id.trim();
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getNumberFollow() {
		return numberFollow;
	}
	public void setNumberFollow(int numberFollow) {
		this.numberFollow = numberFollow;
	}
	public float getMoneyFollow() {
		return moneyFollow;
	}
	public void setMoneyFollow(float moneyFollow) {
		this.moneyFollow = moneyFollow;
	}
	public float getCash() {
		return cash;
	}
	public void setCash(float cash) {
		this.cash = cash;
	}
	public float getStockOnhandValue() {
		return stockOnhandValue;
	}
	public void setStockOnhandValue(float stockOnhandValue) {
		this.stockOnhandValue = stockOnhandValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
