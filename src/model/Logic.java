package model;

import java.util.ArrayList;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {

	private PApplet app;
	
	private LinkedList<Player> player;
	
	
	private static Logic oneInstance;
	
	private Logic(PApplet app) {
		
		this.app=app;
		player = new LinkedList<Player>();
	}
	
	public static Logic getInstance(PApplet app) {
		if(oneInstance == null) {
			oneInstance = new Logic(app);
		}
		return oneInstance;
	}
	
	public void registerPlayer(String name) {
		
		Player newPlayer = new Player(name, app);
		player.add(newPlayer);
		
		for (int i = 0; i < player.size(); i++) {
			
			System.out.println(">>> Name: " + player.get(i).getName() + " <<<");
		}
	}

	public LinkedList<Player> getPlayer() {
		return player;
	}

	public void setPlayer(LinkedList<Player> player) {
		this.player = player;
	}
	
	
}