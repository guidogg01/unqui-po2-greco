package ar.edu.unq.po2.tp11.ej2;

public class Planta extends Empleado {

	@Override
	public double sueldo() {
		return sueldoBasico() + bonoFamiliar();
	}
	
	@Override
	public double sueldoBasico() {
		return 3000;
	}
	
	private double bonoFamiliar() {
		return this.getCantHijos() * 150;
	}
	
}
