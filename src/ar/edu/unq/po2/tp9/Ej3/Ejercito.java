package ar.edu.unq.po2.tp9.Ej3;

import java.util.ArrayList;

import ar.edu.unq.po2.tp3.Point;

public class Ejercito extends Personaje{

	private ArrayList<Personaje> personajes;

	public Ejercito() {
		this.setPersonajes(new ArrayList<Personaje>());
	}

	public ArrayList<Personaje> getPersonajes() {
		return personajes;
	}

	public void setPersonajes(ArrayList<Personaje> personajes) {
		this.personajes = personajes;
	}

	@Override
	public void desplazarse(Point punto) {
		this.getPersonajes()
		    .stream()
		    .forEach(p -> p.desplazarse(punto));
		this.getUbicacion().moverPunto(punto.getX(), punto.getY());
	}
	
	public void agregarPersonaje(Personaje personaje) {
		this.getPersonajes().add(personaje);
	}
		
}