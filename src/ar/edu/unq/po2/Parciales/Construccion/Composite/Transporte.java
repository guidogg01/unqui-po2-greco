package ar.edu.unq.po2.Parciales.Construccion.Composite;

public class Transporte implements Actividad{

	private double distancia;
	private double pesoDeCarga;
	private double precioPorDistancia;
	private double precioPorPeso;
	
	Transporte(double distancia, double pesoDeCarga, double precioPorDistancia, double precioPorPeso) {
		super();
		this.setDistancia(distancia);
		this.setPesoDeCarga(pesoDeCarga);
		this.setPrecioPorDistancia(precioPorDistancia);
		this.setPrecioPorPeso(precioPorPeso);
	}

	public double getDistancia() {
		return distancia;
	}

	private void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public double getPesoDeCarga() {
		return pesoDeCarga;
	}

	private void setPesoDeCarga(double pesoDeCarga) {
		this.pesoDeCarga = pesoDeCarga;
	}

	public double getPrecioPorDistancia() {
		return precioPorDistancia;
	}

	private void setPrecioPorDistancia(double precioPorDistancia) {
		this.precioPorDistancia = precioPorDistancia;
	}

	public double getPrecioPorPeso() {
		return precioPorPeso;
	}

	private void setPrecioPorPeso(double precioPorPeso) {
		this.precioPorPeso = precioPorPeso;
	}	
	
	public double costoTotal() {
		return this.getDistancia() * this.getPesoDeCarga() * this.precioTotal();
	}
	
	private double precioTotal() {
		return this.getPrecioPorDistancia() + this.getPrecioPorPeso();
	}
	
}
