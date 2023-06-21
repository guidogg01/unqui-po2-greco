package ar.edu.unq.po2.tp10.Ej3;

public abstract class EstadoDeReproductor {

	private ReproductorMP3 reproductor;

	EstadoDeReproductor(ReproductorMP3 reproductor) { // Se pone el constructor en el la clase abstract para no 
		super();                                      //  tener que hacer con cada uno de los ConcreteStates.
		this.setReproductor(reproductor);
	}

	public ReproductorMP3 getReproductor() {
		return reproductor;
	}

	private void setReproductor(ReproductorMP3 reproductor) {
		this.reproductor = reproductor;
	}
	
	public abstract void play(ISong song);
	public abstract void pause();
	public abstract void stop();
	
}
