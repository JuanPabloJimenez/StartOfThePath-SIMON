package co.edu.unbosque.controller;


import co.edu.unbosque.model.Simon;
import co.edu.unbosque.view.Ventana;

public class Controlador {
	
	private Ventana v;
	private Simon s;

	public Controlador() {
		v = new Ventana();
		s = new Simon();
		funcionar();
	}

	private void funcionar() {
 
	}
}
