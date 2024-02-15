package com.kodnest.jdbc.banktransaction;
import java.sql.*;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/jdbc_database1";
		String username = "root";
		String password = "Veeresh123";
		Connection con = null;
		String query1 = null;
		String query2 = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		Scanner scan = null;
		try
		{
			//Establishing the connection
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established");
			//step:1 setting auto commit status as false
			con.setAutoCommit(false);
			//creating the query to reduce amount from accno=11
			query1 = "UPDATE BANK SET BALANCE=BALANCE-? WHERE ACCNO=11";
			//creating the query to add amount in accno=13
			query2 = "UPDATE BANK SET BALANCE=BALANCE+? WHERE ACCNO=13";
			scan = new Scanner(System.in);
			System.out.println("Enter the amount to be given");
			int amount = scan.nextInt();
			//Preparing the statement
			pstmt1 = con.prepareStatement(query1);
			pstmt1.setInt(1, amount);
			//Preparing the statement
			pstmt2 = con.prepareStatement(query2);
			pstmt2.setInt(1, amount);
			//Executing the first query
			pstmt1.executeUpdate();
			//Executing the second query
			pstmt2.executeUpdate();
			System.out.println("Amount is credited in accno=13");
			//step:2 committing the changes after executing all the queries
			con.commit();
		}
		catch(Exception e)
		{
			try 
			{
				//step:3 Rolling back the changes if any problem happened
				con.rollback();
				System.out.println("Changes are rolled back");
			}
			catch (Exception e1) 
			{
				e1.printStackTrace();
			}
		}
		finally
		{
			try 
			{
				scan.close();
				con.close();
				pstmt1.close();
				pstmt2.close();
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
