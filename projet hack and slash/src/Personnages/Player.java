package Personnages;

import java.awt.Window;

import View.Room;

public class Player extends Personnage {
	
	// attributs pour définir l'orientation du personnage
	
	private int orientation;

	// constructeur :
	
	public Player(int health, int life, int move_speed, int posX, int posY,int number,int orientation) {
		super(health, life, move_speed, posX, posY, number);
		this.orientation=orientation;
	}
    
	// getters;

	
	public int getPosX(){
		return this.posX;
	}
	
	public int getPosY(){
		return this.posY;
	}
	
	public int get_orientation(){
		return this.orientation;
	}
	
	public int get_nmber(){
		return this.number;
	}
	// setters:
	
	public void set_posX(int posX){
		this.posX = posX;
		
	}
	
	public void set_posY( int posY){
		this.posY = posY;
	}
	
	public void set_orientation(int orientation){
		this.orientation = orientation;
		
	}
	
	// méthodes
	
	public int getHealth(){
		int health=this.health;
		return health;
	}
	
	
	public void move(int X, int Y){
		this.posX = this.posX + X;
		this.posY = this.posY + Y;
	}

}
