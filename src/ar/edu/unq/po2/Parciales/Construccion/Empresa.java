package ar.edu.unq.po2.Parciales.Construccion;

import ar.edu.unq.po2.Parciales.Construccion.Composite.Actividad;
import ar.edu.unq.po2.Parciales.Construccion.Strategy.MetodoDePago;

public class Empresa {

	private String nombre;
	private String CUIT;
	private MetodoDePago metodoDePago;
	private Actividad actividad;
	
	Empresa(String nombre, String CUIT, MetodoDePago metodoDePago, Actividad actividad) {
		super();
		this.setNombre(nombre);
		this.setCUIT(CUIT);
		this.setMetodoDePago(metodoDePago);
		this.setActividad(actividad);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCUIT() {
		return CUIT;
	}

	private void setCUIT(String CUIT) {
		this.CUIT = CUIT;
	}

	public MetodoDePago getMetodoDePago() {
		return metodoDePago;
	}

	public void setMetodoDePago(MetodoDePago metodoDePago) { //Este set es public ya que se debe setear con una estrategia.
		this.metodoDePago = metodoDePago;
	}

	public Actividad getActividad() {
		return actividad;
	}

	private void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}
	
	public double costo() {
		return this.getActividad().costoTotal() + this.costoDeGestion();
	}
	
	private double costoDeGestion() {
		return this.getActividad().costoTotal() * 0.2;
	}
	
	// Propósito: Determina el costo total que se debe abonar por los materiales 
	public double pagarMateriales() {
		return this.getMetodoDePago().pagarActividad(this.getActividad());
	}
	
}
