package com.ticketconfirmation.customconnection;

import java.sql.*;

import org.springframework.stereotype.Component;

@Component
public class jdbc_connection {


	String url = "jdbc:mysql://localhost:3306/movie_booking";
	String username = "root";
	String password = "plokij09@A";
	
	Connection connection ;
	
	public Connection getcustomconnection() {
				
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection(url,username,password);
			System.out.println("connection for confirmation_service is sucessful");				
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return connection ; 
		
	}
	
	
}
