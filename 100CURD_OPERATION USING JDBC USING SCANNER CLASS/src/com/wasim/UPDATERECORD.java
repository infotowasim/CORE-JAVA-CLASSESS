package com.wasim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class UPDATERECORD {

	public static void main(String[] args) {
		
		try {
			//SCANNER CLASS
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Enter the email:");
			String email = scanner.next();
			
			System.out.println("Updated nimber of mobile:");
			String mobile = scanner.next();
			
			//Connect to database
		    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_demo1","root","test");
		    
		    //Write the Sql query for updating records
		    Statement createStatement = connection.createStatement();
		    createStatement.executeUpdate("update registration set mobile='"+mobile+"' where email='"+email+"' ");
		    
			//Closing the connection
		    connection.close();
		    
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
