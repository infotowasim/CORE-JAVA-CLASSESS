package com.wasim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateRecord {

	public static void main(String[] args) {
		try {

			// Connect to Database

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_demo1","root",
					"test");

			// Write SQL query for Inserting or creating record.

			Statement createStatement = connection.createStatement();
			createStatement.executeUpdate("insert into registration values('Name1','City1','Email1','PhnNo1')");

			// Closing connection
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

//Statement:- It help us to execute the Static SQL statement and returning the result it produces.

//Connection:- A connection (session) with a specific database. SQL statements are executed and results are returned within the context of a connection.

//executeUpdate():- Executes the given SQL statement, which may be an INSERT, UPDATE, or DELETE statement or anSQL statement that returns nothing, such as an SQL DDL statement.
