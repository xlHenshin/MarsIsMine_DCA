package view;

import processing.core.PApplet;

public class Main extends PApplet{

	private Menu menu;
	private Register register;
	
	private int screen;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PApplet.main("view.Main");
	}
	
	public void settings() {
		
		size(1190,808);
	}
	
	public void setup() {
		
		screen=1;
		
		menu= new Menu(this);
		register= new Register(this);
	}
	
	public void draw() {
		
		background(0);
		
		switch (screen) {
		case 1:
			
			menu.drawScreen();
			register.getCp5().hide();
			break;
			
		case 2:
			
			register.drawScreen();
			register.getCp5().show();
			break;
			
		case 3:
			
			register.getCp5().hide();
			break;
			
		case 4:
			
			break;
			
		case 5:
			
			break;

		default:
			break;
		}
		
	}
	
	public void keyPressed() {
		
	}
	
	public void mousePressed() {
		
		System.out.println("X= "+ mouseX);
		System.out.println("Y= "+ mouseY);
		
		switch (screen) {
		case 1:
			
			menu.button();
			screen=menu.button();
			break;
			
		case 2:
			
			register.button();
			screen=register.button();
			break;
			
		case 3:
			
			break;
			
		case 4:
			
			break;
			
		case 5:
			
			break;

		default:
			break;
		}
	}

}
