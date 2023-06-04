package ar.edu.unq.po2.Parciales.Seguros;

public class EstadoPolizaAbierta extends EstadoPoliza {
	
	public EstadoPolizaAbierta(Poliza poliza) {
		super(poliza);
	}

	@Override
	public void agregarItem(Item item) {
		this.getPoliza().addItem(item);

	}
	
	@Override
	public void aplicarDescuento() {
		this.getPoliza().addGastoAdministrativo(new GastoAdministrativo("Bonificacion Administrativa", -500d));;
	}
	
	public String cerrarInventario() {
		this.getPoliza().cambiarEstadoDePoliza(new EstadoPolizaCerrada(this.getPoliza()));
		return "Se a finalizado la carga del inventario.";
	}

}