package Personnages;

public class Boss {
	int orientation;
	int vision;
	private int posX;
	private int posY;
	
	public Boss(int health, int life, int move_speed, int posX, int posY) {
		super();}
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
		
		// m�thodes
		public void move(int X, int Y){
			this.posX = this.posX + X;
			this.posY = this.posY + Y;
		}
}
