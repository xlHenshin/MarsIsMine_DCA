package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import controller.Controller;
import processing.core.PApplet;
import processing.core.PImage;

public class Register {

	private PApplet app;
	private ControlP5 cp5;
	private Controller controller;
	private PImage register;
	private int screen;
	
	private String [] inputs;
	private String name;
	
	
	public Register(PApplet app) {
		
		this.app=app;
		screen=2;
		register=app.loadImage("../Resources/register.png");
		controller = new Controller(app);
		
		cp5= new ControlP5(app);
		inputs= new String[1];
		
		createText();
		
		
		//cp5.addTextfield(inputs[0]).setPosition().setSize(290, 73).setAutoClear(true).setColorValue(app.color(255))
		//.setColorActive(app.color(0,0,0,1)).setColorBackground(app.color(0,0,0,1)).setColorForeground(app.color(0,0,0,1))
		//.setColor(app.color(0,0,0,255)).setColorCursor(app.color(0,0,0,255)).setFont(font).getCaptionLabel().hide();
	}
	
	public void createText() {
		
		inputs[0] = "Name";
		
		cp5.addTextfield(inputs[0]).setPosition(256,366).setSize(500, 48).setAutoClear(true)
		.setColorBackground(app.color(255,255,255)).setColorLabel(app.color(0)).setColorActive(app.color(0))
		.setColorValueLabel(app.color(0));
		
	}
	
	public void cleanText() {
		cp5.get(Textfield.class, "Name").setText("");
	}
	
	public void registerPlayer() {
		
		name=cp5.get(Textfield.class, "Name").getText();
		
		boolean noName = false;
		
		if (name.equals("")) {
			
			noName = true;
		}
		
		if(noName==true) {
			
		}else if (name.length()>10) {
			
		}else {
			controller.registerPlayer(name);
		}
	}
	
	public void drawScreen() {
		
		app.image(register, 0, 0);
	}
	
	public void button() {
		
		if(app.mouseX>250 && app.mouseX<570 && app.mouseY>530 && app.mouseY<605) {
			screen=1;
			registerPlayer();
		}
		
		if(app.mouseX>630 && app.mouseX<945 && app.mouseY>530 && app.mouseY<605) {
			screen=1;
		}
	}

	public int getScreen() {
		return screen;
	}

	public void setScreen(int screen) {
		this.screen = screen;
	}

	public ControlP5 getCp5() {
		return cp5;
	}

	public void setCp5(ControlP5 cp5) {
		this.cp5 = cp5;
	}
	
	
	
	
}
