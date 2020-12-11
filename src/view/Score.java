package view;

import controller.ControllerScore;
import processing.core.PApplet;
import processing.core.PImage;

public class Score {

	private PApplet app;
	private PImage score;
	private ControllerScore scoreControl;
	
	public Score(PApplet app) {
		
		this.app=app;
		score = app.loadImage("../Resources/score.png");
		scoreControl= new ControllerScore(app);
	}
	
	public void drawScreen() {
		
		app.image(score, 0, 0);
		scoreControl.drawData();
		
	}
}
