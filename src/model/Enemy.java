package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Enemy implements Runnable  {
	
	private PApplet app;
	
	private PImage enemyLeft;
	private PImage enemyRight;
	
	private int posXEnemy;
	private int posYEnemy;
	private int speedEnemy;
	
	
	public Enemy (PApplet app , int posXEnemy, int posYEnemy) {
		
		this.app=app;
		this.posXEnemy=posXEnemy;
		this.posYEnemy=posYEnemy;
		
		
		enemyLeft=app.loadImage("../Resources/enemyleft.png");
		enemyRight=app.loadImage("../Resources/enemyreft.png");
		
		int speedEnemy = 2;
				
	} //CONSTRUCTOR
	
	public void moveEnemy () {
		
		
		
	}
	
	public void drawEnemy () {
		
		app.image(enemyLeft, posXEnemy, posYEnemy);

		app.image(enemyRight, posXEnemy, posYEnemy);
	}

	public int getPosXEnemy() {
		return posXEnemy;
	}

	public void setPosXEnemy(int posXEnemy) {
		this.posXEnemy = posXEnemy;
	}

	public int getPosYEnemy() {
		return posYEnemy;
	}

	public void setPosYEnemy(int posYEnemy) {
		this.posYEnemy = posYEnemy;
	}

	public int getSpeedEnemy() {
		return speedEnemy;
	}

	public void setSpeedEnemy(int speedEnemy) {
		this.speedEnemy = speedEnemy;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
} //CLASE
