package com.highradius.model;

import java.io.Serializable;
import java.util.Date;

public class MapAccountFeature implements Serializable {
	private Integer pkMapAccountFeatureId;
	private Integer fkAccountId;
	private LuFeature luFeature;
	private String createUser;
	private Date createDate;
	private Date createTime;
	private String updateUser;
	private Date updateDate;
	private Date updateTime;
	private String config;
	
	public Integer getPkMapAccountFeatureId() {
		return pkMapAccountFeatureId;
	}
	public void setPkMapAccountFeatureId(Integer pkMapAccountFeatureId) {
		this.pkMapAccountFeatureId = pkMapAccountFeatureId;
	}
	public Integer getFkAccountId() {
		return fkAccountId;
	}
	public void setFkAccountId(Integer fkAccountId) {
		this.fkAccountId = fkAccountId;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
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
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public void setLuFeature(LuFeature luFeature) {
		this.luFeature = luFeature;
	}
	public LuFeature getLuFeature() {
		return luFeature;
	}
	public String getConfig() {
		return this.config;
	}
	public void setConfig(String config) {
		this.config = config;
	}
}
