package com.ticketconfirmation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.ticketconfirmation.Entity.ConfirmationEntity;
import com.ticketconfirmation.Entity.get_confirmedTicket;
import com.netflix.discovery.converters.Auto;
import com.ticketconfirmation.DAO.Confirmation_DAO;

@Service
public class ConfirmationServiceimpl  {


	
	@Autowired
	RestTemplate resttemplate;
	
	@Autowired
	Confirmation_DAO confirm_dao;	
	
	public ConfirmationEntity saveconfirmedticket(ConfirmationEntity confirmedticket) {
			
		
		
		int setTheater_screen = 0 ; 
		
		if(confirmedticket.getTheatername().equalsIgnoreCase("pvr") && confirmedticket.getScreen().equalsIgnoreCase("A1")) {
		setTheater_screen = 1 ;
	}
	if(confirmedticket.getTheatername().equalsIgnoreCase("pvr") && confirmedticket.getScreen().equalsIgnoreCase("A2")) {
		setTheater_screen = 2 ;
	}
	if(confirmedticket.getTheatername().equalsIgnoreCase("ags") && confirmedticket.getScreen().equalsIgnoreCase("A1")) {
		setTheater_screen = 3 ;
	}
	if(confirmedticket.getTheatername().equalsIgnoreCase("ags") && confirmedticket.getScreen().equalsIgnoreCase("A2")) {
		setTheater_screen = 4 ;
	}
	if(confirmedticket.getTheatername().equalsIgnoreCase("inox") && confirmedticket.getScreen().equalsIgnoreCase("A1")) {
		setTheater_screen = 5 ;
	}
	if(confirmedticket.getTheatername().equalsIgnoreCase("inox") && confirmedticket.getScreen().equalsIgnoreCase("A2")) {
		setTheater_screen = 6 ;
	}

//	System.out.println("the following are confimation under service layer ");
//	
//		System.out.println("Theaterid  - " + confirmedticket.getTheaterid());
//		System.out.println("Moviename -" +confirmedticket.getMoviename());
//		System.out.println("Movietime  -" + confirmedticket.getMovietime());
//		System.out.println("Seatnumber  -" + confirmedticket.getSeatnumber());
//		System.out.println("Theater_screen  -" + confirmedticket.getTheater_screen());
//		System.out.println("Name -" + confirmedticket.getName());
//		System.out.println("email - " + confirmedticket.getEmail_id());
//		System.out.println("screen - "+ confirmedticket.getScreen());
//		System.out.println("theatername - "+ confirmedticket.getTheatername());
//		System.out.println("phone - " + confirmedticket.getPhone());
		
	confirmedticket.setTheater_screen(setTheater_screen);
	
//		HttpHeaders headers = new HttpHeaders();
//		headers.setContentType(MediaType.APPLICATION_JSON);
//		
//		HttpEntity<?> htpentity = new HttpEntity<Object>(confirmedticket,headers);
//		
//		try {
//		resttemplate.exchange
//		("http://AVAILABLITY-SERVICE/availablitychecker/insertbooking", 
//				HttpMethod.POST,htpentity,ConfirmationEntity.class);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
				return confirm_dao.saveticket(confirmedticket);
				
	}

	public List<get_confirmedTicket> getticket_foruser(String username) {
		
	return	confirm_dao.getticket_foruser_DAO(username);
		
	}

}
