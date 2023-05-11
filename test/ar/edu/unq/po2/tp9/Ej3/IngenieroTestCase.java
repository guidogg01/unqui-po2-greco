package ar.edu.unq.po2.tp9.Ej3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;

class IngenieroTestCase {
	
	private Point punto1;

	private Ingeniero ingeniero1;
	
	@BeforeEach
	void setUp() {
		
		ingeniero1 = new Ingeniero();
		
		punto1 = mock(Point.class);
		
	}
	
	@Test
	void testCuandoCaminaElIngeniero() {
		
		when(punto1.getX()).thenReturn(2);
		when(punto1.getY()).thenReturn(4);
		
		
		ingeniero1.desplazarse(punto1);
		
		assertEquals(2, ingeniero1.getUbicacionEnEjeX()); //PREGUNTAR LO DEL SPY.
		
	}

}