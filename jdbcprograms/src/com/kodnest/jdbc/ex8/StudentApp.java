package com.kodnest.jdbc.ex8;
import java.sql.*;
public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/jdbc_database1";
		String username = "root";
		String password = "Veeresh123";
		Connection con = null;
		try 
		{
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established");
			Student st1 = new Student();
			DBHandler.insert(con, st1.getRollNo(), st1.getName(), st1.getAge());
			Student st2 = new Student();
			DBHandler.insert(con, st2.getRollNo(), st2.getName(), st2.getAge());
			Student st3 = new Student();
			DBHandler.insert(con, st3.getRollNo(), st3.getName(), st3.getAge());
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
