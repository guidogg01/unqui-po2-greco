package ar.edu.unq.po2.tp10.Ej1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EncriptadorLetrasPorNumerosTestCase {

	private EncriptadorLetrasPorNumeros encriptador;
	
	@BeforeEach
	void setUp() {
		
		encriptador = new EncriptadorLetrasPorNumeros();
		
	}
	
	@Test
	void verificacionDeEncriptacionDeMensaje() {
		
		String mensajeAEncriptar = "hola como estas";
		String mensajeEsperado   = "8,15,12,1,0,3,15,13,15,0,5,19,20,1,19";
		
		String mensajeEncriptadoObtenido = encriptador.encriptar(mensajeAEncriptar);
		
		assertEquals(mensajeEsperado, mensajeEncriptadoObtenido);
	}
	
	@Test
	void verificacionDedesencriptacionDeMensaje() {
		
		String mensajeADesencriptar = "8,15,12,1,0,3,15,13,15,0,5,19,20,1,19";
		String mensajeEsperado      = "hola como estas";;
		
		String mensajeEncriptadoObtenido = encriptador.desencriptar(mensajeADesencriptar);
		
		assertEquals(mensajeEsperado, mensajeEncriptadoObtenido);
	}


}
