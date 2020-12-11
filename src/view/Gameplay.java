package view;

import controller.Controller;
import processing.core.PApplet;
import processing.core.PImage;

public class Gameplay {

	private PApplet app;
	private PImage game;
	private Controller controlGame;
	private int posX;
	private boolean moveScreen;

	public Gameplay(PApplet app) {
		this.app=app;
		controlGame = new Controller(app);
		game=app.loadImage("../Resources/map1.png");
		posX=0;
		moveScreen = false;
	}

	public void drawScreen() {

		app.image(game, posX, 0);
		controlGame.drawGame();
		if (moveScreen == true) {
			System.out.println(controlGame.getPosX());
			if (controlGame.getPosX()>=50 && posX >= -2370) {
				posX = posX - 15;
				System.out.println(posX);
			}
		}
	}


	public void getKey(int c) {
		if (c == 39 ) {
			moveScreen = true;
		}
		controlGame.getKey(c);

	}

	public void notMove(int c) {
		if (c == 37 || c== 38 || c == 39) {
			moveScreen = false;
		}
		controlGame.notMove(c);
	}

}
