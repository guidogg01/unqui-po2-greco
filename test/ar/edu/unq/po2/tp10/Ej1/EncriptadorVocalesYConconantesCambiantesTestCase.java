package ar.edu.unq.po2.tp10.Ej1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EncriptadorVocalesYConconantesCambiantesTestCase {

	private EncriptadorVocalesYConconantesCambiantes encriptador;
	
	@BeforeEach
	void setUp() {
		
		encriptador = new EncriptadorVocalesYConconantesCambiantes();
		
	}
	
	@Test
	void verificacionDeEncriptacionDeMensaje() {
	
		String mensajeAEncriptar = "¿Hola, como estas?";
		String mensajeEsperado   = "¿hule, cumu istes?";
		
		String mensajeEncriptadoObtenido = encriptador.encriptar(mensajeAEncriptar);
		
		assertEquals(mensajeEsperado, mensajeEncriptadoObtenido);
	}
	
	@Test
	void verificacionDeDesencriptacionDeMensaje() {
	
		String mensajeADesencriptar = "¿Hule, cumu istes?";
		String mensajeEsperado      = "¿hola, como estas?";
		
		String mensajeEncriptadoObtenido = encriptador.desencriptar(mensajeADesencriptar);
		
		assertEquals(mensajeEsperado, mensajeEncriptadoObtenido);
	}

}
