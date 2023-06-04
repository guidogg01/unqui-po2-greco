package ar.edu.unq.po2.Parciales.Seguros;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SegurosTestCase {

	private Poliza poliza;
	
	@BeforeEach
	void setUp() {
		
		poliza = new Poliza();
		
	}

	@Test
	void verificacionDeInicializacionDeUnaPolizaDeSeguroSinBonificacion() {
						
		assertTrue(this.poliza.getItems().isEmpty());
		assertTrue(this.poliza.getGastosAdministrativos().isEmpty());
		assertEquals(new EstadoPolizaAbierta(poliza), this.poliza.getEstadoPoliza()); //Falta arreglar esto...
		
	}
	
}
