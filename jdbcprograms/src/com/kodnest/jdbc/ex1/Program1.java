package com.kodnest.jdbc.ex1;
//1. import java.sql package
import java.sql.*;
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String url = "jdbc:mysql://localhost:3306/jdbc_database1";
			String username = "root";
			String password = "Veeresh123";
			
			//2.Loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
			
			//3.Establishing the connection
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established at "+con);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
