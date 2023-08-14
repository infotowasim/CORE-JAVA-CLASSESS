package com.wasim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadRecord {

	public static void main(String[] args) {
		
		try {
			//Connect to Database
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_demo1","root","test");
			
			//Write SQL query for reading the records.
			Statement createStatement = connection.createStatement();
			ResultSet resultSet = createStatement.executeQuery("Select * from registration");
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getString(4));
				System.out.println("---------------------------");
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
