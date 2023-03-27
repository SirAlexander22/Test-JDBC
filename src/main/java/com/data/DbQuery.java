package com.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbQuery {
	
	public static void main(String[] args) {
		try(Connection connection = DbConnector.connectToDb();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM contact")){
			while(resultSet.next()) {
				System.out.println("id: "+resultSet.getInt("id")+" firsName: "+resultSet.getString("firstName"));
			}
		}catch (SQLException ex) {
			System.err.println("Error connecting to database server");
			System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
	}

}