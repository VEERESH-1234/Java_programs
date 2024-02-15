package com.kodnest.jdbc.queries;
import java.sql.*;
import java.util.Scanner;
public class ProgramJDBCApp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/jdbc_database1";
		String username = "root";
		String password = "Veeresh123";
		Connection con = null;
		try 
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter 1 for showtable,2 for creating,3 for read,4 for insert,5 for update,6 for delete");
			int choice = scan.nextInt();
			con = DriverManager.getConnection(url, username, password);
			switch(choice)
			{
			case 1:ProgramJDBC.showTable(con);
			break;
			case 2:ProgramJDBC.createTable(con);
			break;
			case 3:ProgramJDBC.read(con);
			break;
			case 4:ProgramJDBC.insert(con);
			break;
			case 5:ProgramJDBC.update(con);
			break;
			case 6:ProgramJDBC.delete(con);
			break;
			default:System.out.println("Incorrect choice");
			}
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
