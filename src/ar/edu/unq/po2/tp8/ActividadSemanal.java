package ar.edu.unq.po2.tp8;

public class ActividadSemanal {

	private DiaDeSemana diaDeSemana;
	private int         horaDeInicio;
	private int         duracion;
	private Deporte     deporte;
	
	ActividadSemanal() {
		super();
	}

	ActividadSemanal(DiaDeSemana diaDeSemana, int horaDeIncio, int duracion, Deporte deporte) {
		super();
		this.diaDeSemana = diaDeSemana;
		this.horaDeInicio = horaDeIncio;
		this.duracion = duracion;
		this.deporte = deporte;
	}

	public DiaDeSemana getDiaDeSemana() {
		return diaDeSemana;
	}

	public void setDiaDeSemana(DiaDeSemana diaDeSemana) {
		this.diaDeSemana = diaDeSemana;
	}

	public int getHoraDeInicio() {
		return horaDeInicio;
	}

	public void setHoraDeIncio(int horaDeIncio) {
		this.horaDeInicio = horaDeIncio;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}
	
	public Double costoDeActividadSemanal() {
		Double costoDeActividad = 0d;
		if(esDiaDeActividadBarato()) {
			costoDeActividad = 500d + costoPorComplejidad();
		}else {
			costoDeActividad = 1000d + costoPorComplejidad();
		}
		return costoDeActividad;
	}

	private int costoPorComplejidad() {
		return this.getDeporte().getComplejidad() * 200;
	}

	private boolean esDiaDeActividadBarato() {
		return this.getDiaDeSemana() == DiaDeSemana.LUNES || this.getDiaDeSemana() == DiaDeSemana.MARTES || this.getDiaDeSemana() == DiaDeSemana.MIERCOLES;
	}
	
	@Override
	public String toString() {
		return "Deporte: " + getDeporte() + ". " +
				"Dia: " + getDiaDeSemana() + " " +
				"A LAS: " + getHoraDeInicio() + " . "  +
				"Duracion: " + getDuracion() + " hora(s).";
	}	
	
}


















