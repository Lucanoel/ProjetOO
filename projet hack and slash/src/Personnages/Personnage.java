package Personnages;

public abstract class Personnage {
	 // attributs //
	  
	  protected int health;
	     protected int life;
	     protected int move_speed;
	     protected int posX ;
	     protected int posY ;
	     protected int number;
	     //protected Weapon weapon;
	     
	 // constructor //
	     
	     public Personnage(int health, int life, int move_speed, int posX, int posY,int number){
	      
	      this.health = health;
	      this.life = life;
	      this.move_speed = move_speed;
	      this.posX = posX;
	      this.posY = posY;
	      
	     }
	     
	 // getters //
	     
	     public int get_health(){
	      return this.health;}
	     
	     public int get_life(){
	      return this.life; }
	   
	     public int get_move_speed(){
	      return this.move_speed; 
	      }
	     public int get_posX(){
	      return this.posX;
	     }
	     public int get_posY(){
	      return this.posY;
	     }
	     
	 // setters // 
	     

		public void set_health(int health){
	      this.health= health;
	     }
	     
	     public void set_life(int life){
	      this.life = life;
	     }
	     
	     public void set_move_speed(int move_speed){
	      this.move_speed = move_speed;
	     }
	     public void set_posX(int posX){
	      this.posX = posX;
	     }
	     
	     public void set_posY(int posY){
	    	 this.posY= posY;
	     }
}
