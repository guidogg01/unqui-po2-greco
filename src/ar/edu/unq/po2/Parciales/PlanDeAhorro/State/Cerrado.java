package ar.edu.unq.po2.Parciales.PlanDeAhorro.State;

import ar.edu.unq.po2.Parciales.PlanDeAhorro.PlanDeAhorro;

public class Cerrado extends EstadoPlanDeAhorro {

	Cerrado(PlanDeAhorro planDeAhorro) {
		super(planDeAhorro);
	}

	@Override
	public void pagarCuota() {
		// No hace nada debido a que cuando está en estado Finalizado no se hace nada cuando se paga una cuota.
	}

}
