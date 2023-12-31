package com.ticketconfirmation.Controller;

import java.sql.PreparedStatement;
import java.util.* ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticketconfirmation.Entity.ConfirmationEntity;
import com.ticketconfirmation.Entity.get_confirmedTicket;
import com.ticketconfirmation.Service.ConfirmationServiceimpl;
import com.ticketconfirmation.customconnection.jdbc_connection;

@RestController
@RequestMapping("/confirmation")
public class ConfirmationController {
	
    @Autowired
    ConfirmationServiceimpl confirmationservice;
    
    @Autowired
    jdbc_connection jdbcconnection ;
    
    

	@PostMapping("/confirmedticket")
	public ConfirmationEntity 	ticketconfirmation(@RequestBody  ConfirmationEntity confirmedticket ) {
		
		System.out.println("into confirm ticket ");
		

		
		System.out.println(" ******************  the following are inside the controller");
System.out.println("Theaterid - " + confirmedticket.getTheaterid());
System.out.println("Moviename  - " +confirmedticket.getMoviename());
System.out.println("Movietime - " + confirmedticket.getMovietime());
System.out.println("Seatnumber - " + confirmedticket.getSeatnumber());
System.out.println("Theater_screen  -" + confirmedticket.getTheater_screen());
System.out.println("Name - " + confirmedticket.getName());
System.out.println("email - " + confirmedticket.getEmail_id());
System.out.println("NAME - " + confirmedticket.getPhone());
System.out.println("                  ");
System.out.println("                  ");



	   return confirmationservice.saveconfirmedticket(confirmedticket);
		
	}
	
	@PostMapping("/getconfirmedticket")
	public List<get_confirmedTicket> getticket_foruser(@RequestBody String username) {
		
		return confirmationservice.getticket_foruser(username);
		
	}
	
	
	
	
	
}
