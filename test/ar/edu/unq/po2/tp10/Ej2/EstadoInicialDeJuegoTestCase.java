package ar.edu.unq.po2.tp10.Ej2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EstadoInicialDeJuegoTestCase {

	private MaquinaDeVideoJuegos maquina;
	
	private EstadoInicialDeJuego estado;
	
	@BeforeEach
	void setUp() {
		
		maquina = mock(MaquinaDeVideoJuegos.class);
		
		estado  = new EstadoInicialDeJuego(maquina);
		
	}
	
	@Test
	void verificacionDeInicializacionDeUnEstadoInicialDeJuego() {		
		assertEquals("Ingresar fichas", this.estado.iniciarJuego());
	}

}
