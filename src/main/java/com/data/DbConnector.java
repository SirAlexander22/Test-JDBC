package com.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {
	
	public static Connection connectToDb() throws SQLException {
		String host = "172.16.73.128";
		int port = 3306;
		String database = "addressBook";
		String userName = "alex";
		String password = "R505afe#";
		String url = String.format("jdbc:mysql://%s:%d/%s?allowPublicKeyRetrieval=true&useSSL=false", host, port, database);
		return DriverManager.getConnection(url, userName, password);
	}
	
//	public static Connection connectToDb() throws SQLException {
//		//jdbc:mysql://172.16.192.130:3303/addressBook?allowPublicKeyRetrieval=true&amp;useSSL=false&amp;useUnicode=true&amp;characterEncoding=utf8
//		String url = "jdbc:mysql://172.16.192.130:3306/";
//		String database = "addressBook";
//		//String username = "alex";
//		//String password = "R505afe#";
//		String username = "root";
//		String password = "Vpp8d24q#";
//		return DriverManager.getConnection(url+database, username, password);
//	}

}
