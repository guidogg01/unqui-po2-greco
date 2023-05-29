package ar.edu.unq.po2.tp10.Ej2;

public class EstadoSinglePlayer extends EstadoDeJuego{
	
	EstadoSinglePlayer(MaquinaDeVideoJuegos maquina) {
		super(maquina);
	}

	@Override
	public String iniciarJuego() {
		super.getMaquina().setEstadoDeJuego(new EstadoSinglePlayer(this.getMaquina()));
		return "Se está jugando en modo single player.";
	}	
	
}
