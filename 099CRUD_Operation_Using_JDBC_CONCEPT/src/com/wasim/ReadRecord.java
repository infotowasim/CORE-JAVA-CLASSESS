package com.wasim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadRecord {

	public static void main(String[] args) {
		
		try {
			
			//Connect to Database.
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_demo1","root","test");
		
			//Write SQL Query to Insert or Create Record.
			Statement createStatement = connection.createStatement();
			ResultSet resultSet = createStatement.executeQuery("Select * from registration");
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1)); // for 1st row 
				System.out.println(resultSet.getString(2)); // for 2nd row
				System.out.println(resultSet.getString(3)); // for 3rd row
				System.out.println(resultSet.getString(4)); // for 4th row
			}
			
		    //Close the Connection.
			connection.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		

	}

}
