package ar.edu.unq.po2.Parciales.PlanDeAhorro.State;

import ar.edu.unq.po2.Parciales.PlanDeAhorro.PlanDeAhorro;
import ar.edu.unq.po2.Parciales.PlanDeAhorro.Strategy.RetribucionStrategy;

public class Creado extends EstadoPlanDeAhorro {

	Creado(PlanDeAhorro planDeAhorro) {
		super(planDeAhorro);
	}

	@Override
	public void pagarCuota() {
		this.getPlanDeAhorro().pagarCuota();
		this.getPlanDeAhorro().setEstadoPlanDeAhorro(new Vigente(this.getPlanDeAhorro()));
	}
	
	@Override
	public boolean noEsCreada() {
		return false;
	}
	
	public void setRetribucion(RetribucionStrategy retribucion) {
		this.getPlanDeAhorro().setRetribucionStrategy(retribucion);
	}

}
