package ar.edu.unq.po2.tp8;

public enum LesionDermatologica {

	ROJO("Llagas", 1), GRIS("Roncha", 2), AMARILLO("Sarpullido", 3), MIEL("Herida profunda", 4, ROJO);
	
	//MIEL("Herida profunda", 4, ROJO), AMARILLO("Sarpullido", 3, MIEL), GRIS("Roncha", 2, AMARILLO), ROJO("Llagas", 1, GRIS);
	
	private String descripcionPredefinida;
	private int    nivelDeRiesgo;
	private LesionDermatologica siguienteProcesoDeMaduración;	
	
	private LesionDermatologica() {
	}

	private LesionDermatologica(String descripcionPredefinida, int nivelDeRiesgo, LesionDermatologica siguienteProcesoDeMaduración) {
		this.descripcionPredefinida = descripcionPredefinida;
		this.nivelDeRiesgo = nivelDeRiesgo;
		this.siguienteProcesoDeMaduración = siguienteProcesoDeMaduración;
	}

	public String getDescripcionPredefinida() {
		return descripcionPredefinida;
	}

	public void setDescripcionPredefinida(String descripcionPredefinida) {
		this.descripcionPredefinida = descripcionPredefinida;
	}

	public int getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}

	public void setNivelDeRiesgo(int nivelDeRiesgo) {
		this.nivelDeRiesgo = nivelDeRiesgo;
	}

	public LesionDermatologica getSiguienteProcesoDeMaduración() {
		return siguienteProcesoDeMaduración;
	}

	public void setSiguienteProcesoDeMaduración(LesionDermatologica siguienteProcesoDeMaduración) {
		this.siguienteProcesoDeMaduración = siguienteProcesoDeMaduración;
	}
	
	ROJO.setSiguienteProcesoDeMaduración(GRIS);
	
	GRIS.setSiguienteProcesoDeMaduración(AMARILLO);
	AMARILLO.setSiguienteProcesoDeMaduración(MIEL);
	MIEL.setSiguienteProcesoDeMaduración(ROJO);
	
}
