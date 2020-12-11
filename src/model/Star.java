package model;

import processing.core.PApplet;
import processing.core.PImage;


public class Star {

	private PApplet app;

	private PImage star;

	private int posXStar;
	private int posYStar;

	public Star (PApplet app , int posXStar, int posYStar) {

		this.app=app;

		this.posXStar=posXStar;
		this.posYStar=posYStar;

		star=app.loadImage("../Resources/STAR.png");
	} //CONSTRUCTOR

	public void draw () {

		app.image(star, posXStar, posYStar);	


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

} // STAR
