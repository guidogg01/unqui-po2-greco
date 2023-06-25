package ar.edu.unq.po2.tp11.ej2;

public class Temporario extends Empleado {

	private int cantHorasTrabajadas;
	private boolean tieneHijos;
	private boolean estaCasado;

	Temporario(int cantHorasTrabajadas, boolean tieneHijos, boolean estaCasado) {
		super();
		this.cantHorasTrabajadas = cantHorasTrabajadas;
		this.tieneHijos = tieneHijos;
		this.estaCasado = estaCasado;
	}

	public int getCantHorasTrabajadas() {
		return cantHorasTrabajadas;
	}

	public void setCantHorasTrabajadas(int cantHorasTrabajadas) {
		this.cantHorasTrabajadas = cantHorasTrabajadas;
	}

	public boolean isTieneHijos() {
		return tieneHijos;
	}

	public void setTieneHijos(boolean tieneHijos) {
		this.tieneHijos = tieneHijos;
	}

	public boolean isEstaCasado() {
		return estaCasado;
	}

	public void setEstaCasado(boolean estaCasado) {
		this.estaCasado = estaCasado;
	}

	@Override
	public double sueldoBasico() {
		return this.getCantHorasTrabajadas() * 5 + 1000 + this.bonoFamiliar();
	}
	
	private double bonoFamiliar() {
		if (this.isEstaCasado() || this.getCantHorasTrabajadas() >= 1) {
			return 100;
		} else {
			return 0;
		}
	}
	
}
