package model;

import java.text.SimpleDateFormat;
import java.util.Date;

import processing.core.PApplet;

public class Player {

	private PApplet app;
	
	private String name;
	private Date date;
	private String date2, time;
	
	public Player(String name, Date date, String time, PApplet app) {
		
		this.app=app;
		this.name=name;
		this.date=date;
		this.time=time;
		
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		date2 = formato.format(date);
	}
	
	public void drawData(int x, int y) {
		app.fill(0);
		app.text(name, x, y);
		app.text(date2, x+ 20*4, y );
		app.text(time, x+ 45*4, y );

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDate2() {
		return date2;
	}

	public void setDate2(String date2) {
		this.date2 = date2;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
	
}
