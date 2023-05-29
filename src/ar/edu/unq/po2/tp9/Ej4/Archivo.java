package ar.edu.unq.po2.tp9.Ej4;

public class Archivo implements Documento{

	private String nombre;
	private int    cantDeEspacioOcupado;
	private int    fechaDeUltimaModificación; //Año de ultima modificación.
	
	Archivo(String nombre, int cantDeEspacioOcupado, int fechaDeUltimaModificación) {
		super();
		this.setNombre(nombre);
		this.setCantDeEspacioOcupado(cantDeEspacioOcupado);
		this.setFechaDeUltimaModificación(fechaDeUltimaModificación);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantDeEspacioOcupado() {
		return cantDeEspacioOcupado;
	}

	public void setCantDeEspacioOcupado(int cantDeEspacioOcupado) {
		this.cantDeEspacioOcupado = cantDeEspacioOcupado;
	}

	public int getFechaDeUltimaModificación() {
		return fechaDeUltimaModificación;
	}

	public void setFechaDeUltimaModificación(int fechaDeUltimaModificación) {
		this.fechaDeUltimaModificación = fechaDeUltimaModificación;
	}

	@Override
	public int getEspacioOcupado() {
		// TODO Auto-generated method stub
		return 0;
	}

}
