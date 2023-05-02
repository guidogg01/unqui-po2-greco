package ar.edu.unq.po2.tp5;

public class Servicio implements Comprable{

	private double costoPorUnidad;
	private double cantidadUnidadesConsumidas;
	
	Servicio(double costoPorUnidad, double cantidadUnidadesConsumidas) {
		super();
		this.costoPorUnidad = costoPorUnidad;
		this.cantidadUnidadesConsumidas = cantidadUnidadesConsumidas;
	}

	public double getCostoPorUnidad() {
		return costoPorUnidad;
	}

	public void setCostoPorUnidad(double costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}

	public double getCantidadUnidadesConsumidas() {
		return cantidadUnidadesConsumidas;
	}

	public void setCantidadUnidadesConsumidas(double cantidadUnidadesConsumidas) {
		this.cantidadUnidadesConsumidas = cantidadUnidadesConsumidas;
	}
	
	@Override
	public double registrarse() {
		return this.getCostoPorUnidad() * this.getCantidadUnidadesConsumidas();
	}
	
	
}
