package ar.edu.unq.po2.tp10.Ej2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EstadoMultiplayerTestCase {

	private EstadoMultiplayer estado;
	
	private MaquinaDeVideoJuegos maquina;
	
	@BeforeEach
	void setUp() {
		
		maquina = mock(MaquinaDeVideoJuegos.class);
		
		estado  = new EstadoMultiplayer(maquina);
		
	}
	
	@Test
	void verificacionDeInicializacionDeUnEstadoSinglePlayer() {		
		//Verify		
		assertEquals("Se está jugando en modo multiPlayer.", this.estado.iniciarJuego());
	}


}
