package ar.edu.unq.po2.tp10.Ej2;

public class MaquinaDeVideoJuegos {

	private int cantFichasIngresadas;
	private EstadoDeJuego estadoDeJuego;
	
	MaquinaDeVideoJuegos() {
		super();
		this.setCantFichasIngresadas(0);
		this.setEstadoDeJuego(new EstadoInicialDeJuego(this));
	}

	public int getCantFichasIngresadas() {
		return cantFichasIngresadas;
	}

	public void setCantFichasIngresadas(int cantFichasIngresadas) {
		this.cantFichasIngresadas = cantFichasIngresadas;
	}

	public EstadoDeJuego getEstadoDeJuego() {
		return estadoDeJuego;
	}

	// Este setter es public ya que cada estado (de IEstadoDeJuego)
	// modifica el estado interno del juego de la maquina de video juegos. 
	public void setEstadoDeJuego(EstadoDeJuego estadoDeJuego) {
		this.estadoDeJuego = estadoDeJuego;
	}
	
	public String presionarBotonDeInicio() {
		return this.getEstadoDeJuego().iniciarJuego();
	}
	
	public void ingresarFicha() {
		this.setCantFichasIngresadas(cantFichasIngresadas + 1);
	}
	
}
