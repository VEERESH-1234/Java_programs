package com.kodnest.jdbc.employee1userinputinsert;
import java.sql.*;
import java.util.Scanner;
public class EmployeeJDBC1 {

	public static void main(String[] args) throws Exception
	{
		//values for url,username and password for establishing the connection
		String url="jdbc:mysql://localhost:3306/jdbc_database1";
		String username="root";
		String password="Veeresh123";
		//Taking user input for id,name and salary to be inserted in the table
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the id");
		int id=scan.nextInt();
		System.out.println("Enter the name");
		String name=scan.next();
		System.out.println("Enter the salary");
		int salary=scan.nextInt();
		//creating the query to be executed for dynamic data
		String query="INSERT INTO EMPLOYEE VALUES(?,?,?)";//query with placeholders
		//Establishing the connection
		Connection con=DriverManager.getConnection(url, username, password);
		System.out.println("Connection is established");
		//preparing the statement
		PreparedStatement pstmt = con.prepareStatement(query);
		//completing the query to be executed
		pstmt.setInt(1, id);//pstmt.setInt(placeholder index,value)
		pstmt.setString(2, name);//pstmt.setString(placeholder index,value)
		pstmt.setInt(3, salary);//pstmt.setInt(placeholder index,value)
		//Executing the query
		pstmt.executeUpdate();
		System.out.println("row is inserted");
	}

}
