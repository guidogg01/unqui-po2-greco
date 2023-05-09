package ar.edu.unq.po2.tp8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DeportesDelMunicipio {

	private ArrayList<ActividadSemanal> actividades;


	DeportesDelMunicipio() {
		this.actividades = new ArrayList<ActividadSemanal>();
	}

	public ArrayList<ActividadSemanal> getActividades() {
		return actividades;
	}

	public void setActividades(ArrayList<ActividadSemanal> actividades) {
		this.actividades = actividades;
	}
	
	public void agregarActividad(ActividadSemanal actividadSemanal){
		this.getActividades().add(actividadSemanal);
	}
	
	public List<ActividadSemanal> actividadesDe(Deporte deporte){
		return this.getActividades().stream().filter(a -> a.getDeporte().equals(deporte)).toList();
	}
	
	public List<ActividadSemanal> actividadesDeComplejidad(int nivelDeComplejidad){
		return this.getActividades().stream().filter(a -> a.getDeporte().getComplejidad() == nivelDeComplejidad).toList();
	}
	
	public int totalDeCantHorasSemanales() {
		return this.getActividades().stream().mapToInt(a -> a.getDuracion()).sum();
	}
	
	public ActividadSemanal actividadSemanalDeMenorCosto(Deporte deporteDeInteres){
		return this.getActividades().stream().filter(a -> a.getDeporte().equals(deporteDeInteres))
				   					         .min((ActividadSemanal a1, ActividadSemanal a2) -> a1.costoDeActividadSemanal().compareTo(a2.costoDeActividadSemanal())).get();
	}

	public Map<Deporte, Optional<ActividadSemanal>> actividadesMasEconomicas(){
		return this.getActividades().stream().collect(Collectors.groupingBy(ActividadSemanal::getDeporte,
				                                      Collectors.minBy((Comparator.comparing(ActividadSemanal::costoDeActividadSemanal)))));
	}
	
	@Override
	public String toString() {
		return "SecretariaDeDeporteDelMunicipio [actividadesSemanales=" + actividades.toString() + "]";
	}

	
	
}
















