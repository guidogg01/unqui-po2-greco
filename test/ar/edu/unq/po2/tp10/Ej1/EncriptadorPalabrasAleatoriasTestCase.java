package ar.edu.unq.po2.tp10.Ej1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EncriptadorPalabrasAleatoriasTestCase {

	private EncriptadorPalabrasAleatorias encriptador;
	
	@BeforeEach
	void setUp() {
		
		encriptador = new EncriptadorPalabrasAleatorias();
		
	}
	
	@Test
	void verificacionDeEncriptacionDeMensaje() {
	
		String mensajeAEncriptar = "¿Hola, como estás?";
		String mensajeEsperado   = "?sátse omoc ,aloH¿";
		
		String mensajeEncriptadoObtenido = encriptador.encriptar(mensajeAEncriptar);
		
		assertEquals(mensajeEsperado, mensajeEncriptadoObtenido);
	}
	
	@Test
	void verificacionDeDesncriptacionDeMensaje() {
	
		String mensajeADesencriptar = "?sátse omoc ,aloH¿";
		String mensajeEsperado      = "¿Hola, como estás?";
		
		String mensajeEncriptadoObtenido = encriptador.desencriptar(mensajeADesencriptar);
		
		assertEquals(mensajeEsperado, mensajeEncriptadoObtenido);
	}

}
