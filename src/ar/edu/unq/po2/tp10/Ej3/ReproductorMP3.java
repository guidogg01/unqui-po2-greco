package ar.edu.unq.po2.tp10.Ej3;

public class ReproductorMP3 {

	private EstadoDeReproductor estadoDeReproductor;
	private ISong song;
	
	ReproductorMP3(ISong song) {
		super();
		this.setEstadoDeReproductor(new EstadoSeleccionDeCanciones(this));
		this.setSong(song);
	}

	public EstadoDeReproductor getEstadoDeReproductor() {
		return estadoDeReproductor;
	}

	public void setEstadoDeReproductor(EstadoDeReproductor estadoReproductor) {
		this.estadoDeReproductor = estadoReproductor;
	}

	public ISong getSong() {
		return song;
	}

	private void setSong(ISong song) {
		this.song = song;
	}
	
	public void play(ISong song) {
		this.getEstadoDeReproductor().play(song);
	}
	
	public void pause() {
		this.getEstadoDeReproductor().pause();
	} 
	
	public void stop() {
		this.getEstadoDeReproductor().stop();
	}
	
}
