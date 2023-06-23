package ar.edu.unq.po2.Parciales.Construccion.Composite;

import java.util.List;

public abstract class Obra implements Actividad{

	private List<Operario> operarios;
	private List<Material> materiales;
	
	Obra(List<Operario> operarios, List<Material> materiales) {
		super();
		this.setOperarios(operarios);
		this.setMateriales(materiales);
	}

	public List<Operario> getOperarios() {
		return this.operarios;
	}

	private void setOperarios(List<Operario> operarios) {
		this.operarios = operarios;
	}

	public List<Material> getMateriales() {
		return this.materiales;
	}

	private void setMateriales(List<Material> materiales) {
		this.materiales = materiales;
	}
	
	public abstract double costoTotal();
	
}
