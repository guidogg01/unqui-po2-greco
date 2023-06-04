package ar.edu.unq.po2.tp9.Ej2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ParcelaPuraTestCase {
	
	private ParcelaPura  parcelaPura1;
	
	private Soja         soja1;
	private Trigo        trigo1;
	
	@BeforeEach
	void setUp() {
		
		soja1        = mock(Soja.class);
		trigo1       = mock(Trigo.class);
		
	}
	
	@Test
	void testCostoAnualDeParcelaPuraDeSoja() {
		
		when(soja1.getPrecio()).thenReturn(500d);
		
		parcelaPura1 = new ParcelaPura(soja1);
		
		assertEquals(500d, parcelaPura1.gananciasAnuales());
		
	}
	
	@Test
	void testCostoAnualDeParcelaPuraDeTrigo() {
		
		when(trigo1.getPrecio()).thenReturn(300d);
		
		parcelaPura1 = new ParcelaPura(trigo1);
		
		assertEquals(300d, parcelaPura1.gananciasAnuales());
		
	}

}