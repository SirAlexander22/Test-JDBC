package com.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://172.16.73.137:5432/";		
		String userName = "postgres";
		String password = "postgres";
		
		try(Connection connection = DriverManager.getConnection(url+"postgres", userName, password)){
			System.out.println("Database connection: Successful");
		}catch (Exception e) {
			System.out.println("Database connection: Failed");
			e.printStackTrace();
		}

	}

}
