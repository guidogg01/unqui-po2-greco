package ar.edu.unq.po2.tp9.Ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CultivoTestCase {
	
	private Soja         soja1;
	private Trigo        trigo1;
	
	@Test
	void testCostoDeCultivoDeSoja() {
		
		soja1 = new Soja();
		
		assertEquals(500, soja1.getPrecio());
		
	}
	
	@Test
	void testCostoDeCultivoDeTrigo() {
		
		trigo1 = new Trigo();
		
		assertEquals(300, trigo1.getPrecio());
		
	}
}
