package model;

import java.util.Date;

import processing.core.PApplet;

public class Player {

	private PApplet app;
	
	private String name;
	private Date date;
	private String date2, time;
	
	public Player(String name, PApplet app) {
		
		this.app=app;
		this.name=name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
