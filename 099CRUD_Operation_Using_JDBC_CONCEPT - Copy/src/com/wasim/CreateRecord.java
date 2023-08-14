package com.wasim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateRecord {

	public static void main(String[] args) {
		
		try {
			
			//Connect to Database.
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_demo1","root","test");
		
			//Write SQL Query to Insert or Create Record.
			Statement createStatement = connection.createStatement();
			createStatement.executeUpdate("insert into registration values ('Boni','Lalbagh','boni@gmail.com',9999922222)");
			
		    //Close the Connection.
			connection.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		

	}

}
