package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase {

	private Point punto1;
	private Point punto2;
	
	@BeforeEach
	void setUp(){
		
		punto1 = new Point();
		punto2 = new Point(4,6);
	}
	
	@Test
	void testComprobarPunto() {

		assertEquals(4, punto2.getX());
		
	}
	
	@Test
	void testMoverPunto() {

		punto1.moverPunto(3, 8);
		
		assertEquals(8, punto1.getY());
		
	}
	
	@Test
	void testSumarPuntos() {

		punto1.moverPunto(3, 8);
		
		punto1.sumarPuntos(punto2);
		
		assertEquals(14, punto1.getY());
		
	}

}




















