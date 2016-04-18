package main;

import Controller.Keyboard;
import Model.Game;
import View.Room;
import View.Window;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Room room=new Room();
		Window window = new Window(room);
		Game game = new Game(window);
		Keyboard keyboard = new Keyboard(game);
		window.setKeyListener(keyboard);
		game.generateEnnemy();
	}
}
 