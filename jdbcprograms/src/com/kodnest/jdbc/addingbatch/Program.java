package com.kodnest.jdbc.addingbatch;
import java.sql.*;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/jdbc_database1";
		String username = "root";
		String password = "Veeresh123";
		Connection con = null;
		String query = null;
		PreparedStatement pstmt = null;
		Scanner scan = null;
		int id = 0;
		String name = null;
		int salary = 0;
		try
		{
			//Establishing the connection
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established");
			//Creating the query
			query = "INSERT INTO EMPLOYEE VALUES(?,?,?)";
			pstmt = con.prepareStatement(query);
			scan = new Scanner(System.in);
			System.out.println("Enter the number of rows to be inserted");
			int rows = scan.nextInt();
			//taking the user input and adding it to batch
			for(int i=1;i<=rows;i++)
			{
				System.out.println("Enter id");
				id = scan.nextInt();
				System.out.println("Enter name");
				name = scan.next();
				System.out.println("Enter salary");
				salary = scan.nextInt();
				//Completing the query
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setInt(3, salary);
				//Adding the data to batch
				pstmt.addBatch();
			}
			//Executing the batch 
			pstmt.executeBatch();
			System.out.println("Rows are inserted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				scan.close();
				con.close();
				pstmt.close();
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
