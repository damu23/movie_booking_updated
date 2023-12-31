package com.ticketconfirmation.Entity;

public class get_confirmedTicket {

	
	private int theaterid ;	    
	private String moviename ;
	private String movietime ;	
	private String seatnumber ;
    private String screen ;
    private String theatername ;
    private String name;
    
	public get_confirmedTicket() {
		super();
		
	}

	public get_confirmedTicket(int theaterid, String moviename, String movietime, String seatnumber, String screen,
			String theatername, String name) {
		super();
		this.theaterid = theaterid;
		this.moviename = moviename;
		this.movietime = movietime;
		this.seatnumber = seatnumber;
		this.screen = screen;
		this.theatername = theatername;
		this.name = name;
	}

	public int getTheaterid() {
		return theaterid;
	}

	public void setTheaterid(int theaterid) {
		this.theaterid = theaterid;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
