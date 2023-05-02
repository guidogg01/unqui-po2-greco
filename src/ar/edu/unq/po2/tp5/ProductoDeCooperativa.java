package ar.edu.unq.po2.tp5;

public class ProductoDeCooperativa extends Producto {

	ProductoDeCooperativa() {
		super();
	}

	ProductoDeCooperativa(String nombre, double precio) {
		super(nombre, precio);
	}

	public double getPrecio() {
		return super.getPrecio() * 0.9;
	}
	
}