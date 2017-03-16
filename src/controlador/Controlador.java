package controlador;

import java.util.ArrayList;

import modelo.Animal;
import modelo.Modelo;
import vista.Principal;

public class Controlador {
	private Modelo modelo;
	private Principal principal;
	
	public void insertar(String nombre) {
		Animal animal = new Animal();
		animal.setNombre(nombre);
		
		this.modelo.insert(animal);
		
		principal.clear();
		
	}
	public void mostrar() {
		ArrayList<Animal> animales = this.modelo.select();
		
		principal.mostrarInfo(animales);
	}
	

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
