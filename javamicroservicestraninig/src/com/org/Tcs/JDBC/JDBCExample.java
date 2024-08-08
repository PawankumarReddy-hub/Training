package com.org.Tcs.JDBC;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBCExample {
	
	private static final String URL="jdbc:mysql://localhost:3306/tcsDB";
	private static final String USER="root";
	private static final String PASSWORD="Root123$";
	
	public static Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection(URL,USER,PASSWORD);
	}

	public static void main(String[] args) 
	{
		
		try(Connection connection = getConnection())
		{
			if(connection!=null)
			{
				System.out.println("Connected to the database");
				 Statement stm = connection.createStatement();
				 PreparedStatement pre=null;
                 ResultSet rs = stm.executeQuery("Select * from student");
               while(rs.next()) {
                   System.out.println(rs.getInt(1)+"    " +rs.getString(2)+"        "+rs.getString(3)+"     "+rs.getString(4));
               }
//           String stmt="Insert into student values(27,'aditya',5000,'japanese')";
           String sql = "update student set subject='social' where id=57";
           String sql1="update student set fee=75000 where name='chinna'";
           pre = connection.prepareStatement(sql); 
           pre = connection.prepareStatement(sql1); 
//           pre=connection.prepareStatement(stmt);
           pre.execute();
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
