package ar.edu.unq.po2.tp10.Ej2;

public class EstadoInicialDeJuego extends EstadoDeJuego{
	
	EstadoInicialDeJuego(MaquinaDeVideoJuegos maquina) {
		super(maquina);
	}

	@Override
	public String iniciarJuego() {
		String mensajeEsperado = "Ingresar fichas";
		
		if(super.getMaquina().getCantFichasIngresadas() == 1) {
			this.getMaquina().setEstadoDeJuego(new EstadoSinglePlayer(this.getMaquina()));
			mensajeEsperado = "Se está iniciando el modo single player";
		} else if (super.getMaquina().getCantFichasIngresadas() == 2) {
			this.getMaquina().setEstadoDeJuego(new EstadoMultiplayer(this.getMaquina()));
			mensajeEsperado = "Se está iniciando el modo multiPlayer";
		}
		
		return mensajeEsperado;
	
	}	
	
}