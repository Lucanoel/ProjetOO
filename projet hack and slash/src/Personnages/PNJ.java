package Personnages;
import View.Window;


public class PNJ extends Personnage {
	private int vision;
	public PNJ(int numero,int health, int life, int move_speed, int posX, int posY,int vision) {
		super(numero,health, life, move_speed, posX, posY);
		this.vision =vision;
	}


	
	// getters
	
	public int get_vision(){
		return this.vision;
	}
	
	// autres Méthodes

	public void movePNJ_Left(){
		this.set_posX(this.posX - 1);
		
	}
	public void movePNJ_Right(){
		this.set_posX(this.posX + 1);;	
	}
	public void movePNJ_Down(){
		this.set_posY(this.posY -1);
	}
	public void movePNJ_Up(){
		this.set_posY(this.posY +1);
	}
   
	// Chemin prédéfini du méchant.
	

}
