package ar.edu.unq.po2.Parciales.Construccion.Strategy;

import ar.edu.unq.po2.Parciales.Construccion.Composite.Actividad;

public class TarjetaDeCredito implements MetodoDePago {

	@Override
	public double pagarActividad(Actividad actividad) {
		return actividad.costoTotal() + porcentajePorActividad(actividad);
	}
	
	private double porcentajePorActividad(Actividad actividad) {
		return actividad.costoTotal() * 0.4;
	}
	
}
