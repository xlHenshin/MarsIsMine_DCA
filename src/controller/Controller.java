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
	
	public void drawEnemy() {
		logic.drawEnemy();
	}
	public void getKey(int c) {
		logic.getKey(c);
	}
	public void notMove(int c) {
		logic.notMove(c);
	}
	public int getPosX () {
		return logic.getPosX();
	}
	public void setPosXEnemy(int c) {
		logic.setPosX(c);
	}
	
	public void isMoving(boolean c) {
		logic.setIsMoving(c);
	}

	public int getPosXEnemy() {
		return logic.getPosXEnemy();
	}

	public void drawStar () {
		logic.drawStars();
	}

	public int getPosY() {
		return logic.getPosY();
	}
	
	public int getXCol() {
		return logic.getXCollision();
	}
	
	public void fallRevy(boolean c) {
		logic.fallRevy(c);
	}
	

}
