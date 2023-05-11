package ar.edu.unq.po2.tp9.Ej3;

import ar.edu.unq.po2.tp3.Point;

public class Ingeniero extends Personaje{
	
	@Override
	public void desplazarse(Point punto) {
		this.getUbicacion().moverPunto(punto.getX(), punto.getY());
	}

	public int getUbicacionEnEjeX() {
		return this.getUbicacion().getX();
	}
	
}