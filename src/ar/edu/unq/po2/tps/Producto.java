package ar.edu.unq.po2.tps;

public class Producto {

	private String  nombre;
	private double  precio;
	private boolean esPrecioCuidado;
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		this.nombre          = nombre;
		this.precio          = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	
	public void setEsPrecioCuidado(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}

	public void aumentarPrecio(double cantPrecio) {
		double precioNuevo;
		precioNuevo = this.getPrecio() + cantPrecio;
		this.setPrecio(precioNuevo);
	}
	
}
