package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {

	Persona persona1;
	Persona persona2;
	
	@BeforeEach
	void setUp() {
		persona1 = new Persona("Guido", LocalDate.of(2001, 10, 16));
		persona2 = new Persona("Juan Cruz", LocalDate.of(1993, 05, 12));
	}
	
	@Test
	void testEdad() {

		assertEquals(21, persona1.edad());
		
	}

	@Test
	void testMenorQue() {

		assertTrue(persona1.menorQue(persona2));
		assertFalse(persona2.menorQue(persona1));
		
	}	
}
