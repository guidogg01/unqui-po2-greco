package ar.edu.unq.po2.Parciales.PlanDeAhorro;

public class Cliente {

	private String nombre;
	private String CBU;
	
	Cliente(String nombre, String CBU) {
		super();
		this.nombre = nombre;
		this.CBU = CBU;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCBU() {
		return CBU;
	}

	public void setCBU(String CBU) {
		this.CBU = CBU;
	}
	
}
