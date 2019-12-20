package com.jenkins.model;

import java.io.Serializable;

public class UserVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2828636766367908239L;

	private String userName;

	private String password;

	public UserVO() {
		super();
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

	@Override
	public String toString() {
		return "UserVO [userName=" + userName + ", password=" + password + "]";
	}
}
