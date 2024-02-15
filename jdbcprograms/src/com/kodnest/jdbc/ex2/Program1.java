package com.kodnest.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String url = "jdbc:mysql://localhost:3306/jdbc_database1";
			String username = "root";
			String password = "Veeresh123";
			String query="CREATE TABLE STUDENT(ROLL INT,NAME VARCHAR(10))";

			//Establishing the connection
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established at "+con);
			
			//Creating the statement using connection
			Statement stmt=con.createStatement();
			
			//Executing the query using statement
			stmt.execute(query);
			System.out.println("Query is executed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
