package com.kodnest.jdbc.ex4;
import java.sql.*;
class Program1 
{
	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
			String url = "jdbc:mysql://localhost:3306/jdbc_database1";
			String username = "root";
			String password = "Veeresh123";
			String query = "Update STUDENT set name='Ankit' where name='Ajay'";

			//Loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");

			//Establishing the connection
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established"+con);

			//Creating the statement using connection
			Statement stmt=con.createStatement();

			//Executing the query using statement
			stmt.executeUpdate(query);
			System.out.println("Query is executed");
		
	}

}
