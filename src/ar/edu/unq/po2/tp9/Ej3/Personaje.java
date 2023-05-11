package ar.edu.unq.po2.tp9.Ej3;

import ar.edu.unq.po2.tp3.Point;

public abstract class Personaje {

	private Point ubicacion;

	Personaje() {
		super();
		this.setUbicacion(new Point(0,0));
	}

	public Point getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Point ubicacion) {
		this.ubicacion = ubicacion;
	}

	public abstract void desplazarse(Point punto);
	
}