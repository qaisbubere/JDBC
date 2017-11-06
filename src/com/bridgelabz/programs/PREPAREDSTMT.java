
package com.bridgelabz.programs;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class PREPAREDSTMT {

	public static void main(String arg[]) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection object = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Mydatabase","root","shezan95");
		PreparedStatement pst = (PreparedStatement) object.prepareStatement("insert into new_table values(?,?,?)");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your name");
		String name = sc.next();
		
		System.out.println("enter your age");
		int age = sc.nextInt();
		
		System.out.println("enter your salary");
		int sal = sc.nextInt();
		
		pst.setString(1, name);
		pst.setInt(2, age);
		pst.setInt(3, sal);
		pst.executeUpdate();
		
		System.out.println("record entered");
		pst.close();
		object.close();
	}
}

