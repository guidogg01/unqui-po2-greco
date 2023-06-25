package ar.edu.unq.po2.Parciales.PlanDeAhorro;

import java.util.List;

public class Concesionario {

	private List<PlanDeAhorro> planes;

	Concesionario(List<PlanDeAhorro> planes) {
		super();
		this.planes = planes;
	}

	public List<PlanDeAhorro> getPlanes() {
		return planes;
	}

	public void setPlanes(List<PlanDeAhorro> planes) {
		this.planes = planes;
	}
	
	public double cantCuotasPendientes() {
		return this.getPlanes().stream()
		                       .filter(p -> p.getEstadoPlanDeAhorro().noEsCreada())
		                       .mapToDouble(p -> p.cantCuotasPendientes()).sum();         

	}
	
}
