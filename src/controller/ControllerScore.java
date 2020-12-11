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
	
	public void sortNames()
	{
		logic.organizeByName();
		logic.drawData();
	}
	
	public void sortTime()
	{
		logic.organizeByTime();
		logic.drawData();
	}
	
	public void sortDate()
	{
		logic.organizeByDate();
		logic.drawData();
	}
	
	public void sortScore()
	{
		logic.organizeByScore();
		logic.drawData();
	}
}
