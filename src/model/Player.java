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
		
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
		date2 = formato.format(date);
	}
	
	public void drawData(int x, int y) {
		app.fill(0);
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

	
	 public static class Comparators {

	        public static Comparator<Player> SCORE = new Comparator<Player>() {
	            @Override
	            public int compare(Player o1, Player o2) {
	                return o1.score-o2.score;
	            }
	        };
	        
	        public static Comparator<Player> NAME = new Comparator<Player>() {
	            @Override
	            public int compare(Player o1, Player o2) {
	                return o1.name.compareTo(o2.name);
	            }
	        };
	        
	        public static Comparator<Player> TIME = new Comparator<Player>() {
	            @Override
	            public int compare(Player o1, Player o2) {
	                return o1.time.compareTo(o2.time);
	            }
	        };
	        public static Comparator<Player> DATE = new Comparator<Player>() {
	            @Override
	            public int compare(Player o1, Player o2) {
	                return o1.date2.compareTo(o2.date2);
	            }
	        };
	       
    };
	



	@Override
	public int compareTo(Player o) {
		
		return Comparators.SCORE.compare(this, o);
	}
	 }
