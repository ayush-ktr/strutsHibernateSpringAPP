package com.highradius.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "lu_user")
public class LuUser {

	@Id
	@GenericGenerator(name = "autoGen", strategy = "increment")
	@GeneratedValue(generator = "autoGen")
	@Column(name = "pk_user_id")
	private int pkUserId;
	@Column(name = "username")
	private String userName;
	@Column(name = "password")
	private String password;
	@Column(name = "is_login")
	private boolean isLoggedIn;
	@Column(name = "full_name")
	private String fullName;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getPkUserId() {
		return pkUserId;
	}

	public void setPkUserId(int pkUserId) {
		this.pkUserId = pkUserId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isLoggedIn() {
		return isLoggedIn;
	}

	public void setLoggedIn(boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}

}
