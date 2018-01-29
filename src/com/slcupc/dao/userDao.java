package com.slcupc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.slcupc.tool.JDBCConnection;
import com.slcupc.untity.UserBean;

public class userDao {
	public UserBean login(String username, String password) throws SQLException {
		UserBean userBean = new UserBean();
		Connection conn = JDBCConnection.getConnection();
		String sql = "select * from userc where username=? and password=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		//int row = 0;
		// System.out.println("dao" + password);
		while (rs.next()) {
			//user.setUsername(rs.getString("username"));
			//user.setPassWord(rs.getString("password"));
			userBean.setPassWord(rs.getString("password"));
			userBean.setUsername(rs.getString("username"));
		}

		return userBean;
	}

}
