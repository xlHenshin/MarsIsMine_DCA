package model;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;


public class Revy extends Thread {

	private PApplet app;
	private PImage revy;

	private int floor;
	private int height;
	private int width;
	private int winX;
	private PVector position;
	private PVector vel;
	private PVector cc;
	private boolean jump;
	private int health;
	private int status;
	private int key;
	private int speed;
	private boolean move;

	public Revy(int x, int y,PApplet app) {

		revy= app.loadImage("../Resources/revy1.png");
		position= new PVector(x,y);
		vel= new PVector(0,0);
		cc= new PVector(0,0);
		floor= 500;
		height=40;
		jump=false;
		this.app = app;
		speed=2;
		move= false;
	}

	@Override
	public void run() {
		move();
		try {
			sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void draw() {
		cc.y= 3.5f;
		if(position.x<=-1 || position.x>=1190) {
			cc.x *=-1;
			vel.x*=-1;
		}

		app.image(revy, position.x, position.y);
		position.add(vel);
		vel.add(cc);


		if(vel.x>-1 && vel.x<1) {
			cc.x=0;
			vel.x=0;
		}

		if(position.y>=floor-height-5) {
			jump=false;
			position.y=floor-height;
			vel.y=0;
			cc.y=0;
		}
	}

	public void move() {
		notMove();
		if (move == true) {

			if(key==37) {
				vel.x=-8;
				cc.x=0.5f;
			}

			if(key==39) {
				vel.x=8;
				cc.x=-0.5f;
			}

			if(key==38 && jump==false) {
				jump=true;
				vel.y=-40;
			}
		}
	}

	public void notMove() {

		if (key==37 ||key==39 || key==38 ) {
			move=true;
		}else {
			move = false; 
		}
	}


	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public PImage getRevy() {
		return revy;
	}

	public void setRevy(PImage revy) {
		this.revy = revy;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWinX() {
		return winX;
	}

	public void setWinX(int winX) {
		this.winX = winX;
	}

	public PVector getPosition() {
		return position;
	}

	public void setPosition(PVector position) {
		this.position = position;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int c) {
		this.key = c;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}













