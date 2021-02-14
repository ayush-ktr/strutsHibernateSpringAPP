package com.highradius.model;

import java.io.Serializable;
import java.util.Date;

public class CMSUserCallerID implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer pkUserCallerId;
	private Integer fkAccountId;
    private LuUser luUser;
    private String callerId;
    private Boolean isActive;
    private Boolean isVerified;
    private String transactionId;
    public Boolean getIsVerified() {
		return isVerified;
	}
	public void setIsVerified(Boolean isVerified) {
		this.isVerified = isVerified;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;
	public Integer getPkUserCallerId() {
		return pkUserCallerId;
	}
	public void setPkUserCallerId(Integer pkUserCallerId) {
		this.pkUserCallerId = pkUserCallerId;
	}
	public Integer getFkAccountId() {
		return fkAccountId;
	}
	public void setFkAccountId(Integer fkAccountId) {
		this.fkAccountId = fkAccountId;
	}
	public LuUser getLuUser() {
		return luUser;
	}
	public void setLuUser(LuUser luUser) {
		this.luUser = luUser;
	}
	public String getCallerId() {
		return callerId;
	}
	public void setCallerId(String callerId) {
		this.callerId = callerId;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
