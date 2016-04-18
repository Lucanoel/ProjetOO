package Threads;
import Personnages.NPC;
import Personnages.PNJ;
import Personnages.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import  Model.Game;
import View.Window;

public class Thread_PNJ implements Runnable {
	int wait_time;
	PNJ pnj;
	Game game;
	Window window;
	
	
	public Thread_PNJ (int wait_time, PNJ pnj, Window window){
		this.wait_time = wait_time;
		this.pnj = pnj;
		this.window = window;
	}
	
	public void run(){
		try {
			chemin(this.window);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	
	
	public int playerInZone(Player player){
		int[][] matrix=window.getMatrix();
		int x1= this.pnj.get_posX();
		int y1= this.pnj.get_posY();
		int vision=this.pnj.get_vision();
		ArrayList<Integer> List=new ArrayList<Integer>();
		for(int i=x1-vision;i<x1+1+vision;i++)
			for(int j=y1-vision;j<y1+1+vision;j++)
				if(i>=0 && j>=0 && i<20 && j<20){
				List.add(matrix[i][j]);}
		int num =0;
		for(Integer elem:List)
			if (elem ==2){
				num=1;}
		return num;
	}
	
	
	public void randomMove(Window window) throws InterruptedException{
		Random random = new Random();
		int r = random.nextInt(4);	
		if(r==0){
			if( 1 < this.pnj.get_posX() ) {     // conditions pour empêcher qu'il ne sorte de la carte
				this.pnj.movePNJ_Left();}
			else{ this.pnj.movePNJ_Right();}
			window.draw(window.getMatrix());
			Thread.sleep(800);} // remplacer le 50 par le wait_time du Thread !!!
		
		else if ( r==1){
			if(this.pnj.get_posX() < 18){
				this.pnj.movePNJ_Right();}
			else{ this.pnj.movePNJ_Left(); }
			window.draw(window.getMatrix());
			Thread.sleep(800);}		
		
		else if ( r==2){
			if( 1 < this.pnj.get_posY() ) {     // conditions pour empêcher qu'il ne sorte de la carte				
				this.pnj.movePNJ_Down();}
			else{ this.pnj.movePNJ_Up();}
			window.draw(window.getMatrix());
			Thread.sleep(800);}
		
		else if(r==3){
			if (this.pnj.get_posY()< 18){
				this.pnj.movePNJ_Up();	
			}else{ this.pnj.movePNJ_Down();}
			window.draw(window.getMatrix()); 
			Thread.sleep(800);}
	}
	
	
	public void chase(Player player,Window window) throws InterruptedException{
		Random random = new Random();
		int r = random.nextInt(2);
		int x =player.getPosX();
		int y =player.getPosY();
		if(r==0){
			if(x>this.pnj.get_posX()){
				this.pnj.movePNJ_Right();}
			else if(x==this.pnj.get_posX()){
				if(y>this.pnj.get_posY()){
					this.pnj.movePNJ_Up();	
				}else{ this.pnj.movePNJ_Down();}
			}
			else{ this.pnj.movePNJ_Left(); }
			window.draw(window.getMatrix());
			Thread.sleep(800);}	
		else{
			if(y>this.pnj.get_posY()){
				this.pnj.movePNJ_Up();
			}else if(y==this.pnj.get_posY()){
				if(x>this.pnj.get_posX()){
					this.pnj.movePNJ_Right();}
				else{ this.pnj.movePNJ_Left(); }
			}else{ this.pnj.movePNJ_Down();}
			window.draw(window.getMatrix()); 
			Thread.sleep(800);}
	}
	
	public void chemin( Window window) throws InterruptedException /* pq??? */{ 
		
	while(true){
						
		Player player = window.getRoom().getplayer();
		int num = playerInZone(player);

		if(num==0){
			randomMove(window);
		}else if(num==1){
			chase(player,window);
		}
	}
	}

	
}
