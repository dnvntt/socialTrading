package vn.com.vndirect.socialtrading.entity;

import java.util.HashMap;
import java.util.Map;

public class Follower {
	private String id;
	private int maxopen;
	private int currentOpen;
	private float moneyAllocate;
	private float currentAllocate;

	private Map <String,Integer> mapStockQuantityFollow = new HashMap<String, Integer>();
	private Map <String,String> mapStockOrderFollow = new HashMap<String, String>();
	
	public Follower() {}
	
	public Follower(String id1,int maxopen1,int currentOpen1,float moneyAllocate1,float currentAllocate1,Map <String,Integer> mapStockQuantity1,Map <String,String> mapStockOrder1) 
	{
		id=id1;maxopen=maxopen1; currentOpen=currentOpen1;moneyAllocate=moneyAllocate1;currentAllocate=currentAllocate1;
		mapStockQuantityFollow=mapStockQuantity1;mapStockOrderFollow= mapStockOrder1;
	}
	
	public Map<String, String> getMapStockOrderFollow() {
		return mapStockOrderFollow;
	}

	public void setMapStockOrderFollow(Map<String, String> mapStockOrderFollow) {
		this.mapStockOrderFollow = mapStockOrderFollow;
	}

	public Map<String, Integer> getMapStockQuantityFollow() {
		return mapStockQuantityFollow;
		
	}

	public void setMapStockQuantityFollow(Map<String, Integer> mapStock) {
		this.mapStockQuantityFollow = mapStock;
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
}
