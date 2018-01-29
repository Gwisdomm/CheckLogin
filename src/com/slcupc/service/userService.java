package com.slcupc.service;

import java.sql.SQLException;

import com.slcupc.dao.userDao;
import com.slcupc.untity.UserBean;

public class userService {
	private static userDao dao = new userDao();

	public static UserBean login(String username,String password) throws SQLException {
		//System.out.println("In service " + password);
		UserBean user = dao.login(username, password);
		return user;
	}

}
