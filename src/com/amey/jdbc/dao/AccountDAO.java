package com.amey.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDAO {
	
	
	public static void main(String[] args) {
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "test");
		 System.out.println(connection);
		 Statement statement=connection.createStatement();
	
		 int result = statement.executeUpdate("insert into account values(1,'Patki','Amey',10000)");
		 //int result1 = statement.executeUpdate("insert into account values(2,'Dhanture','Shubham',20000)");
		 System.out.println(result+"rows got inserted");
		// System.out.println(result1+"rows affected");
		// int result = statement.executeUpdate("delete from account where accno=1");
		 //System.out.println(result+"rows are affected");
		 ResultSet rs= statement.executeQuery("select * from account");
		 while(rs.next()) {
			 System.out.println(rs.getString(2));
			 System.out.println(rs.getString(3));
			 System.out.println(rs.getInt(4));
		 }
		 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
