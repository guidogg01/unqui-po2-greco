package ar.edu.unq.po2.tp11.ej2;

public class Temporario extends Empleado {

	private int cantHorasTrabajadas;
	private boolean estaCasado;

	Temporario(int cantHorasTrabajadas, boolean estaCasado) {
		super();
		this.cantHorasTrabajadas = cantHorasTrabajadas;
		this.estaCasado = estaCasado;
	}

	public int getCantHorasTrabajadas() {
		return cantHorasTrabajadas;
	}

	public void setCantHorasTrabajadas(int cantHorasTrabajadas) {
		this.cantHorasTrabajadas = cantHorasTrabajadas;
	}

	public boolean isEstaCasado() {
		return estaCasado;
	}

	public void setEstaCasado(boolean estaCasado) {
		this.estaCasado = estaCasado;
	}

	@Override
	public double sueldo() {
		return this.getCantHorasTrabajadas() * 5 + sueldoBasico() + this.bonoFamiliar();
	}

	@Override
	public double sueldoBasico() {
		return 1000;
	}
	
	private double bonoFamiliar() {
		if (this.isEstaCasado() || this.getCantHijos() >= 1) {
			return 100;
		} else {
			return 0;
		}
	}
	
}
