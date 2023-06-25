package ar.edu.unq.po2.tp11.ej2;

public class Pasante extends Empleado {

	private int cantHorasTrabajadas;
	
	public int getCantHorasTrabajadas() {
		return cantHorasTrabajadas;
	}

	public void setCantHorasTrabajadas(int cantHorasTrabajadas) {
		this.cantHorasTrabajadas = cantHorasTrabajadas;
	}

	@Override
	public double sueldoBasico() {
		return this.getCantHorasTrabajadas() * 40;
	}
	
}
