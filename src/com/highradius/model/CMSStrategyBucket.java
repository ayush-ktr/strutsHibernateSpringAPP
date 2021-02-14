package com.highradius.model;

public class CMSStrategyBucket extends AuditedEntity {
	private static final long serialVersionUID = 1L;
	private int pkStrategyBucketId;
	private int accountId;
	private int agingBucketId;
	private int lowValue;
	private Integer highValue;
	private int fkStrategyId;
	private int fkBucketTypeId;
	private String bucketName="";
	public int getPkStrategyBucketId() {
		return pkStrategyBucketId;
	}
	public void setPkStrategyBucketId(int pkStrategyBucketId) {
		this.pkStrategyBucketId = pkStrategyBucketId;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public int getAgingBucketId() {
		return agingBucketId;
	}
	public void setAgingBucketId(int agingBucketId) {
		this.agingBucketId = agingBucketId;
	}
	public int getLowValue() {
		return lowValue;
	}
	public void setLowValue(int lowValue) {
		this.lowValue = lowValue;
	}
	public Integer getHighValue() {
		return highValue;
	}
	public void setHighValue(Integer highValue) {
		this.highValue = highValue;
	}
	public int getFkStrategyId() {
		return fkStrategyId;
	}
	public void setFkStrategyId(int fkStrategyId) {
		this.fkStrategyId = fkStrategyId;
	}
	public int getFkBucketTypeId() {
		return fkBucketTypeId;
	}
	public void setFkBucketTypeId(int fkBucketTypeId) {
		this.fkBucketTypeId = fkBucketTypeId;
	}
	public String getBucketName() {
		return bucketName;
	}
	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}
	
}
