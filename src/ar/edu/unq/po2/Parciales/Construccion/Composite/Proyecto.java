package ar.edu.unq.po2.Parciales.Construccion.Composite;

import java.util.List;
import java.util.ArrayList;

public class Proyecto implements Actividad{

	private List<Actividad> actividades;

	Proyecto(List<Actividad> actividades) {
		super();
		this.setActividades(new ArrayList<Actividad>());
	}

	public List<Actividad> getActividades() {
		return actividades;
	}

	private void setActividades(List<Actividad> actividades) {
		this.actividades = actividades;
	}

	public void agregarProyecto(Actividad actividad) {
		this.getActividades().add(actividad);
	}
	
	@Override
	public double costoTotal() {
		return this.getActividades().stream().mapToDouble(a -> a.costoTotal()).sum();
	}
	
}
