package Model;
import Threads.Thread_PNJ;
import View.Window;
import java.util.ArrayList;
import java.util.Random;

import Personnages.PNJ;
import Personnages.Player;

public class Game {
	private Window window;
	public Game(Window window){
		this.window = window;
		// Creating one Player at position (1,1)
		window.draw(window.getMatrix());
		ArrayList<PNJ> pnjs=window.getRoom().getPnjs();
		for(PNJ pnj:pnjs){
			Thread t1 = new Thread( new Threads.Thread_PNJ(10, pnj, window )) ;
			t1.start();}
	}

	public void generateEnnemy() throws InterruptedException{
		while(true){
			Random random= new Random();
			int r1= random.nextInt(20);
			int r2=random.nextInt(20);
			ArrayList<PNJ> pnjs= this.window.getRoom().getPnjs();
			pnjs.add(new PNJ(1,5,5,r1,r2,10,6));
			this.window.getRoom().setPnjs(pnjs);
			Thread.sleep(10000);
			this.moveEnnemy();
		}
	}	
	
	public void moveEnnemy(){
		ArrayList<PNJ> pnjs=window.getRoom().getPnjs();
		for(PNJ pnj:pnjs){
			Thread t1 = new Thread( new Threads.Thread_PNJ(10, pnj, window )) ;
			t1.start();}
	}
	
	public void attack() throws InterruptedException{
		Player player =window.getRoom().getplayer();
		int orientation = player.get_orientation();
		int x =player.getPosX();
		int y=player.get_posY();
		int[][] matrix =window.getMatrix();
		if (orientation==0){
			for(PNJ pnj:window.getRoom().getPnjs()){
				int x2=pnj.get_posX();
				int y2= pnj.get_posY();
				if(matrix[x2][y2]==matrix[x-1][y]){
					pnj.set_health(pnj.get_health()-1);
					if(pnj.get_health()==0){
						matrix[x2][y2]=4;
						window.draw(matrix);
						Thread.sleep(3000);
						matrix[x2][y2]=0;
						window.draw(matrix);
					
					}else{
					matrix[x-1][y]=8;
					window.draw(matrix);
					Thread.sleep(200);
					matrix[x-1][y]=0;
					window.draw(matrix);		
					}
				}
			}
		}
	}


	public void movePlayerLeft(){
		Player player =window.getRoom().getplayer();
		player.move(-1, 0);
		player.set_orientation(0);
		int[][] matrix =this.window.getMatrix();
		this.window.draw(matrix);
	}
	public void movePlayerRight(){
		Player player = window.getRoom().getplayer();
		player.move(1,0);
		player.set_orientation(1);
		int[][] matrix = window.getMatrix();
		window.draw(matrix);
	}
	public void movePlayerDown(){
		Player player = window.getRoom().getplayer();
		player.move(0, 1);
		player.set_orientation(2);
		int[][] matrix = window.getMatrix();
		window.draw(matrix);
	}
	public void movePlayerUp(){
		Player player = window.getRoom().getplayer();
		player.move(0, -1);
		player.set_orientation(3);
		int[][] matrix = window.getMatrix();
		window.draw(matrix);
	}

}
