package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	private String nombre;
	private LocalDate fechaDeNacimiento;
	
	Persona() {
		super();
	}

	Persona(String nombre, LocalDate fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public int edad(){
		
		LocalDate fechaActual = LocalDate.now();
		
		// Calcular la diferencia entre la fecha actual y la fecha de nacimiento
        int edadActual = Period.between(this.getFechaDeNacimiento(), fechaActual).getYears(); //Con el getYears obtengo la edad (o sea el número).
		
		return edadActual;
		
	}
	
	public boolean menorQue(Persona persona2) {
		
		return this.edad() < persona2.edad();
		
	}
	
}






























