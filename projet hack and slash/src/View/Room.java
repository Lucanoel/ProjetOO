package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;
import Personnages.PNJ;
import Personnages.Player;
import Model.Block;
import Model.Game;

public class Room extends JPanel {
	private ArrayList<Player> players = new ArrayList<Player>();
	private ArrayList<Block> blocks = new ArrayList<Block>();
	private ArrayList<PNJ> pnjs = new ArrayList<PNJ>();
	private int size = 20;
	private int[][] mapMatrix;    
	
	public Room(){
		this.size =size;
		this.setFocusable(true);
		this.requestFocusInWindow();
		for(int i = 0; i < size; i++){
			blocks.add(new Block(i,0));
			blocks.add(new Block(0,i));
			blocks.add(new Block(i, size-1));
			blocks.add(new Block(size-1, i));
		}
		players.add(new Player(1,1,1,10,10,2,0));
		if (players.get(0).getHealth()==0){
			players.remove(players.get(0));
		}
		// Creating one PNJ and start his Thread
		  PNJ Ennemi = new PNJ(1,5,5,10,11,10,6);
		  pnjs.add(Ennemi);
	}

	

	public void paint(Graphics g) { 
		if(mapMatrix == null){
		}else{
			for(int i = 0; i<mapMatrix.length; i++){
				for(int j = 0; j<mapMatrix.length; j++){
					int x = i;
					int y = j;
					int color = mapMatrix[i][j];
					
					if(color == 0){			
					
						Image img = Toolkit.getDefaultToolkit().getImage("src/Image/landscape1.jpg");
						g.drawImage(img , x*50 , y*50 , this);}
						
					else if(color == 1){
																		  
						    Image img = Toolkit.getDefaultToolkit().getImage("src/Image/terre1.jpg");
						    g.drawImage(img , x*50 , y*50 , this);}
						    
					else if(color == 2){
									    
					    Image img = Toolkit.getDefaultToolkit().getImage("src/Image/Link.jpg");
					    g.drawImage(img , x*50 , y*50 , this);}
					
					 else if(color == 3){
					      Image img = Toolkit.getDefaultToolkit().getImage("src/Image/purple10.png");
					         g.drawImage(img , x*50 , y*50 , this);}    
					 else if(color == 4){
					      Image img = Toolkit.getDefaultToolkit().getImage("src/Image/tête_de_mort.png");
					         g.drawImage(img , x*50 , y*50 , this);}  
					 else if(color == 5){
					      Image img = Toolkit.getDefaultToolkit().getImage("src/Image/épée_haut.png");
					         g.drawImage(img , x*50 , y*50 , this);}  
					 else if(color == 6){
					      Image img = Toolkit.getDefaultToolkit().getImage("src/Image/épée_bas.png");
					         g.drawImage(img , x*50 , y*50 , this);} 
					 else if(color == 7){
					      Image img = Toolkit.getDefaultToolkit().getImage("src/Image/épée_droite.png");
					         g.drawImage(img , x*50 , y*50 , this);}  
					 else if(color == 8){
					      Image img = Toolkit.getDefaultToolkit().getImage("src/Image/épée_gauche.png");
					         g.drawImage(img , x*50 , y*50 , this);}  
					
					  //ancien code ( si on veut le réutiliser, attribuer des couleurs à chaque block  )
					//g.fillRect(x*50, y*50, 51, 51); // Crée les cases pour chaque élément de la matrice. les deux premiers pramètres donne le coin, les deux autress la hauteur et la largeur
					//g.setColor(Color.BLACK);
					//g.drawRect(x*50, y*50, 51, 51); //  Dessinait le contour des rectangles
					System.out.print(color);
					System.out.print(" ");
					
				}
				System.out.println("");
			}
		}
	}
	
	public int[][] getRoom(){
		int[][] map = new int[this.size][this.size];
		for(int i = 0; i<this.size; i++)
			for(int j = 0; j<this.size; j++)
				map[i][j] = 0;
		
		for(Player player : players){    // PLace le chiffre 2 ( qui identifie le joueur) dans la matrice de nombre
			int x = player.getPosX();
			int y = player.getPosY();
			map[x][y] = 2;               // C'est ici que ca se fait
		}
		for(Block block : blocks){
			int x = block.getPosX();
			int y = block.getPosY();
			map[x][y] = 1;
		}
		for (PNJ pnj :pnjs){
			int x = pnj.get_posX();
			int y=pnj.get_posY();
			map[x][y]=3;
		}
		System.out.println(map);
		return map;
	}
	
	public void setMapMatrix(int[][] mapMatrix){
		this.mapMatrix = mapMatrix;
		this.repaint();
	}
	public Player getplayer(){
		ArrayList<Player> players = this.players;
		Player player = players.get(0);
		return player;
	}
	
	
	public ArrayList<PNJ> getPnjs(){
		ArrayList<PNJ> pnjs=this.pnjs;
		return pnjs;
	}
	
	public void setPnjs(ArrayList<PNJ> pnjs){
		this.pnjs=pnjs;
	}
}
