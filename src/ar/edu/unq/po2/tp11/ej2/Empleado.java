package ar.edu.unq.po2.tp11.ej2;

public abstract class Empleado {
	
	private int cantHorasTrabajadas;
	private int cantHijos;

	public int getCantHorasTrabajadas() {
		return cantHorasTrabajadas;
	}

	public void setCantHorasTrabajadas(int cantHorasTrabajadas) {
		this.cantHorasTrabajadas = cantHorasTrabajadas;
	}
	
	public int getCantHijos() {
		return cantHijos;
	}

	public void setTieneHijos(int tieneHijos) {
		this.cantHijos = tieneHijos;
	}
	
	public final double sueldoFinal() {
		return this.sueldo() - descuentoDeAportes();
	}

	private double descuentoDeAportes(){
		return this.sueldo() * 0.13;
	}
	
	public abstract double sueldo();
	
	public abstract double sueldoBasico();
	
}
