package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Revy {

	private PApplet app;
	private PImage revy;
	
	public Revy(PApplet app) {
		
		revy= app.loadImage("../Resources/revy1.png");
	}
}
