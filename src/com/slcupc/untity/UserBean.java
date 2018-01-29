package com.slcupc.untity;

public class UserBean {
	private String passWord;
	private String username;

	public UserBean(String username, String password) {
		this.passWord = password;
		this.username = username;
		// TODO Auto-generated constructor stub
	}

	public UserBean() {
		// TODO Auto-generated constructor stub
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
