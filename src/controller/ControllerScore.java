package controller;

import model.Logic;
import processing.core.PApplet;

public class ControllerScore {

	private PApplet app;
	private Logic logic;
	
	public ControllerScore(PApplet app) {
		
		this.app=app;
		logic=Logic.getInstance(app);
		
	}
	
	public void drawData() {
		
		logic.drawData();
	}
}
