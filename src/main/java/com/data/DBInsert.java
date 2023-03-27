package com.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DBInsert {

	public static void main(String[] args) {
		
		String sql = "INSERT INTO contact(firstName, lastName, email, phoneNo) VALUES('Pablo', 'Gallardo', 'pablo@gmail.com','+525557898232')"; 
		
		try(Connection connection = DbConnector.connectToDb();
				PreparedStatement ps = connection.prepareStatement(sql)){
			int result = ps.executeUpdate();
			System.out.println("Devuelve el recuento de filas o 0 si no tiene éxito");
			if( result > 0 ) {
				System.out.println("-- Record created --  "+result);
			}else {
				System.out.println("!! Record NOT Created !!");
			}
		}catch (SQLException ex) {
			System.err.println("Error connecting to database server");
			System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}

	}
	
//public static void main(String[] args) {
//		
//		String sql = "INSERT INTO contact VALUES('Pablo', 'Gallardo', 'pablo@gmail.com','+525557898232')"; 
//		
//		try(Connection connection = DbConnector.connectToDb();
//				PreparedStatement ps = connection.prepareStatement(sql)){
//			
//		}catch (SQLException ex) {
//			System.err.println("Error connecting to database server");
//			System.out.println("SQLException: " + ex.getMessage());
//		    System.out.println("SQLState: " + ex.getSQLState());
//		    System.out.println("VendorError: " + ex.getErrorCode());
//		}
//
//	}


}
