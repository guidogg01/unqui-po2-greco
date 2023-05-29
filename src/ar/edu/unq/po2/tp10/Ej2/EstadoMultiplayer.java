package ar.edu.unq.po2.tp10.Ej2;

public class EstadoMultiplayer extends EstadoDeJuego {

	EstadoMultiplayer(MaquinaDeVideoJuegos maquina) {
		super(maquina);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String iniciarJuego() {
		super.getMaquina().setEstadoDeJuego(new EstadoSinglePlayer(this.getMaquina()));
		return "Se está jugando en modo multiPlayer.";
	}	

}
