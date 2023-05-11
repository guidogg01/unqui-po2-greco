package ar.edu.unq.po2.tp9.Ej5;

import java.util.ArrayList;

public class CarroDeCompras {

	private ArrayList<Product> products;

	public ArrayList<Product> getProducts() {
		return products;
	}
	
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public int totalRounded() {
		return (int) this.getProducts().stream().mapToDouble(p -> p.getPrice()).sum();
	}
	
	public float total() {
		return (float) this.getProducts().stream().mapToDouble(p -> p.getPrice()).sum();
	}
	
}