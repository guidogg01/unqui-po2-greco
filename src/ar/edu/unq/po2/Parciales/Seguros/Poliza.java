package ar.edu.unq.po2.Parciales.Seguros;

import java.util.List;

import java.util.ArrayList;

public class Poliza {
	
	private List<Item> items;
	private List<GastoAdministrativo> gastosAdministrativos;
	private BonificacionService bonificacionService;
	private EstadoPoliza estadoPoliza;

	public Poliza() { // Cuando la poliza no tiene bonificacion
		this.setItems(new ArrayList<Item>());
		this.setGastosAdministrativos(new ArrayList<GastoAdministrativo>());
		this.cambiarEstadoDePoliza(new EstadoPolizaAbierta(this));
	}
	
	public Poliza(BonificacionService bonificacionService) { // Cuando la poliza tiene bonificacion
		this.setItems(new ArrayList<Item>());
		this.setGastosAdministrativos(new ArrayList<GastoAdministrativo>());
		this.setBonificacionService(bonificacionService);
		this.cambiarEstadoDePoliza(new EstadoPolizaAbierta(this));
	}

	public List<Item> getItems() {
		return items;
	}

	private void setItems(List<Item> items) {
		this.items = items;
	}

	public List<GastoAdministrativo> getGastosAdministrativos() {
		return gastosAdministrativos;
	}

	private void setGastosAdministrativos(List<GastoAdministrativo> gastosAdministrativos) {
		this.gastosAdministrativos = gastosAdministrativos;
	}
	
	public BonificacionService getBonificacionService() {
		return bonificacionService;
	}
	
	private void setBonificacionService(BonificacionService bonificacionService) {
		this.bonificacionService = bonificacionService;
	}
	
	public EstadoPoliza getEstadoPoliza() {
		return estadoPoliza;
	}
	
	public void cambiarEstadoDePoliza(EstadoPoliza estadoPoliza) {
		this.estadoPoliza = estadoPoliza;
	}
	
	public Double montoAsegurado() {
		return this.getItems().stream().mapToDouble(i -> i.obtenerValor()).sum();
	}
	
	public Double precio() {
		return this.montoAsegurado() * 0.075 + montoTotalDeGastosAdministrativos();
	}

	private double montoTotalDeGastosAdministrativos() {
		return this.getGastosAdministrativos()
				   .stream()
				   .mapToDouble(ga -> ga.monto)
				   .sum();
	}
	
	public void agregarItem(Item item) {
		this.estadoPoliza.agregarItem(item);
	}
	
	public void addItem(Item item) {
		this.getItems().add(item);
	}
	
	public void aplicarBono(int codigo, String mail){
		if (this.getBonificacionService().codigoAprobado(codigo)) {
			this.getEstadoPoliza().aplicarDescuento();
			this.getBonificacionService().anularCodigo(codigo);
			this.getBonificacionService().notificarTitular(mail, codigo);
		}
	}
	
	public void addGastoAdministrativo(GastoAdministrativo gastoAdministrativo) {
		this.getGastosAdministrativos()
		    .add(gastoAdministrativo);
	}
	
	public GastoAdministrativo mayorGastoAdministrativo() {
		return this.getGastosAdministrativos()
				   .stream()
				   .max((GastoAdministrativo ga1, GastoAdministrativo ga2) -> ga1.getMonto().compareTo(ga2.getMonto()))
				   .get();
	}
	
	public void removeGastoAdministrativo(GastoAdministrativo gastoAdministrativo) {
		if(this.getGastosAdministrativos().size() > 0) {
			this.getGastosAdministrativos().remove(gastoAdministrativo);
		}
	}
	
	public void removeAllGastosAministrativos() {
		this.getGastosAdministrativos().removeAll(gastosAdministrativos);
	}
}