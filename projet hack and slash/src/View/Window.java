package View;

import java.awt.*; 
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import Listener.MouseListener1;
import Personnages.Player;

public class Window {
	private Room room;
	public Window(Room room){	 
		this.room =room;
	    JFrame window = new JFrame("_-xX DONJON II Xx-_ ");
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(200, 0, 1000, 1020);
	    window.getContentPane().setBackground(Color.blue);
	    window.getContentPane().add(room);	  
	    window.setVisible(true);	
	   
	   
	    ///// Ajout Menubar /////
	    
	    JMenuBar menubar = new JMenuBar();
	    menubar.setOpaque(true);
	    menubar.setBackground(Color.white);
	    menubar.setPreferredSize(new Dimension(200, 20));
	    window.setJMenuBar(menubar);
	    
	    // Ajout Menu //
	    
	    JMenu menu1 = new JMenu("Menu ");
	    menubar.add(menu1);
	    
	    JMenu menu2 = new JMenu(" Musique ");
	    menubar.add(menu2);
	    
	    JMenu menu3 = new JMenu(" Enregistrer ");
	    menubar.add(menu3);
	    
	    
	    //Ajouts des MenuItem//
	    
	    //menu 1
	    JMenuItem menuItem1 = new JMenuItem("Options");	   	       
	    menu1.add(menuItem1);
	    JMenuItem menuItem2 = new JMenuItem("Nouvelle partie");
	    menu1.add(menuItem2);	   
	    JMenuItem menuItem3 = new JMenuItem("Sauvegarder", new ImageIcon("Image/sterne3.png"));
	    menu1.add(menuItem3);
	    JMenuItem menuItem4 = new JMenuItem("Effacer");
	    menu1.add(menuItem4);
	    
	    //Ajout radio boutton
	    menu1.addSeparator();
	    JRadioButtonMenuItem radio1 = new JRadioButtonMenuItem("Musique ");
	    menu1.add(radio1);
	    JRadioButtonMenuItem radio2 = new JRadioButtonMenuItem("Plein écran ");
	    menu1.add(radio2);
	    
	    menu1.addSeparator();
	    JCheckBoxMenuItem cbMenuItem = new JCheckBoxMenuItem("A check box menu item");
	   
	    menu1.add(cbMenuItem);
	    
	    //Ajout Mouse Listener
	    
	    MouseListener1 mouse1 = new MouseListener1();
	    menuItem1.addMouseListener( mouse1 );
	}
	
	public int[][] getMatrix(){
		int[][]matrix=this.room.getRoom();
		return matrix;
	}
	public Room getRoom(){
		Room room =this.room;
		return room;
	}
	public void draw(int[][] mapMatrix){
		room.setMapMatrix(mapMatrix);
	}
	
	public void setKeyListener( KeyListener keyboard){
	    this.room.addKeyListener(keyboard);
	}
	
}
