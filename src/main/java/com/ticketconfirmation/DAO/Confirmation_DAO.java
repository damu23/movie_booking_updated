package com.ticketconfirmation.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ticketconfirmation.Entity.ConfirmationEntity;
import com.ticketconfirmation.Entity.get_confirmedTicket;
import com.ticketconfirmation.customconnection.jdbc_connection;

@Component
public class Confirmation_DAO {
	
	@Autowired
	jdbc_connection jdbcconnection ;
	
	
	public ConfirmationEntity saveticket(ConfirmationEntity confirmedticket	) {
	
		confirmedticket = getissuerDaetils_dao(confirmedticket);
		
		
	String query =
			"insert into ticket_confirmation (theaterid,moviename,movietime,seatnumber,theater_screen,name,phone,email) values (?,?,?,?,?,?,?,?)" ;
	                                           	
					try {
					
					PreparedStatement prst = jdbcconnection.getcustomconnection().prepareStatement(query);
					
					System.out.println("the following are under confirmation DAO ");
					
					prst.setInt(1, confirmedticket.getTheaterid());
					System.out.println("theaterid - "+ confirmedticket.getTheaterid());
					prst.setString(2, confirmedticket.getMoviename() );
					System.out.println (2 + " moviename - "+ confirmedticket.getMoviename());
					prst.setString(3, confirmedticket.getMovietime());
					System.out.println(3  + " movietime - "+confirmedticket.getMovietime());
					prst.setString(4, confirmedticket.getSeatnumber() );
					System.out.println(4  +" seatnumber - "+ confirmedticket.getSeatnumber());
					prst.setInt(5, confirmedticket.getTheater_screen() );
					System.out.println(5 +" theater_screen - "+ confirmedticket.getTheater_screen());
					prst.setString(6, confirmedticket.getName());
					System.out.println(6 +" Name- "+ confirmedticket.getName());
					prst.setInt(7, confirmedticket.getPhone());
					System.out.println(7 +" phone - "+ confirmedticket.getPhone());
					prst.setString(8, confirmedticket.getEmail_id() );
					System.out.println(8 +" emai- "+ confirmedticket.getEmail_id());

					prst.executeUpdate() ;
			        
					return confirmedticket ;
					
					
					}	
					catch(Exception e) {
						e.printStackTrace();
					}	
					
					throw new RuntimeException("Ticket not inserted");
	}

	
	public  List<get_confirmedTicket> getticket_foruser_DAO(String username) {
		
		
		String query = "select c.theaterid, c.moviename , c.movietime,c.seatnumber,c.name ,t.screen ,"
				+ "t.theatername  from ticket_confirmation as c inner join theater_screen as t"
				+ " on c.theater_screen = t.id where c.name = ? ";
				
		List<get_confirmedTicket> userticket_List = new ArrayList<>();
		  
		try {
			PreparedStatement prst = jdbcconnection.getcustomconnection().prepareStatement(query);
			
			prst.setString(1, username);
			
			ResultSet rs = prst.executeQuery();
			
			while(rs.next()) {
				
				get_confirmedTicket confirmedticket = new get_confirmedTicket();
				
				confirmedticket.setTheaterid(rs.getInt(1));
				confirmedticket.setMoviename(rs.getString(2));
				confirmedticket.setMovietime(rs.getString(3));
				confirmedticket.setSeatnumber(rs.getString(4));
				confirmedticket.setName(rs.getString(5));
				confirmedticket.setScreen(rs.getString(6));
				confirmedticket.setTheatername(rs.getString(7));
				
				userticket_List.add(confirmedticket);
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return userticket_List;
		
	}
	
	public ConfirmationEntity getissuerDaetils_dao(ConfirmationEntity confirmedticket	) {
		
		
		
		String query = "select name,email_id,phone from usermodel where name = ?" ;
		
		try {
			
			PreparedStatement prst = jdbcconnection.getcustomconnection().prepareStatement(query);
			
			prst.setString(1, confirmedticket.getName());
			
			ResultSet rs = prst.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(rs.getString(1))	;
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
				
			
				confirmedticket.setEmail_id(rs.getString(2));
				confirmedticket.setPhone(rs.getInt(3));				
				
			}
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		return confirmedticket;
		
	}
	
}
