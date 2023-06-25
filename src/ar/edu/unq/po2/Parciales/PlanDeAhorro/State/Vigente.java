package ar.edu.unq.po2.Parciales.PlanDeAhorro.State;

import ar.edu.unq.po2.Parciales.PlanDeAhorro.PlanDeAhorro;

public class Vigente extends EstadoPlanDeAhorro {

	Vigente(PlanDeAhorro planDeAhorro) {
		super(planDeAhorro);
	}

	@Override
	public void pagarCuota() {
		this.getPlanDeAhorro().pagarCuota();
		if (this.getPlanDeAhorro().esUltimaCuota()) {
			this.getPlanDeAhorro().setEstadoPlanDeAhorro(new Finalizado(this.getPlanDeAhorro()));
		}
	}

}
