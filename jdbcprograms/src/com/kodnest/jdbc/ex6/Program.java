package com.kodnest.jdbc.ex6;
import java.sql.*;
public class Program {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/jdbc_database1";
		String username="root";
		String password="Veeresh123";
		String query="SELECT * FROM STUDENT";
		Connection con=DriverManager.getConnection(url, username, password);
		System.out.println("Connection is established"+con);
		Statement stmt=con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
	}

}
