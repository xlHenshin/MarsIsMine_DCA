package view;

import processing.core.PApplet;
import processing.core.PImage;

public class Gameplay {

	private PApplet app;
	private PImage game;
	
	public Gameplay(PApplet app) {
		
		this.app=app;
		game=app.loadImage("../Resources/map1.png");
	}
	
	public void drawScreen() {
		
		app.image(game, 0, 0);
	}
}
