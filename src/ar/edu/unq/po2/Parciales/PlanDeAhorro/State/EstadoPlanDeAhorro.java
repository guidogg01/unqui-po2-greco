package ar.edu.unq.po2.Parciales.PlanDeAhorro.State;

import ar.edu.unq.po2.Parciales.PlanDeAhorro.PlanDeAhorro;

public abstract class EstadoPlanDeAhorro {

	private PlanDeAhorro planDeAhorro;
	
	EstadoPlanDeAhorro(PlanDeAhorro planDeAhorro) { 
		// No se puede instanciar una clase abstracta pero se hace de esta manera para que las clases hijas 
		//  ya tengan este constructor.
		super();
		this.setPlanDeAhorro(planDeAhorro);
	}

	public PlanDeAhorro getPlanDeAhorro() {
		return planDeAhorro;
	}

	public void setPlanDeAhorro(PlanDeAhorro planDeAhorro) {
		this.planDeAhorro = planDeAhorro;
	}
	
	public abstract void pagarCuota();
	
	public boolean noEsCreada() {
		return true;
	}
	
}
