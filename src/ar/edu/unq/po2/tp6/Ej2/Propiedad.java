package ar.edu.unq.po2.tp6.Ej2;

public class Propiedad {

	private String descripciónPropiedad; 
	private String direcciónPropiedad; 
	private int    valorFiscal;

	Propiedad(String descripciónPropiedad, String direcciónPropiedad, int valorFiscal) {
		super();
		this.descripciónPropiedad = descripciónPropiedad;
		this.direcciónPropiedad = direcciónPropiedad;
		this.valorFiscal = valorFiscal;
	}

	public String getDescripciónPropiedad() {
		return descripciónPropiedad;
	}

	public void setDescripciónPropiedad(String descripciónPropiedad) {
		this.descripciónPropiedad = descripciónPropiedad;
	}

	public String getDirecciónPropiedad() {
		return direcciónPropiedad;
	}

	public void setDirecciónPropiedad(String direcciónPropiedad) {
		this.direcciónPropiedad = direcciónPropiedad;
	}

	public int getValorFiscal() {
		return valorFiscal;
	}

	public void setValorFiscal(int valorFiscal) {
		this.valorFiscal = valorFiscal;
	}
	
	
	
}
