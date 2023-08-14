package com.wasim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class CREATERECORD {

	public static void main(String[] args) {
		
		//USING SCANNER CLASS:-user give input and its directly added into the database.
		
		
		try {
			//Scanner class 
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Enter your name:");
			String name = scanner.next();
			
			System.out.println("Enter the city:");
			String city = scanner.next();
			
			System.out.println("Enter the email:");
			String email = scanner.next();
			
			System.out.println("Enter your mobile:");
			String mobile = scanner.next();
			
			//Connect to database
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_demo1","root","test");
			
			//write the sql query for creating record
			Statement createStatement = connection.createStatement();
			createStatement.executeUpdate("insert into registration values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
			
			//closing connection
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			
		}

	}

}
