package ar.edu.unq.po2.Parciales.Construccion.Strategy;

import ar.edu.unq.po2.Parciales.Construccion.Composite.Actividad;

public interface MetodoDePago {

	//Propósito: Determina el costo total que se debe abonar por los materiales 
	public double pagarActividad(Actividad actividad);
	
}
