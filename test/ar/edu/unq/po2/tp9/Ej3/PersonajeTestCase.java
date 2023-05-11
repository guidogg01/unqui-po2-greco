package ar.edu.unq.po2.tp9.Ej3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;

class PersonajeTestCase {

	private Ejercito ejercito1;
	
	private Ingeniero ingeniero1;
	private Caballero caballero1;
	
	private Point     punto1;
	
	@BeforeEach
	void setUp() {
		
		ejercito1 = new Ejercito();
		
		caballero1 = new Caballero();
		
		ejercito1.agregarPersonaje(ingeniero1);
		ejercito1.agregarPersonaje(caballero1);
	
		punto1 = mock(Point.class);
				
	}
	
	@Test
	void testCuandoCaminaElCaballero() {
		
		when(punto1.getX()).thenReturn(2);
		when(punto1.getY()).thenReturn(4);
		
		caballero1.desplazarse(punto1);
		
		assertEquals(2, caballero1.getUbicacionEnEjeX()); //PREGUNTAR LO DEL SPY.
		
	}

}