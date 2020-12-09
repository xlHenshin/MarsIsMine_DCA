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

	public void registerPlayer(String name) {
		// TODO Auto-generated method stub
		logic.registerPlayer(name);
	}
}
