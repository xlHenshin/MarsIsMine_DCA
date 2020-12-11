package view;

import processing.core.PApplet;
import processing.core.PImage;

public class Score {

	private PApplet app;
	private PImage score;
	
	public Score(PApplet app) {
		
		this.app=app;
		score = app.loadImage("../Resources/score.png");
	}
	
	public void drawScreen() {
		
		app.image(score, 0, 0);
	}
}
