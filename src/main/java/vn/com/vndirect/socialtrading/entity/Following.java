package vn.com.vndirect.socialtrading.entity;

public class Following {
	private String traderId;
	private int maxopen;
	private int currentOpen;
	private float moneyAllocate;
	private float currentAllocate;
	
	
	public String getTraderId() {
		return traderId;
	}
	public void setTraderId(String traderId) {
		this.traderId = traderId;
	}
	public int getMaxopen() {
		return maxopen;
	}
	public void setMaxopen(int maxopen) {
		this.maxopen = maxopen;
	}
	public int getCurrentOpen() {
		return currentOpen;
	}
	public void setCurrentOpen(int currentOpen) {
		this.currentOpen = currentOpen;
	}
	public float getMoneyAllocate() {
		return moneyAllocate;
	}
	public void setMoneyAllocate(float moneyAllocate) {
		this.moneyAllocate = moneyAllocate;
	}
	public float getCurrentAllocate() {
		return currentAllocate;
	}
	public void setCurrentAllocate(float currentAllocate) {
		this.currentAllocate = currentAllocate;
	}
	
}
