package ar.edu.unq.po2.tps;

public class IngresoPorHorasExtra extends Ingreso{

	private int cantHorasExtra;

	public IngresoPorHorasExtra(String mesPercepcion, String concepto, double montoRecibido, int cantHorasExtra) {
		super(mesPercepcion, concepto, montoRecibido);
		this.cantHorasExtra = cantHorasExtra;
	}

	public int getCantHorasExtra() {
		return cantHorasExtra;
	}

	public void setCantHorasExtra(int cantHorasExtra) {
		this.cantHorasExtra = cantHorasExtra;
	}
	
	public boolean esIngresoPorHoraExtra(){
		return true;
	}
	
}
