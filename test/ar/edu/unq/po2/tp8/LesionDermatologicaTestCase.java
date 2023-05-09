package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LesionDermatologicaTestCase {
	
	@Test
	void test() {
		System.out.println(LesionDermatologica.GRIS);
		System.out.println(LesionDermatologica.ROJO.siguienteLesion(LesionDermatologica.ROJO));
		assertEquals(LesionDermatologica.GRIS, LesionDermatologica.ROJO.siguienteLesion(LesionDermatologica.ROJO));
	}

}