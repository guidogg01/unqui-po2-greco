package ar.edu.unq.po2.tp10.Ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EstadoInicialDeJuegoTestCase {

	private EstadoInicialDeJuego estado;
	
	@BeforeEach
	void setUp() {
		
		estado = new EstadoInicialDeJuego();
		
	}
	
	@Test
	void verificacionDeInicializacionDeUnEstadoInicialDeJuego() {
		
		String estadoEsperado = "Ingresar fichas";
		
		assertEquals(estadoEsperado, this.estado.iniciarJuego());
	}

}
