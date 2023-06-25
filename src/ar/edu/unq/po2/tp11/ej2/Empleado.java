package ar.edu.unq.po2.tp11.ej2;

public abstract class Empleado {
	
	public final double sueldo() {
		return this.sueldoBasico() - descuentoDeAportes();
	}

	private double descuentoDeAportes(){
		return this.sueldo() * 0.13;
	}
	
	public abstract double sueldoBasico();
	
}
