package ar.edu.unq.po2.tp3;

//Este el el pto 11.

public class Trabajador {

	private String nombre;
	private String apellido;
	private int    edad;
	
	Trabajador() {
		super();
	}
	
	Trabajador(String nombre, String apellido, int edad) {
		super();
		this.nombre   = nombre;
		this.apellido = apellido;
		this.edad     = edad;
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
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}

































