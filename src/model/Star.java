package model;

import processing.core.PApplet;
import processing.core.PImage;


public class Star {

	private PApplet app;

	private PImage star;

	private int posXStar;
	private int posYStar;
	private int moveX;
	private boolean moveXStar;

	public Star(PApplet app , int posXStar, int posYStar) {

		this.app=app;

		this.posXStar=posXStar;
		this.posYStar=posYStar;
		
		moveXStar= false;

		star=app.loadImage("../Resources/STAR.png");
	} //CONSTRUCTOR

	public void draw () {

		app.image(star, posXStar, posYStar);	

		if (moveXStar == true) {
			posXStar = posXStar - 11;
			System.out.println(posXStar);
		}	

	} 

	public int getposXStar () {
		return posXStar;
	}
	public void setPosXStar () {
		this.posXStar = posXStar;
	}
	public int getposYStar () {
		return posYStar;
	}
	
	public void setPosYStar () {
		this.posYStar = posYStar;
	}

	public boolean isMoveXStar() {
		return moveXStar;
	}

	public void setMoveXStar(boolean moveXStar) {
		this.moveXStar = moveXStar;
	}
	
	

} // STAR
