package com.kodnest.jdbc.queries;
import java.sql.*;
import java.util.*;
public class ProgramJDBC 
{
	public static void showTable(Connection con)
	{
		try 
		{
			String query = "SHOW TABLES";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void createTable(Connection con)
	{
		showTable(con);
		try 
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the table name");
			String tableName = scan.next();
			String query = "CREATE TABLE "+tableName+" (ID INT,NAME VARCHAR(10))";
			Statement stmt = con.createStatement();
			stmt.execute(query);
			System.out.println("Table is created");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static void read(Connection con)
	{
		showTable(con);
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the table to retriev the data");
			String tableData = scan.next();
			String query = "SELECT * FROM "+tableData;
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			System.out.println("Table data is retrieved");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void insert(Connection con)
	{
		showTable(con);
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the tablename");
			String tableName = scan.next();
			System.out.println("Enter the id and name");
			int id = scan.nextInt();
			String name = scan.next();
			String query = "INSERT INTO "+tableName+" values("+id+",'"+name+"')";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("Insert query is executed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		read(con);
	}
	public static void update(Connection con)
	{
		showTable(con);
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the tablename to update the data");
			String tableName = scan.next();
			System.out.println("Enter the id and name to be updated");
			int id = scan.nextInt();
			String name = scan.next();
			String query = "UPDATE "+tableName+" SET NAME='"+name+"' WHERE ID="+id;
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
			System.out.println(tableName+" is updated");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		read(con);
	}
	public static void delete(Connection con)
	{
		showTable(con);
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the table name to delete the data");
			String tableName = scan.next();
			System.out.println("Enter the id to delete the row");
			int id =scan.nextInt();
			String query = "DELETE FROM "+tableName+" WHERE ID="+id;
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("Row is deleted from the table");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		read(con);
	}
}
