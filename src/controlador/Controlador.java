package controlador;

import modelo.Modelo;
import vista.Principal;

public class Controlador {
	private Modelo modelo;
	private Principal principal;

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Principal getPrincipal() {
		return principal;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

}
