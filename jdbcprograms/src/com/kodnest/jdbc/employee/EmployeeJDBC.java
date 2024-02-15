package com.kodnest.jdbc.employee;
import java.sql.*;
import java.util.Scanner;
public class EmployeeJDBC 
{
	public static void insert(Statement stmt) throws Exception
	{
		String query = "INSERT INTO EMPLOYEE VALUES(1,'AJAY',35000),(2,'ANKIT',45000),(3,'AMIT',55000)";
		stmt.executeUpdate(query);
		System.out.println("row is inserted");
	}
	public static void update(Statement stmt) throws Exception
	{
		String query = "UPDATE EMPLOYEE SET SALARY=65000 WHERE ID=3";
		stmt.executeUpdate(query);
		System.out.println("row is updated");
	}
	public static void delete(Statement stmt) throws Exception
	{
		String query = "DELETE FROM EMPLOYEE WHERE ID=3";
		stmt.executeUpdate(query);
		System.out.println("row is deleted");
	}
	public static void select(Statement stmt) throws Exception
	{
		String query = "select * FROM EMPLOYEE";
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
	}
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/jdbc_database1";
		String username = "root";
		String password = "Veeresh123";
		
		//Driver is loaded
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Establishing the connection
		Connection con=DriverManager.getConnection(url, username, password);
		Statement stmt=con.createStatement();
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter 1 for insertion, 2 for update, 3 for delete, 4 for select and any other number to terminate");
			int choice=scan.nextInt();
			if(choice == 1)
			{
				insert(stmt);
			}
			else if(choice == 2)
			{
				update(stmt);
			}
			else if(choice == 3)
			{
				delete(stmt);
			}
			else if(choice == 4)
			{
				select(stmt);
			}
			else
			{
				System.out.println("Incorrect choice");
				System.exit(0);
			}
		}
	}

}
