package model;

import processing.core.PApplet;

public class Logic {

	private PApplet app;
	
	private static Logic oneInstance;
	
	private Logic(PApplet app) {
		
		this.app=app;
	}
	
	public static Logic getInstance(PApplet app) {
		if(oneInstance == null) {
			oneInstance = new Logic(app);
		}
		return oneInstance;
	}
}
