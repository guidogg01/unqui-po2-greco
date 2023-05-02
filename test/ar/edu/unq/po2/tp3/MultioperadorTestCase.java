package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {

	private Multioperador multioperador1;
	
	@BeforeEach
	public void setUp(){
		
		multioperador1 = new Multioperador();
		
		multioperador1.agregarNumeros(1);
		multioperador1.agregarNumeros(2);
		multioperador1.agregarNumeros(3);
		multioperador1.agregarNumeros(5);
		multioperador1.agregarNumeros(20);
		
	}
		
	
	
	@Test
	void sumaTotalDeNumeros() {
		
		int sumaTotal = multioperador1.sumaTotal();
		
		assertEquals(31, sumaTotal);
		
	}
	
	@Test
	void restaTotalDeNumeros() {
		
		int restaTotal = multioperador1.restaTotal();
		
		assertEquals(-29, restaTotal);
		
	}
	
	@Test
	void multiplicaciónTotalDeNumeros() {
		
		int multiplicaciónTotal = multioperador1.multiplicacionTotal();
		
		assertEquals(600, multiplicaciónTotal);
		
	}

}




























