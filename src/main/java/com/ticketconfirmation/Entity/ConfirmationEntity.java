package com.ticketconfirmation.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class ConfirmationEntity {

	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
    
	private int theaterid ;	    
	private String name;
	private String email_id ;
	private int phone ;
	private String moviename ;
	private String movietime ;	
	private String seatnumber ;
    private String screen ;
    private String theatername ;
    private int theater_screen ;	  
	
	public ConfirmationEntity() {
		super();
	}

	public ConfirmationEntity(int theaterid, String name, String email_id, int phone, String moviename,
			String movietime, String seatnumber, String screen, String theatername, int theater_screen) {
		super();
		this.theaterid = theaterid;
		this.name = name;
		this.email_id = email_id;
		this.phone = phone;
		this.moviename = moviename;
		this.movietime = movietime;
		this.seatnumber = seatnumber;
		this.screen = screen;
		this.theatername = theatername;
		this.theater_screen = theater_screen;
	}

	public int getTheaterid() {
		return theaterid;
	}

	public void setTheaterid(int theaterid) {
		this.theaterid = theaterid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getMovietime() {
		return movietime;
	}

	public void setMovietime(String movietime) {
		this.movietime = movietime;
	}

	public String getSeatnumber() {
		return seatnumber;
	}

	public void setSeatnumber(String seatnumber) {
		this.seatnumber = seatnumber;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public String getTheatername() {
		return theatername;
	}

	public void setTheatername(String theatername) {
		this.theatername = theatername;
	}

	public int getTheater_screen() {
		return theater_screen;
	}

	public void setTheater_screen(int theater_screen) {
		this.theater_screen = theater_screen;
	}

	
	
	
	


}
