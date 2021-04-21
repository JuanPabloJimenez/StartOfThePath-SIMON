package co.edu.unbosque.view;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import co.edu.unbosque.model.Simon;

@SuppressWarnings("serial")
public class Ventana extends JPanel {
	
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		if(Simon.simon != null) {
					Simon.simon.paint((Graphics2D)g);

		}
	}
	
 	
}
