package Personnages;

public class Villageois extends NPC {
	int orientation;
	int vision;
	private int posX;
	private int posY;
	
	public Villageois(int health, int life, int move_speed, int posX, int posY,int number) {
		super(health, life, move_speed, posX, posY,number);}
		// getters;
		public int getPosX(){
			return this.getPosX();
		}
		
		public int getPosY(){
			return this.getPosY();
		}
		
		public int get_orientation(){
			return this.orientation;
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
		public void move(int X, int Y){
			this.posX = this.posX + X;
			this.posY = this.posY + Y;
		}
}
