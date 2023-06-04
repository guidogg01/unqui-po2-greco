package ar.edu.unq.po2.Parciales.Seguros;

public class Item {

	private int cantidad;
	private Double valorPorUnidad;
	
	public Item(int cantidad, Double valorPorUnidad) {
		this.setCantidad(cantidad);
		this.setValorPorUnidad(valorPorUnidad);
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Double getValorPorUnidad() {
		return valorPorUnidad;
	}

	public void setValorPorUnidad(Double valorPorUnidad) {
		this.valorPorUnidad = valorPorUnidad;
	}
	
	public double obtenerValor() {
		return this.getCantidad()* this.getValorPorUnidad();
	}
	
}