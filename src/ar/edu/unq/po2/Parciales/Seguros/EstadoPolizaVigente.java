package ar.edu.unq.po2.Parciales.Seguros;

public class EstadoPolizaVigente extends EstadoPoliza {

	public EstadoPolizaVigente(Poliza poliza) {
		super(poliza);
	}

	@Override
	public void agregarItem(Item item) {
		this.cancelar();
		this.getPoliza().cambiarEstadoDePoliza(new EstadoPolizaAbierta(this.getPoliza()));
	}
	
	@Override
	public void aplicarDescuento() {
		this.getPoliza().removeAllGastosAministrativos();

	}
	
	public void cancelar() {
		this.getPoliza().removeAllGastosAministrativos();
	}

}