package view;

import controller.ControllerScore;
import processing.core.PApplet;
import processing.core.PImage;

public class Lose {
	private PApplet app;
	private PImage screen;
	
	public Lose (PApplet app) {
		this.app = app;
		screen=app.loadImage("../Resources/lose.png");
	}
	
	public void drawScreen() {
		app.image(screen, 0, 0);
	}
	
	public void button() {
		
	}
}
