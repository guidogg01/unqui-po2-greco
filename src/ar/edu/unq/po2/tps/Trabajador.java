package ar.edu.unq.po2.tps;

import java.util.ArrayList;

public class Trabajador {
	
	private ArrayList<Ingreso> ingresos;
	
	public Trabajador(){
		this.ingresos = new ArrayList<Ingreso>();
	}

	public Trabajador(ArrayList<Ingreso> ingresos) {
		this.ingresos = ingresos;
	}

	public ArrayList<Ingreso> getIngresos() {
		return ingresos;
	}

	public void setIngresos(ArrayList<Ingreso> ingresos) {
		this.ingresos = ingresos;
	}
	
	public void agregarIngreso(Ingreso ingresoNuevo) {
		this.ingresos.add(ingresoNuevo);
	}
	
	//retornar el monto total percibido por el trabajador
	public double getTotalPercibido(){
		double totalPercibidoHastaAhora = 0d;
		for (Ingreso ingreso : this.getIngresos()) {
			totalPercibidoHastaAhora += ingreso.getMontoPercibido();
		}
		return totalPercibidoHastaAhora;
	}
	
	//retornar el monto imponible al impuesto al trabajador
	public double getMontoImponible(){
		double totalPercibidoHastaAhora = 0d;
		for (Ingreso ingreso : this.getIngresos()) {
			if (!ingreso.esIngresoPorHoraExtra()) {
				totalPercibidoHastaAhora += ingreso.getMontoPercibido();
			}
		}
		return totalPercibidoHastaAhora;
	}
	
	//retornar el monto a pagar por el trabajador, calculado como el 2% del monto imponible
	public double getImpuestoAPagar(){
		return this.getMontoImponible() * 0.02;
	}
}