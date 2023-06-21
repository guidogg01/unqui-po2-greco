package ar.edu.unq.po2.tp10.Ej3;

public class EstadoSeleccionDeCanciones extends EstadoDeReproductor {

	EstadoSeleccionDeCanciones(ReproductorMP3 reproductor) {
		super(reproductor);
	}

	@Override
	public void play(ISong song) {
		System.out.println("Se esta reproduciendo una cancion.");
		song.play();
		this.getReproductor().setEstadoDeReproductor(new EstadoReproduciendo(this.getReproductor()));
	}

	@Override
	public void pause() {
		System.out.println("Error: No se esta reproduciendo ninguna cancion.");
	}

	@Override
	public void stop() {
		System.out.println("Error: No se esta reproduciendo ninguna cancion.");
	}

}
