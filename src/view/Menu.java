package view;

import processing.core.PApplet;
import processing.core.PImage;

public class Menu {

	private PImage menu;
	private PApplet app;
	
	public Menu(PApplet app) {
		
		this.app=app;
		menu=app.loadImage("../Resources/menu.png");
	}
	
	public void drawScreen() {
		
		app.image(menu, 0, 0);
	}
	
	public void button() {
		
	
	}
}
