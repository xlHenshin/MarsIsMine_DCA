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
	private int dir;
	
	
	public Enemy (PApplet app , int posXEnemy, int posYEnemy, int dir) {
		
		this.app=app;
		this.posXEnemy=posXEnemy;
		this.posYEnemy=posYEnemy;
		this.dir=dir;
		
		
		enemyLeft=app.loadImage("../Resources/enemyleft.png");
		enemyRight=app.loadImage("../Resources/enemyright.png");
		
		int speedEnemy = 2;
				
	} //CONSTRUCTOR
	
	public void moveEnemy () {
		
		posXEnemy+=speedEnemy*dir;
		
		if (posYEnemy==183) {
			
			if (posXEnemy>= 1173 || posXEnemy<= 816) {
				dir*=-1;
			}
		}
		
		if (posYEnemy==450) {
			
			if (posXEnemy>= 1518 || posXEnemy<= 987) {
				dir*=-1;
			}
		}
		
		if (posYEnemy==183) {
			
			if (posXEnemy>= 1716 || posXEnemy<= 1359) {
				dir*=-1;
			}
		}
		
		if (posYEnemy==148) {
			
			if (posXEnemy>= 2260 || posXEnemy<= 1903) {
				dir*=-1;
			}
		}
		
		if (posYEnemy==450) {
			
			if (posXEnemy>= 2757 || posXEnemy<= 2146) {
				dir*=-1;
			}
		}
		
	}
	
	public void drawEnemy () {
		
		if (dir==-1) {
			
			app.image(enemyLeft, posXEnemy, posYEnemy);
		}
		
		if (dir==1) {
			app.image(enemyRight, posXEnemy, posYEnemy);
		}
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
		moveEnemy();
	}
	
} //CLASE
