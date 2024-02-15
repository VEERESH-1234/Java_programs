package com.kodnest.jdbc.ex7;
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
			Student st1 = new Student(11,"Ajay",22);
			DBHandler.insert(con, st1.rollNo, st1.name, st1.age);
			Student st2 = new Student(12,"Amit",23);
			DBHandler.insert(con, st2.rollNo, st2.name, st2.age);
			Student st3 = new Student(13,"Ankit",24);
			DBHandler.insert(con, st3.rollNo, st3.name, st3.age);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
