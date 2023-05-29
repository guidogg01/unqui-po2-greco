package ar.edu.unq.po2.tp10.Ej2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EstadoSinglePlayerTestCase {

	private EstadoSinglePlayer estado;
	
	private MaquinaDeVideoJuegos maquina;
	
	@BeforeEach
	void setUp() {
		
		estado  = new EstadoSinglePlayer(maquina);
		
		maquina = mock(MaquinaDeVideoJuegos.class);
		
	}
	
	@Test
	void verificacionDeInicializacionDeUnEstadoSinglePlayer() {
		
		when(maquina.setEstadoDeJuego(estado)).thenReturn("Se está jugando en modo single player");

		String estadoEsperado = "Se está jugando en modo single player.";
				
		assertEquals(estadoEsperado, this.estado.iniciarJuego());
		
	}

}
