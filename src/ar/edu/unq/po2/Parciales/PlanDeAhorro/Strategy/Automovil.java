package ar.edu.unq.po2.Parciales.PlanDeAhorro.Strategy;

import ar.edu.unq.po2.Parciales.PlanDeAhorro.PlanDeAhorro;

public class Automovil extends RetribucionStrategy {
	
	private FabricaAutomotriz fabrica;

	Automovil(PlanDeAhorro planDeAhorro, FabricaAutomotriz fabrica) {
		super(planDeAhorro);
		this.setFabrica(fabrica);
	}

	public FabricaAutomotriz getFabrica() {
		return fabrica;
	}
	
	public void setFabrica(FabricaAutomotriz fabrica) {
		this.fabrica = fabrica;
	}

	@Override
	public void ejecutarRetribucion() {
		this.getFabrica().comprarAutomovil(this.getPlanDeAhorro().getMarca(), this.getPlanDeAhorro().getModelo());
		this.getFabrica().valorAutomovil(this.getPlanDeAhorro().getMarca(), this.getPlanDeAhorro().getModelo());
	}
	
}
