package ar.edu.unq.po2.Parciales.Seguros;

public class GastoAdministrativo {

	public String concepto;
	public Double monto;

	public GastoAdministrativo(String concepto, Double monto) {
		this.setConcepto(concepto);
		this.setMonto(monto);
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}	
}