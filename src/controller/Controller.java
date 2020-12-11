package controller;

import model.Logic;
import processing.core.PApplet;

public class Controller {

	private PApplet app;
	private Logic logic;
	
	public Controller(PApplet app) {
		
		this.app=app;
		logic= Logic.getInstance(app);
	}

	
	public void drawGame() {
		logic.drawGame();
	}
	public void getKey(int c) {
		logic.getKey(c);
	}
	public void notMove(int c) {
		logic.notMove(c);
	}
}
