package ar.edu.unq.po2.Parciales.Construccion.Strategy;

import ar.edu.unq.po2.Parciales.Construccion.Empresa;

public interface MetodoDePago {

	//Propósito: Determina el costo total que se debe abonar por los materiales 
	public double abonarMateriales(Empresa empresa);
	
}
