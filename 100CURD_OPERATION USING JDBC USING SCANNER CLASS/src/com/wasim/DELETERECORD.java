package com.wasim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DELETERECORD {

	public static void main(String[] args) {
		
		
		try {
			//SCANNER CLASS
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Enter the email:");
			String email = scanner.next();
			
			//Connect to Database
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_demo1","root","test");
			
			//Write the SQL query for deleting the record
			Statement createStatement = connection.createStatement();
			createStatement.executeUpdate("delete from registration where email='"+email+"'");
			
			//closing connection
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
