package ar.edu.unq.po2.tp10.Ej2;

public abstract class EstadoDeJuego {

	private MaquinaDeVideoJuegos maquina;
	
	// Se instancia la clase abstracta ya que las clases hijas de esta clase
	// van a tener este constrcutor. Por lo tanto, en vez de crear este constructor
	// para cada clase hija, se hace solamente acá y ya está.
	EstadoDeJuego(MaquinaDeVideoJuegos maquina) {
		super();
		this.setMaquina(maquina);
	}

	public MaquinaDeVideoJuegos getMaquina() {
		return maquina;
	}

	public void setMaquina(MaquinaDeVideoJuegos maquina) {
		this.maquina = maquina;
	}
	
	public abstract String iniciarJuego();
	
}
