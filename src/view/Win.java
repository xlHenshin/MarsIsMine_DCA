package view;

import processing.core.PApplet;
import processing.core.PImage;

public class Win {
	private PApplet app;
	private PImage screen;
	
	public Win (PApplet app) {
		this.app = app;
		screen=app.loadImage("../Resources/win.png");
	}
	
	public void drawScreen() {
		app.image(screen, 0, 0);
	}
}
