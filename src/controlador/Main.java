package controlador;

import modelo.Modelo;
import vista.Principal;

public class Main {

	public static void main(String[] args) {
		Controlador controlador = new Controlador();
		
		Modelo modelo = new Modelo();
		
		Principal principal = new Principal();
		principal.setControlador(controlador);
		
		controlador.setModelo(modelo);
		controlador.setPrincipal(principal);
		
		principal.setVisible(true);
	}

}
