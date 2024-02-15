package revisions;

import java.sql.*;

public class revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			String url = "jdbc:mysql://localhost:3306/jdbc_database1";
			String username = "root";
			String password = "Veeresh123";
			String query = "UPDATE EMPLOYEE SET SALARY=((SALARY*0.1)+SALARY) WHERE ID=11";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
				System.out.println("Id"+rs.getInt(1)+"name"+rs.getString(2)+"salary"+rs.getInt(3));
			}
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
