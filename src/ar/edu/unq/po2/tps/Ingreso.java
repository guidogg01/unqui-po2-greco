package ar.edu.unq.po2.tps;

public class Ingreso {

	private String mesPercepcion;
	private String concepto;
	private double montoPercibido;
	
	public Ingreso(String mesPercepcion, String concepto, double montoPercibido) {
		this.mesPercepcion = mesPercepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}

	public String getMesPercepcion() {
		return mesPercepcion;
	}

	public void setMesPercepcion(String mesPercepcion) {
		this.mesPercepcion = mesPercepcion;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getMontoPercibido() {
		return montoPercibido;
	}

	public void setMontoRecibido(double montoRecibido) {
		this.montoPercibido = montoRecibido;
	}

	public boolean esIngresoPorHoraExtra(){
		return false;
	}
}
