package Object;
import Personnages.Personnage;

public class Weapon extends Object {
	int range;
	int damage;
	
	
	
	public Weapon (int range, int damage){
		this.range = range;
		this.damage = damage;
	}
	
	public void attack(Personnage perso ){
		// !! créer une condition qui fait que l'attaque n'est valide que si le héros est dans les cases à côté
		int health = perso.get_health();
		perso.set_health(health - this.damage);
	}
	
}
