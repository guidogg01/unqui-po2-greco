package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {

	Rectangulo rectangulo1;
	Point punto1;
	Point punto2;
	Point punto3;
	Point punto4;
	
	@BeforeEach
	void setUp() {
		Point punto1 = new Point();
		Point punto2 = new Point(6,0);
		Point punto3 = new Point(0,4);
		Point punto4 = new Point(6,4);
		rectangulo1  = new Rectangulo(punto1, punto2, punto3, punto4);
	}
	
	@Test
	void testÁrea() {
		
		assertEquals(24 ,rectangulo1.área());
		
	}
	
	@Test
	void testPerímetro() {
		
		assertEquals(20 ,rectangulo1.perímetro());
		
	}
}