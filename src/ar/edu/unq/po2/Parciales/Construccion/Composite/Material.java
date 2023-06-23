package ar.edu.unq.po2.Parciales.Construccion.Composite;

public class Material {

	private double precio;
	private int cantidad;
	
	Material(double precio, int cantidad) {
		super();
		this.setPrecio(precio);
		this.setCantidad(cantidad);
	}

	public double getPrecio() {
		return precio;
	}

	private void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	private void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double costoTotal() {
		return this.getPrecio();
	}
	
}
