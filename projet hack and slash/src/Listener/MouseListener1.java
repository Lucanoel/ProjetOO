package Listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;


public class MouseListener1  implements MouseListener {
	
//Java propose toutes les méthodes de l'interface à redéfinir;    

	private static final int EXIT_ON_CLOSE = 0;

	@Override
	public void mouseClicked(MouseEvent arg0) {
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		JFrame option = new JFrame("Options");
		option.setBounds(100, 100, 1000, 1000);
		option.setVisible(true);
		option.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
