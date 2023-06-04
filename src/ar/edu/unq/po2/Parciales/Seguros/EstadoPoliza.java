package ar.edu.unq.po2.Parciales.Seguros;

public abstract class EstadoPoliza {

	private Poliza poliza;
	
	public EstadoPoliza(Poliza poliza) {
		this.setPoliza(poliza);
	}

	public Poliza getPoliza() {
		return poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}
	
	public abstract void agregarItem(Item item);
	
	public abstract void aplicarDescuento();
	
}
