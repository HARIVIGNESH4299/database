package com.pizzahut.dao;

import java.sql.Statement;
import java.sql.Connection;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pizzahut.model.User;
public class Userdao {
	
	public static void insert(User users) {
		ConnectionUtill con=new ConnectionUtill();
		String query="insert into users(user_name,phonenumber,email,address,password)values(?,?,?,?,?)";
			Connection c=con.getDbconnection();
			PreparedStatement pstmt = null;
			try {
				pstmt = c.prepareStatement(query);
				pstmt.setString(1, users.getUsername());
				pstmt.setLong(2, users.getPhonenumber());
				pstmt.setString(3, users.getEmail());
				pstmt.setString(4, users.getAddress());
				pstmt.setString(5, users.getPassword());
				int i=pstmt.executeUpdate();
				System.out.println(i+" row inserted");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Value not Setted in the query");

			}
	}


	public static  User validateUser(String emailid) {
		ConnectionUtill con=new ConnectionUtill();
		Connection c=con.getDbconnection();
		String query="select * from users where email='"+emailid+"'";
		User user=null;
		try {
			Statement stmt=c.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			if(rs.next())
			{	
			user=new User(rs.getString(2),emailid);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(" statement error");
		}
		return user;
		// TODO Auto-generated method stub
		
	}
}
