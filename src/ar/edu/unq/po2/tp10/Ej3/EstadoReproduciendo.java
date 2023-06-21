package ar.edu.unq.po2.tp10.Ej3;

public class EstadoReproduciendo extends EstadoDeReproductor {

	EstadoReproduciendo(ReproductorMP3 reproductor) {
		super(reproductor);
	}

	@Override
	public void play(ISong song) {
		System.out.println("Se esta reproduciendo una cancion.");
	}

	@Override
	public void pause() {
		System.out.println("Se pausa la cancion.");
		this.getReproductor().setEstadoDeReproductor(new EstadoPausado(this.getReproductor()));
	}

	@Override
	public void stop() {
		System.out.println("Se pausa la cancion.");
		this.getReproductor().setEstadoDeReproductor(new EstadoSeleccionDeCanciones(this.getReproductor()));
	}

}
