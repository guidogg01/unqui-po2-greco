package ar.edu.unq.po2.tp9.Ej2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ParcelaTestCase {

	private ParcelaMixta parcelaMixta1;
	private ParcelaMixta parcelaMixta2;
	
	private ParcelaPura  parcelaPura1;
	private ParcelaPura  parcelaPura2;
	private ParcelaPura  parcelaPura3;
	private ParcelaPura  parcelaPura4;
	private ParcelaPura  parcelaPura5;
	
	private Soja         soja1;
	private Trigo        trigo1;
	
	@BeforeEach
	void setUp() {
		
		parcelaMixta1 = new ParcelaMixta();
		parcelaMixta2 = new ParcelaMixta();
		
		parcelaPura1 = mock(ParcelaPura.class);
		parcelaPura2 = mock(ParcelaPura.class);
		parcelaPura3 = mock(ParcelaPura.class);
		parcelaPura4 = mock(ParcelaPura.class);
		parcelaPura5 = mock(ParcelaPura.class);

		parcelaMixta1.agregarParcela(parcelaPura1);
		parcelaMixta1.agregarParcela(parcelaPura2);
		parcelaMixta1.agregarParcela(parcelaPura3);
		
		parcelaMixta2.agregarParcela(parcelaPura4);
		parcelaMixta2.agregarParcela(parcelaPura5);	
		
		soja1        = mock(Soja.class);
		trigo1       = mock(Trigo.class);
		
	}
	
	@Test
	void testCostoAnualDeParcelaPuraDeSoja() {
		
		when(soja1.getPrecio()).thenReturn(500d);
		
		parcelaPura1 = new ParcelaPura(soja1);
		
		assertEquals(500, parcelaPura1.gananciasAnuales());
		
	}
	
	@Test
	void testCostoAnualDeParcelaPuraDeTrigo() {
		
		when(trigo1.getPrecio()).thenReturn(300d);
		
		parcelaPura1 = new ParcelaPura(trigo1);
		
		assertEquals(300, parcelaPura1.gananciasAnuales());
		
	}
	
	@Test
	void testCostoAnualDeParcelaMixta() {
		
		when(parcelaPura1.gananciasAnuales()).thenReturn(500d);
		when(parcelaPura2.gananciasAnuales()).thenReturn(300d);
		when(parcelaPura3.gananciasAnuales()).thenReturn(500d);
		
		assertEquals(1300, parcelaMixta1.gananciasAnuales());
		
	}

	@Test
	void testCostoDeCultivoDeTrigo() {
		
		trigo1 = new Trigo();
		
		assertEquals(300, trigo1.getPrecio());
		
	}
	
	@Test
	void testCostoDeCultivoDeSoja() {
		
		soja1 = new Soja();
		
		assertEquals(500, soja1.getPrecio());
		
	}

}