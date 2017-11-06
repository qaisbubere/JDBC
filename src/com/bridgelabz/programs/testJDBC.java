package com.bridgelabz.programs;

import java.net.ConnectException;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class testJDBC {

	public static void main(String arg[]) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection object = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Mydatabase","root","shezan95");
		Statement stmt = (Statement) object.createStatement();
		ResultSet rs = (ResultSet) stmt.executeQuery("select * from new_table");
		
		while(rs.next()){
			System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3));
		}
		object.close();
	}
}
