package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

import exception.Lose;
import processing.core.PApplet;

public class Logic {

	private PApplet app;
	private boolean move;
	private ByName byname;
	private ByTime bytime;
	private ByDate bydate;
	
	private int min,seg;
	private boolean time;
	
	private String temporalName;
	private int posXEnemy;
	private LinkedList<Player> player;
	private ArrayList<Enemy> enemy;
	
	private ArrayList <Star> star;
	
	private Revy revy;
	
	private int score;


	private static Logic oneInstance;

	private Logic(PApplet app) {

		this.app=app;
		revy = new Revy(50, 457, app);
		byname= new ByName();
		bytime= new ByTime();
		bydate= new ByDate();
		temporalName="";
		score=0;
		
		min=0;
		seg=0;
		time=false;

		player = new LinkedList<Player>();
		enemy = new ArrayList<Enemy>();
		star = new ArrayList <Star> ();

		
		createEnemy();
		createStar ();
		
		
	} //CONSTRUCTOR



	public static Logic getInstance(PApplet app) {
		if(oneInstance == null) {
			oneInstance = new Logic(app);
		}
		return oneInstance;
	}

	public void registerPlayer(String name) {

		
		temporalName=name;
	}

	public void drawGame() {
		revy.draw();
		if (move == true) {

			Thread revyMove = new Thread(revy);
			revyMove.start();
		}
		
		for (int i = 0; i < star.size(); i++) {
			star.get(i).setMoveXStar(enemy.get(0).isMoveXEnemy());
		}
		
		time=true;
		paintTime();
		
		newPoint();
	}
	
	
	
	public void newPoint() {
		for (int i = 0; i < star.size(); i++) {
			if (app.dist(revy.getPosXCollision()+66, revy.getPosY()+70, star.get(i).getposXStar(), star.get(i).getposYStar())<=100) {
				star.remove(i);
				score = score + 100;
			}
		}
		app.textSize(40);
		app.text("Score: "+ score, 700, 750);
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
	
	public void createStar () {
		
		star.add(new Star (app, 414,490));
		
		star.add(new Star (app, 683,382));
		
		star.add(new Star (app, 975,238));
		
		star.add(new Star (app, 1515,238));
		
		star.add(new Star (app, 2068,211));
		
		star.add(new Star (app, 2094,493));
		
		star.add(new Star (app, 2343,490));
		
		star.add(new Star (app, 2833,326));
		
		star.add(new Star (app, 3083,326));
		
	}

	public void drawStars () {
		
		for (Star star : star) {
			star.draw();
		}
		
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
	
	public void paintTime() {
		
		if (time==true) {
			
			
			if (app.frameCount % 60 == 0) {
				seg += 1;
			}
			if (seg == 60) {
				seg = 0;
				min += 1;
			}
		}
		
		app.textSize(40);
		app.text("Time: "+ min + ":" + seg, 400, 750);
	}
	
	public void loseGame(){
		
		time=false;
		String m= Integer.toString(min);
		String s= Integer.toString(seg);
		String time = m+":"+s;
		Date date = new Date();
		
		Player newPlayer = new Player(temporalName, date, time, app);
		player.add(newPlayer);

		for (int i = 0; i < player.size(); i++) {

			System.out.println(">>> Name: " + player.get(i).getName() + " <<<");
			System.out.println(">>> Date: " + player.get(i).getDate2() + " <<<");
			System.out.println(">>> Time: " + player.get(i).getTime() + " <<<");
			System.out.println(">>> List size: " + player.size() + " <<<");
		}
		
	}

	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
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
