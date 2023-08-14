package com.wasim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecord {

	public static void main(String[] args) {
		
		try {
			
			//Connect to Database
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_demo1","root","test");
			
			//Write sql query for deleting records
			Statement createStatement = connection.createStatement();
			createStatement.executeUpdate("Delete from registration where email='Email1'");
			
			//closing connection
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
