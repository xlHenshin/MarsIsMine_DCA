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
	
	public int button() {
		
		int screen=4;
		
		if(app.mouseX>435 && app.mouseX<752 && app.mouseY>650 && app.mouseY<722) {
			screen=1;
			
		}
		
		return screen;
	}
	
}
