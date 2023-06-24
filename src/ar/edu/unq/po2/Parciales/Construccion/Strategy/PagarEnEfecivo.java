package ar.edu.unq.po2.Parciales.Construccion.Strategy;

import ar.edu.unq.po2.Parciales.Construccion.Composite.Actividad;

public class PagarEnEfecivo implements MetodoDePago {

	@Override
	public double pagarActividad(Actividad actividad) {
		return actividad.costoTotal();
	}

}
