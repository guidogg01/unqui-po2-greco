package ar.edu.unq.po2.tp11.ej2;

public class Pasante extends Empleado {

	@Override
	public double sueldo() {
		return this.getCantHorasTrabajadas() * 40;
	}

	@Override
	public double sueldoBasico() {
		return 0;
	}
	
}
