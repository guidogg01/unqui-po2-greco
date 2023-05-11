package ar.edu.unq.po2.tp9.Ej2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParcelaMixtaTestCase {
	
	private ParcelaMixta parcelaMixta1;
	
	private ParcelaPura  parcelaPura1;
	private ParcelaPura  parcelaPura2;
	private ParcelaPura  parcelaPura3;

	@BeforeEach
	void setUp() {
		
		parcelaMixta1 = new ParcelaMixta();
		
		parcelaPura1 = mock(ParcelaPura.class);
		parcelaPura2 = mock(ParcelaPura.class);
		parcelaPura3 = mock(ParcelaPura.class);
		
		parcelaMixta1.agregarParcela(parcelaPura1);
		parcelaMixta1.agregarParcela(parcelaPura2);
		parcelaMixta1.agregarParcela(parcelaPura3);
	}
	
	@Test
	void testCostoAnualDeParcelaMixta() {
		
		when(parcelaPura1.gananciasAnuales()).thenReturn(500d);
		when(parcelaPura2.gananciasAnuales()).thenReturn(300d);
		when(parcelaPura3.gananciasAnuales()).thenReturn(500d);
		
		assertEquals(1300, parcelaMixta1.gananciasAnuales());
		
	}
}
