package ar.edu.unq.po2.tps;

import java.util.ArrayList;

public class Supermercado {

	private String nombre;
	private String direccion;
	private ArrayList<Producto> productos;
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>();
	}
	
	public Supermercado(String nombre, String direccion, ArrayList<Producto> productos){
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = productos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void agregarProducto(Producto producto){
		this.productos.add(producto);
	}
	
	public int getCantidadDeProductos(){
		return this.productos.size();
	}
	
	public double getPrecioTotal() {
		double precioTotalProducto = 0d;
		for (Producto producto : this.getProductos()) {
			precioTotalProducto += producto.getPrecio();
		}
		return precioTotalProducto;
	}
	
}






























