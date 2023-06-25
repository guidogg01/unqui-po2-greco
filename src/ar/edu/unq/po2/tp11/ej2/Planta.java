package ar.edu.unq.po2.tp11.ej2;

public class Planta extends Empleado {

	private int cantHijos;
	
	public int getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}

	@Override
	public double sueldoBasico() {
		return sueldoBasico() + bonoFamiliar();
	}
	
	private double bonoFamiliar() {
		return this.getCantHijos() * 150;
	}
	
}
