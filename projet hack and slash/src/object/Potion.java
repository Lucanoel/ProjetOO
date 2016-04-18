package Object;

import Personnages.Player;

public class Potion extends Object{
    	
	private int quantity;
	
	
	// constructeur :
	
	public Potion(int posX, int posY, int numero, int quantity){
		super(posX, posY, numero);		
		this.quantity = quantity;}
	
	
	// méthode régénératice:
		public void boire_potion (Player perso){			
		perso.set_health( perso.get_health() + this.quantity );		
		System.out.println( String.valueOf(perso.get_health()));
		}	
	
	// getters 
	
		public int get_quantity(){
		return this.quantity;}
	
	// setters :
		public void set_quantity( int quantity){
		this.quantity = quantity;}
		
}
