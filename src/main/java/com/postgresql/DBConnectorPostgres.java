package com.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectorPostgres {
	
	public static Connection connectToDb() throws SQLException {
		String url = "jdbc:postgresql://172.16.192.128:5432/";		
		String database = "Test-Prueba";
		String userName = "postgres";
		String password = "postgres";
		
		return DriverManager.getConnection(url+database, userName, password);
	}

}
