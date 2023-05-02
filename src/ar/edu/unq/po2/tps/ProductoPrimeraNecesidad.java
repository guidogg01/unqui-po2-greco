package ar.edu.unq.po2.tps;

public class ProductoPrimeraNecesidad extends Producto{

	private double porcentajeDeDescuento;
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado,double porcentajeDeDescuento) {
		super(nombre, precio, esPrecioCuidado);
		this.porcentajeDeDescuento = porcentajeDeDescuento;
	}
	
	
	public double getPorcentajeDeDescuento() {
		return porcentajeDeDescuento;
	}

	public void setPorcentajeDeDescuento(double porcentajeDeDescuento) {
		this.porcentajeDeDescuento = porcentajeDeDescuento;
	}

	public boolean esPrecioCuidado() {
		return true;		
	}
	
	public double getPrecio(){
		return super.getPrecio() * this.getPorcentajeDeDescuento();
	}
	
}
