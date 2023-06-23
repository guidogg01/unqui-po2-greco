package ar.edu.unq.po2.Parciales.Construccion.Composite;

import java.util.List;

public class Operario extends Obra{

	private int cantHorasTrabajadas;
	private double valorPorhora;
	private int antiguedad;

	Operario(List<Operario> operarios, List<Material> materiales, int cantHoras, double valorPorhora, int antiguedad) {
		super(operarios, materiales);
		this.setCantHorasTrabajadas(cantHoras);
		this.setValorPorhora(valorPorhora);
		this.setAntiguedad(antiguedad);
	}

	public int getCantHorasTrabajadas() {
		return cantHorasTrabajadas;
	}

	private void setCantHorasTrabajadas(int cantHoras) {
		this.cantHorasTrabajadas = cantHoras;
	}

	public double getValorPorhora() {
		return valorPorhora;
	}

	private void setValorPorhora(double valorPorhora) {
		this.valorPorhora = valorPorhora;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	private void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	public double costoTotal() {
		return (this.getCantHorasTrabajadas() * this.getValorPorhora()) + this.costoPorAntiguedad();
	}
	
	private double costoPorAntiguedad() {
		if (this.getAntiguedad() > 5) {
			return ((this.getCantHorasTrabajadas() * this.getValorPorhora()) * 0.10);
		} else {
			return 0;
		}
	}
	
}
