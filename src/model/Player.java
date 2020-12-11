package model;

import java.text.SimpleDateFormat;
import java.util.Date;

import processing.core.PApplet;

public class Player {

	private PApplet app;
	
	private String name;
	private Date date;
	private String date2, time;
	private int score;
 	
	public Player(String name, Date date, String time, int score,PApplet app) {
		this.score=score;
		this.app=app;
		this.name=name;
		this.date=date;
		this.time=time;
		
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		date2 = formato.format(date);
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
