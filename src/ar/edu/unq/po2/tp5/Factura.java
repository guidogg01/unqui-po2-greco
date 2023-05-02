package ar.edu.unq.po2.tp5;

public class Factura {

	private double monto;
	private String concepto;
	
	Factura(double monto, String concepto) {
		super();
		this.monto = monto;
		this.concepto = concepto;
	}
	
	public double getMonto() {
		return monto;
	}
	
	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	public String getConcepto() {
		return concepto;
	}
	
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	
}
