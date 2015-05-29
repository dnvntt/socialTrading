package vn.com.vndirect.socialtrading;

import java.util.HashMap;
import java.util.Map;

public class Follower {
	// private String followerid;
	private String id;
	private int maxopen;
	private int currentOpen;
	private float moneyAllocate;
	private float currentAllocate;
	private int riskfactor;
	private float cash;
	private Map <String,Integer> mapStockQuantityFollow = new HashMap<String, Integer>();
	private Map <String,String> mapStockOrderFollow = new HashMap<String, String>();
	
	public Map<String, String> getMapStockOrderFollow() {
		return mapStockOrderFollow;
	}

	public void setMapStockOrderFollow(Map<String, String> mapStockOrderFollow) {
		this.mapStockOrderFollow = mapStockOrderFollow;
	}

	public Map<String, Integer> getMapStockFollow() {
		return mapStockQuantityFollow;
		
	}

	public void setMapStockFollow(Map<String, Integer> mapStock) {
		this.mapStockQuantityFollow = mapStock;
	}

	public Follower(String id1,int maxopen1,int currentOpen1,float moneyAllocate1,float currentAllocate1,int riskfactor1,float cash1,Map <String,Integer> mapStockQuantity1,Map <String,String> mapStockOrder1) 
	{
		id=id1;maxopen=maxopen1; currentOpen=currentOpen1;moneyAllocate=moneyAllocate1;currentAllocate=currentAllocate1;
		riskfactor=riskfactor1;cash=cash1; mapStockQuantityFollow=mapStockQuantity1;mapStockOrderFollow= mapStockOrder1;
	}

	public String getId() {
		return id.trim();
	}

	public void setId(String id) {
		this.id = id;
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

	public int getRiskfactor() {
		return riskfactor;
	}

	public void setRiskfactor(int riskfactor) {
		this.riskfactor = riskfactor;
	}

	public float getCash() {
		return cash;
	}

	public void setCash(float cash) {
		this.cash = cash;
	}

}