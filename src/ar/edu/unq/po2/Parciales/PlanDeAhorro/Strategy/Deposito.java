package ar.edu.unq.po2.Parciales.PlanDeAhorro.Strategy;

import ar.edu.unq.po2.Parciales.PlanDeAhorro.PlanDeAhorro;

public class Deposito extends RetribucionStrategy {

	private FabricaAutomotriz fabrica;
	private RedBancaraia red;
	
	Deposito(PlanDeAhorro planDeAhorro, FabricaAutomotriz fabrica, RedBancaraia red) {
		super(planDeAhorro);
		this.fabrica = fabrica;
		this.red = red;
	}

	public FabricaAutomotriz getFabrica() {
		return fabrica;
	}

	public void setFabrica(FabricaAutomotriz fabrica) {
		this.fabrica = fabrica;
	}

	public RedBancaraia getRed() {
		return red;
	}

	public void setRed(RedBancaraia red) {
		this.red = red;
	}

	@Override
	public void ejecutarRetribucion() {
		this.getFabrica().comprarAutomovil(this.getPlanDeAhorro().getMarca(), this.getPlanDeAhorro().getModelo());
		float montoDeVehiculo = this.getFabrica().valorAutomovil(this.getPlanDeAhorro().getMarca(), this.getPlanDeAhorro().getModelo());
		
		this.getRed().depositar(montoDeVehiculo, this.getPlanDeAhorro().getCBU());
	}
	
}
