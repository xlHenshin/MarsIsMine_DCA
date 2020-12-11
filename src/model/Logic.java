package model;

import java.util.ArrayList;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {

	private PApplet app;
	private boolean move;
	private ByName byname;
	private ByTime bytime;
	private ByDate bydate;
	
	private int posXEnemy;
	private LinkedList<Player> player;
	private ArrayList<Enemy> enemy;

	private Revy revy;


	private static Logic oneInstance;

	private Logic(PApplet app) {

		this.app=app;
		revy = new Revy(50, 457, app);
		byname= new ByName();
		bytime= new ByTime();
		bydate= new ByDate();

		player = new LinkedList<Player>();
		enemy = new ArrayList<Enemy>();

		
		createEnemy();
		
	} //CONSTRUCTOR



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

	public void drawGame() {
		revy.draw();
		if (move == true) {

			Thread revyMove = new Thread(revy);
			revyMove.start();
		}
	}
	
	public void fallRevy(boolean c) {
		revy.setFall(c);
	}
	
	public void drawEnemy() {
		
		for (int i = 0; i < enemy.size(); i++) {
			enemy.get(i).drawEnemy();
			Thread newEnemy = new Thread(enemy.get(i));
			newEnemy.start();
			//System.out.println(enemy.get(0).getMoveX());
		}
		
		moveEnemy();
		
	}
	
	public int getXCollision() {
		return revy.getPosXCollision();
	}
	
	public void setPosX(int c) {
		for (int i = 0; i < enemy.size(); i++) {
			enemy.get(i).setMoveX(c);
		}
	}
	
	public int getPosXEnemy(){
		for (int i = 0; i < enemy.size(); i++) {
		posXEnemy= enemy.get(i).getMoveX();	
		}
		return posXEnemy;
	}
	
	public void setIsMoving(boolean c){
		for (int i = 0; i < enemy.size(); i++) {
			enemy.get(i).setMoveXEnemy(c);
		}
	}
	
	public void moveEnemy() {
		
		for (int i = 0; i < enemy.size(); i++) {
			
			enemy.get(i).moveEnemy();
		}
	}
	

	public void createEnemy () {
		
		enemy.add(new Enemy(app, 946, 183, 1));
		enemy.add(new Enemy(app, 1206, 450, -1));
		enemy.add(new Enemy(app, 1463, 184, -1));
		enemy.add(new Enemy(app, 2037, 148, 1));
		enemy.add(new Enemy(app, 2461, 451, -1));
		
		System.out.println(enemy.size());
	}
	

	public int getPosX() {
		return revy.getPosX();
	}


	public void getKey(int c) {
		revy.setKey(c);

		if (c == 37 || c== 38 || c == 39) {
			move=true;
		}
	}

	public void notMove (int c) {
		int not = c;
		if (not == 37 || not== 38 || not == 39) {
			move=false;
		}
	}


	public LinkedList<Player> getPlayer() {
		return player;
	}

	public void setPlayer(LinkedList<Player> player) {
		this.player = player;
	}


	public int getPosY() {
		return revy.getPosY();
	}
}
