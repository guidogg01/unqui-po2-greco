package ar.edu.unq.po2.tp10.Ej3;

public class EstadoPausado extends EstadoDeReproductor {

	EstadoPausado(ReproductorMP3 reproductor) {
		super(reproductor);
	}

	@Override
	public void play(ISong song) {
		System.out.println("Error: No se esta en modo de seleccion de canciones.");
	}

	@Override
	public void pause() {
		System.out.println("Se esta reproduciendo la cancion.");
		this.getReproductor().setEstadoDeReproductor(new EstadoReproduciendo(this.getReproductor()));
	}

	@Override
	public void stop() {
		System.out.println("Se pausa la cancion.");
		this.getReproductor().setEstadoDeReproductor(new EstadoSeleccionDeCanciones(this.getReproductor()));
	}
}
