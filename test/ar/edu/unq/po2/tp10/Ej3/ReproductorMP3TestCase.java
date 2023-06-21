package ar.edu.unq.po2.tp10.Ej3;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReproductorMP3TestCase {
	
	private ReproductorMP3 reproductor;
	
	private EstadoSeleccionDeCanciones estadoSeleccionDeCanciones;
	
	private ISong song;

	@BeforeEach
	void setUp() {
		
		estadoSeleccionDeCanciones = mock(EstadoSeleccionDeCanciones.class);
		
		song = mock(ISong.class);
		
		reproductor = new ReproductorMP3(song);
	
	}

	@Test
	void verificacionDeInicializacionDeReproductor() { 
		
		reproductor.setEstadoDeReproductor(estadoSeleccionDeCanciones);
		reproductor.play(song);
		
		verify(estadoSeleccionDeCanciones, times(1)).play(song);
	}

}