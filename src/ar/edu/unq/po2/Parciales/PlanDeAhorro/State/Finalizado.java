package ar.edu.unq.po2.Parciales.PlanDeAhorro.State;

import ar.edu.unq.po2.Parciales.PlanDeAhorro.PlanDeAhorro;

public class Finalizado extends EstadoPlanDeAhorro {

	Finalizado(PlanDeAhorro planDeAhorro) {
		super(planDeAhorro);
	}

	@Override
	public void pagarCuota() {
		// No hace nada debido a que cuando está en estado Finalizado no se hace nada cuando se paga una cuota.
	}

	public void ejecutarRetribucion() {
		this.getPlanDeAhorro().ejecutarRetribucion();
		this.getPlanDeAhorro().setEstadoPlanDeAhorro(new Cerrado(this.getPlanDeAhorro()));
	}
	
}
