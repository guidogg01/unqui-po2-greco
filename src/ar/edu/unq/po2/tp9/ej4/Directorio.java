package ar.edu.unq.po2.tp9.ej4;

import java.util.ArrayList;

public class Directorio implements FyleSystem{

	private String nombre;
	private int    fechaCreación; //Año de creación
	private ArrayList <Archivo> archivos;
	
	Directorio() {
		super();
	}

	Directorio(String nombre, int fechaCreación) {
		super();
		this.setNombre(nombre);
		this.setFechaCreación(fechaCreación);
		this.setArchivos(new ArrayList<Archivo>());
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFechaCreación() {
		return fechaCreación;
	}

	public void setFechaCreación(int fechaCreación) {
		this.fechaCreación = fechaCreación;
	}

	public ArrayList<Archivo> getArchivos() {
		return archivos;
	}

	public void setArchivos(ArrayList<Archivo> archivos) {
		this.archivos = archivos;
	}

	@Override
	public int totalSize() {
		return this.getArchivos().stream().mapToInt(a -> a.getEspacioOcupado()).sum();
	}

	@Override
	public void printStructure() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public XXXXXXXXX lastModified() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XXXXXXXX oldestElement() {
		// TODO Auto-generated method stub
		return null;
	}

}
