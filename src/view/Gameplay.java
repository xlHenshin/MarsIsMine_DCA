package view;

import controller.Controller;
import processing.core.PApplet;
import processing.core.PImage;

public class Gameplay {

	private PApplet app;
	private PImage game;
	private Controller controlGame;
	private int posX;
	
	public Gameplay(PApplet app) {
		this.app=app;
		controlGame = new Controller(app);
		game=app.loadImage("../Resources/map1.png");
		
		posX=0;
	}
	
	public void drawScreen() {
		
		app.image(game, 0, 0);
		controlGame.drawGame();
	}
	
	
	public void getKey(int c) {
		controlGame.getKey(c);
	}
	
	public void notMove(int c) {
		controlGame.notMove(c);
	}
	
}
