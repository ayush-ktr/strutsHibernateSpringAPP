package com.highradius.model;

import java.util.Date;

public class CMSUserVirtualNumber {
	
	private static final long serialVersionUID = 1L;
    private Integer pkUserVirtualNumberId;
    private Integer fkAccountId;
    private LuUser luUser;
    private String virtualNumber;
    private String sipUserName;
    private String sipPassword;
    private String incomingNumber;
    private String createUser;
    private String updateUser;
    private Date createTime;
    private Date updateTime;
    

	public Integer getPkUserVirtualNumberId() {
        return this.pkUserVirtualNumberId;
    }

    public void setPkUserVirtualNumberId(Integer pkUserVirtualNumberId) {
        this.pkUserVirtualNumberId = pkUserVirtualNumberId;
    }

    
    public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public LuUser getLuUser() {
        return this.luUser;
    }

    public void setLuUser(LuUser luUser) {
    	this.luUser = luUser;
    }
    
    public String getVirtualNumber() {
        return this.virtualNumber;
    }

    public void setVirtualNumber(String virtualNumber) {
        this.virtualNumber = virtualNumber;
    }

	public Integer getFkAccountId() {
		return fkAccountId;
	}

	public void setFkAccountId(Integer fkAccountId) {
		this.fkAccountId = fkAccountId;
	}

	public String getSipUserName() {
		return sipUserName;
	}

	public void setSipUserName(String sipUserName) {
		this.sipUserName = sipUserName;
	}

	public String getSipPassword() {
		return sipPassword;
	}

	public void setSipPassword(String sipPassword) {
		this.sipPassword = sipPassword;
	}

	public String getIncomingNumber() {
		return incomingNumber;
	}

	public void setIncomingNumber(String incomingNumber) {
		this.incomingNumber = incomingNumber;
	}

	@Override
	public String toString() {
		return "CMSUserVirtualNumber [pkUserVirtualNumberId=" + pkUserVirtualNumberId + ", fkAccountId=" + fkAccountId
				+ ", luUser=" + luUser + ", virtualNumber=" + virtualNumber + ", sipUserName=" + sipUserName
				+ ", sipPassword=" + sipPassword + ", incomingNumber=" + incomingNumber + ", createUser=" + createUser
				+ ", updateUser=" + updateUser + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	
}
