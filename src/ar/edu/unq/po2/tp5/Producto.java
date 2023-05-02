package ar.edu.unq.po2.tp5;

public class Producto implements Comprable{
	
	private String nombre;
	private double precio;
	private int    stock;
		
	Producto() {
		super();
	}

	Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public double registrarse() {
		reducirStock();
		return this.getPrecio();
	}

	private void reducirStock() {
		this.setStock(this.getStock()-1);	
	}
	
}





















