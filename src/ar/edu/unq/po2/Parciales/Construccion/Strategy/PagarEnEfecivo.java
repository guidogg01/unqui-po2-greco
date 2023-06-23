package ar.edu.unq.po2.Parciales.Construccion.Strategy;

import ar.edu.unq.po2.Parciales.Construccion.Empresa;

public class PagarEnEfecivo implements MetodoDePago{

	@Override
	public double abonarMateriales(Empresa empresa) {
		return 0;
	}

}
