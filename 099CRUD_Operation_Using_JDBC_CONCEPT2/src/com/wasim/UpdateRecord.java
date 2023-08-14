package com.wasim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateRecord {

	public static void main(String[] args) {
		
		try {
			//Connect to DataBase
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_demo1","root","test");
			
			//Write Sql query for updating record
			Statement createStatement = connection.createStatement();
			createStatement.executeUpdate("Update registration SET mobile='1234432112' where email='mithu@gmail.com'");
			
			//Closing connection
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
