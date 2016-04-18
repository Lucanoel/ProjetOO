package Object;

import Personnages.Player;

public class Mana_potion extends Bonus {

	public Mana_potion(int type, int quantity) {
		super(type, quantity);	
	}
    
	public void potion (Player perso){
		int le_mana = perso.get_mana();
		perso.set_mana( le_mana + this.quantity );
		}
}
