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
		
		maquina = mock(MaquinaDeVideoJuegos.class);
		
		estado  = new EstadoSinglePlayer(maquina);
		
	}
	
	@Test
	void verificacionDeInicializacionDeUnEstadoSinglePlayer() {		
		//Verify		
		assertEquals("Se está jugando en modo single player.", this.estado.iniciarJuego());
	}

}
