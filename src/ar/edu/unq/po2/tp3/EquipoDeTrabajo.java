package ar.edu.unq.po2.tp3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class EquipoDeTrabajo {

	private String nombre;
	private ArrayList<Trabajador> trabajadores;
	
	EquipoDeTrabajo(){
		this.trabajadores = new ArrayList<Trabajador>();
	}

	EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
		this.trabajadores = new ArrayList<Trabajador>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarTrabajador(Trabajador trabajador) {
		this.trabajadores.add(trabajador);
	}
	
	public double promedioEdad() {
		// BigDecimal es la manera de poder acortar un número decimal.
		BigDecimal numeroAcortado = BigDecimal.valueOf(trabajadores.stream().mapToDouble(Trabajador::getEdad).average().orElse(0f));
		
		numeroAcortado = numeroAcortado.setScale(1, RoundingMode.HALF_UP); // El 1 es cuantos decimales quiero.
		                                                                   // El RoundingMode.HALF_UP hace que redondee para arriba el siguiente decimal.
		
		return numeroAcortado.doubleValue();
		
	}
	
}
