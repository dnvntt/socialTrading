package vn.com.vndirect.socialtrading.entity;

public class FollowerEntity {
	private String id;
	private int riskfactor;
	private float cash;

	public FollowerEntity(String followerId, float cashOnHand, int risk) {
		id = followerId;
		cash = cashOnHand;
		riskfactor = risk;
	}

	public FollowerEntity() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
