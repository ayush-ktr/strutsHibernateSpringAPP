package com.highradius.model;

public class NumberDTO {
	private String userName;
	 private String virtualNumber;
	 private String callerID;
	 private boolean maskingEnabled;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getVirtualNumber() {
		return virtualNumber;
	}
	public void setVirtualNumber(String virtualNumber) {
		this.virtualNumber = virtualNumber;
	}
	public String getCallerID() {
		return callerID;
	}
	public void setCallerID(String callerID) {
		this.callerID = callerID;
	}
	public boolean isMaskingEnabled() {
		return maskingEnabled;
	}
	public void setMaskingEnabled(boolean maskingEnabled) {
		this.maskingEnabled = maskingEnabled;
	}
	 
}
