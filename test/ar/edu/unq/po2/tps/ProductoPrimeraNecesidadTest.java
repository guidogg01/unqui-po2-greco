package ar.edu.unq.po2.tps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tps.ProductoPrimeraNecesidad;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 10d, false, 0.5);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(5d), leche.getPrecio());
	}
}