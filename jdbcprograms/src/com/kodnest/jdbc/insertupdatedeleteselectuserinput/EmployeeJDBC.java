package com.kodnest.jdbc.insertupdatedeleteselectuserinput;
import java.sql.*;
import java.util.Scanner;
public class EmployeeJDBC 
{
	//Method to insert the row in the database
	public static void insert(Connection con) throws Exception
	{
		Scanner scan=new Scanner(System.in);
		String query = "INSERT INTO EMPLOYEE VALUES(?,?,?)";
		System.out.println("Enter the id,name,salary to be inserted");
		int id=scan.nextInt();
		String name=scan.next();
		int salary=scan.nextInt();
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1,id);
		pstmt.setString(2, name);
		pstmt.setInt(3,salary);
		pstmt.executeUpdate();
		System.out.println("Row is inserted");
	}
	//Method to update the row in the database
	public static void update(Connection con) throws Exception
	{
		Scanner scan=new Scanner(System.in);
		String query = "UPDATE EMPLOYEE SET SALARY=? WHERE ID=?";
		System.out.println("Enter the salary and id to be updated in the table");
		int salary=scan.nextInt();
		int id=scan.nextInt();
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1, salary);
		pstmt.setInt(2, id);
		pstmt.executeUpdate();
		System.out.println("Row is updated");
	}
	//Method to delete the row in the database
	public static void delete(Connection con) throws Exception
	{
		Scanner scan=new Scanner(System.in);
		String query = "DELETE FROM EMPLOYEE WHERE ID=?";
		System.out.println("Enter the id to be delete the row ");
		int id=scan.nextInt();
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setInt(1, id);
		pstmt.executeUpdate();
		System.out.println("Row is deleted");
	}
	//Method to select the rows in the database
	public static void select(Connection con) throws Exception
	{
		Scanner scan=new Scanner(System.in);
		String query = "SELECT * FROM EMPLOYEE WHERE ID=?";
		System.out.println("Enter the id to be selected");
		int id=scan.nextInt();
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
	}
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/jdbc_database1";
		String username="root";
		String password="Veeresh123";
		Connection con=DriverManager.getConnection(url, username, password);
		System.out.println("Connection is established");
		while(true)
		{
			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			if(choice == 1)
			{
				insert(con);
			}
			else if(choice == 2)
			{
				update(con);
			}
			else if(choice == 3)
			{
				delete(con);
			}
			else if(choice == 4)
			{
				select(con);
			}
			else
			{
				System.out.println("Incorrect choice");
				System.exit(0);
			}
		}
	}

}
