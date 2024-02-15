package com.kodnest.jdbc.multiplerowsinserting;
import java.sql.*;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/jdbc_database1";
		String username = "root";
		String password = "Veeresh123";
		System.out.println("Enter the number of rows to be inserted");
		int row = scan.nextInt();
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection is established");
		for(int i=1;i<=row;i++)
		{
			String query = "INSERT INTO EMPLOYEE VALUES(?,?,?)";
			System.out.println("Enter the id,name,salary");
			int id = scan.nextInt();
			String name = scan.next();
			int salary = scan.nextInt();
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3,salary);
			pstmt.executeUpdate();
		}
		System.out.println(row+" Row is inserted");
	}

}
