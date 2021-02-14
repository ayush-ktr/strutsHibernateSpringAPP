package com.highradius.model;

import java.io.Serializable;
import java.util.Date;

public class LuFeature implements Serializable {
	private Integer pkFeatureId;
	private Integer fkDataTypeId;
	private String featureName;
	private String featureDescription;
	private String featureValue;
	private String createUser;
	private Date createDate;
	private Date createTime;
	private String updateUser;
	private Date updateDate;
	private Date updateTime;
	private String config;
	
	//luDataType and dataTypeName act as transient variable
//	private LuDataType luDataType;
	private String dataTypeName;
	
	public String getDataTypeName() {
		return dataTypeName;
	}
	public void setDataTypeName(String dataTypeName) {
		this.dataTypeName = dataTypeName;
	}
//	public LuDataType getLuDataType() {
//		return luDataType;
//	}
//	public void setLuDataType(LuDataType luDataType) {
//		this.luDataType = luDataType;
//		this.dataTypeName=this.luDataType.getShortname();
//	}
	public Integer getPkFeatureId() {
		return pkFeatureId;
	}
	public void setPkFeatureId(Integer pkFeatureId) {
		this.pkFeatureId = pkFeatureId;
	}
	public Integer getFkDataTypeId() {
		return fkDataTypeId;
	}
	public void setFkDataTypeId(Integer fkDataTypeId) {
		this.fkDataTypeId = fkDataTypeId;
	}
	public String getFeatureName() {
		return featureName;
	}
	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}
	public String getFeatureDescription() {
		return featureDescription;
	}
	public void setFeatureDescription(String featureDescription) {
		this.featureDescription = featureDescription;
	}
	public String getFeatureValue() {
		return featureValue;
	}
	public void setFeatureValue(String featureValue) {
		this.featureValue = featureValue;
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
	public String getConfig() {
		return config;
	}
	public void setConfig(String config) {
		this.config = config;
	}
}
