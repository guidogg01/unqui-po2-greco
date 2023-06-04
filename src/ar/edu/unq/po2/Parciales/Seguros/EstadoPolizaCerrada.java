package ar.edu.unq.po2.Parciales.Seguros;

public class EstadoPolizaCerrada extends EstadoPoliza {

	public EstadoPolizaCerrada(Poliza poliza) {
		super(poliza);
	}

	@Override
	public void agregarItem(Item item) {
		this.getPoliza().addItem(item);
		this.getPoliza().addGastoAdministrativo(new GastoAdministrativo("Recargo por extension", item.obtenerValor() * 0.3));

	}

	@Override
	public void aplicarDescuento() {
		this.getPoliza().removeGastoAdministrativo(this.getPoliza().mayorGastoAdministrativo());
	}

	public void pagar() {
		this.getPoliza().cambiarEstadoDePoliza(new EstadoPolizaVigente(this.getPoliza()));
	}
	
}