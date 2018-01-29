package com.slcupc.tool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	public static Connection getConnection() {
		Connection conn=null;
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//连接字符串
			String url="jdbc:mysql://localhost:3306/mysql_test?useSSL=false";
			//用户名
			String username="root";
			//用户密码
			String password="123456789";
			conn=DriverManager.getConnection(url,username,password);
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			}catch(SQLException e) {
				e.printStackTrace();
		}
		return conn;
	}

}
