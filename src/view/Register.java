package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import controller.Controller;
import controller.ControllerRegister;
import exception.NameLenght;
import exception.NoName;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class Register {

	private PApplet app;
	private ControlP5 cp5;
	private PFont fontText;
	private ControllerRegister controller;
	private PImage register;
	
	private boolean correct;
	
	private String [] inputs;
	private String name;
	
	
	public Register(PApplet app) {
		
		this.app=app;
		//screen=2;
		register=app.loadImage("../Resources/register.png");
		controller = new ControllerRegister(app);
		fontText=app.createFont("../Resources/Krungthep.tff", 62);
		correct= false;
		
		cp5= new ControlP5(app);
		inputs= new String[1];
		
		createText();
		
	}
	
	public void createText() {
		
		inputs[0] = "Name";
		
		cp5.addTextfield(inputs[0]).setPosition(256,366).setSize(684,95).setAutoClear(true)
		.setColorBackground(app.color(0,0,0,1)).setColorActive(app.color(0,0,0,1))
		.setColorValueLabel(app.color(0)).setFont(fontText);
		
	}
	
	public void registerPlayer() throws NoName, NameLenght{
		
		name=cp5.get(Textfield.class, "Name").getText();
		
		boolean noName = false;
		
		if (name.equals("")) {
			
			noName = true;
		}
		
		if(noName==true) {
			throw new NoName("There is NO name");
		}else if (name.length()>10) {
			throw new NameLenght("Name is too long");
		}else {
			controller.registerPlayer(name);
			correct=true;
		}
	}
	
	public void drawScreen() {
		
		app.image(register, 0, 0);
	}
	
	public int button() {
		int screen=2;
		
		if(app.mouseX>250 && app.mouseX<570 && app.mouseY>530 && app.mouseY<605) {
			
			
			try {
				registerPlayer();
			} catch (NoName e) {
				// TODO Auto-generated catch block
				System.out.println("There is no name in the text field");
			} catch (NameLenght e) {
				// TODO: handle exception
				System.out.println("Name is too long");
			}
			
			if (correct==true) {
				
				screen=3;
				cp5.get(Textfield.class, "Name").setText("");
			}
			
		}
		
		if(app.mouseX>630 && app.mouseX<945 && app.mouseY>530 && app.mouseY<605) {
			screen=1;
		}
		
		return screen;
	}



	public ControlP5 getCp5() {
		return cp5;
	}

	public void setCp5(ControlP5 cp5) {
		this.cp5 = cp5;
	}
	
	
	
	
}
