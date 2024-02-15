package com.kodnest.jdbc.ex7;
import java.sql.*;
public class DBHandler 
{
	public static void insert(Connection con,int rollNo,String name,int age)
	{
		String query = "INSERT INTO STUDENT2 VALUES(?,?,?)";
		try 
		{
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, rollNo);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			pstmt.executeUpdate();
			System.out.println("Rows are inserted");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
