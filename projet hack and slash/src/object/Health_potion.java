package Object;

import Personnages.Player;

public class Health_potion extends Bonus{
    
	// constructeur
	public Health_potion(int type, int quantity) {
		super(type, quantity);}
	
	public void potion (Player perso){
			int vie = perso.get_health();
			perso.set_health( vie + this.quantity );
			}
    
}
