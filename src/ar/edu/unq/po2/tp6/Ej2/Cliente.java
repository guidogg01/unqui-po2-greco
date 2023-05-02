package ar.edu.unq.po2.tp6.Ej2;

public class Cliente {

	private String nombre;
	private String apellido;
	private String dirección;
	private int    edad;
	private double sueldoNetoMensual;
	
	Cliente(String nombre, String apellido, String dirección, int edad, double sueldoNetoMensual) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dirección = dirección;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDirección() {
		return dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public void setSueldoNetoMensual(int sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	public double sueldoNetoAnual() {
		return this.getSueldoNetoMensual() * 12;
	}
	
}
