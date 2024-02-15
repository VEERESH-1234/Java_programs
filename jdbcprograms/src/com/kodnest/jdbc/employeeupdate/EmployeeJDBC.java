package com.kodnest.jdbc.employeeupdate;
import java.sql.*;
import java.util.Scanner;
public class EmployeeJDBC {

	public static void main(String[] args) throws Exception
	{
		//values for url,username,and password for establishing the connection
		String url = "jdbc:mysql://localhost:3306/jdbc_database1";
		String username = "root";
		String password = "Veeresh123";
		//Taking the user input for id and salary to be updated in the table
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the id");
		int id = scan.nextInt();
		System.out.println("Enter the salary");
		int salary = scan.nextInt();
		//creating the query to be executed for dynamic data
		String query = "UPDATE EMPLOYEE SET SALARY=? WHERE ID=?";
		//Establishing the connection
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection is established");
		//Preparing the statement
		PreparedStatement pstmt = con.prepareStatement(query);
		//Completing the query to be executed
		pstmt.setInt(1, salary);
		pstmt.setInt(2, id);
		//Executing the query
		pstmt.executeUpdate();
		System.out.println("Row is updated");
	}

}
