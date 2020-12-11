package model;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

import processing.core.PApplet;

public class Player implements Comparable<Player> {

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
	
	public void drawData(int x, int y) {
		app.fill(0);
		app.textSize(15);
		app.text(name, x, y);
		app.text(date2, x+ 45*4, y );
		app.text(time, x+ 120*4, y );
		app.text(score, x+ 180*4, y);

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


	@Override
	public int compareTo(Player o) {
		
		return o.getScore()-this.score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
}
