package ar.edu.unq.po2.tp10.Ej1;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EncriptadorNaiveTestCase {

	private EncriptadorNaive encriptadorNaive;
	
	private EncriptadorPalabrasAleatorias encriptadorPalabrasAleatorias;
	private EncriptadorLetrasPorNumeros   encriptadorLetrasPorNumeros;
	private EncriptadorVocalesYConconantesCambiantes encriptadorVocalesYConconantesCambiantes;
	
	@BeforeEach
	void setUp() {
		
		encriptadorNaive = new EncriptadorNaive();
		
		encriptadorPalabrasAleatorias = mock(EncriptadorPalabrasAleatorias.class);
		encriptadorLetrasPorNumeros   = mock(EncriptadorLetrasPorNumeros.class);
		encriptadorVocalesYConconantesCambiantes = mock(EncriptadorVocalesYConconantesCambiantes.class);
		
		
	}
	
	@Test
	void verificacionDeEncriptadorDePalabrasAleatorias() {
		
		this.encriptadorNaive.setStrategy(encriptadorPalabrasAleatorias); //Seteo que strategia quiero usar.
		
		String mensajeAEncriptar = "¿Hola, como estás?";
		String mensajeEsperado   = "?sátse omoc ,aloH¿";
		
		when(encriptadorPalabrasAleatorias.encriptar(mensajeAEncriptar)).thenReturn(mensajeEsperado);
		
		String mensajeEncriptadoObtenido = encriptadorNaive.encriptarMensaje(mensajeAEncriptar);
		
		assertEquals(mensajeEsperado, mensajeEncriptadoObtenido);
		
	}
	
	@Test
	void verificacionDeDesencriptadorDePalabrasAleatorias() {
		
		this.encriptadorNaive.setStrategy(encriptadorPalabrasAleatorias); //Seteo que strategia quiero usar.
		
		String mensajeADesencriptar = "?sátse omoc ,aloH¿";
		String mensajeEsperado   = "¿Hola, como estás?";
		
		when(encriptadorPalabrasAleatorias.desencriptar(mensajeADesencriptar)).thenReturn(mensajeEsperado);
		
		String mensajeDesencriptadoObtenido = encriptadorNaive.desencriptarMensaje(mensajeADesencriptar);
		
		assertEquals(mensajeEsperado, mensajeDesencriptadoObtenido);
		
	}
	
	@Test
	void verificacionDeEncriptadorDeLetrasPorNumeros() {
		
		this.encriptadorNaive.setStrategy(encriptadorLetrasPorNumeros);
		
		String mensajeAEncriptar = "Hola, como estas";
		String mensajeEsperado   = "8,15,12,1,0,3,15,13,15,0,5,19,20,1,19";
		
		when(encriptadorLetrasPorNumeros.encriptar(mensajeAEncriptar)).thenReturn(mensajeEsperado);
		
		String mensajeEncriptadoObtenido = encriptadorNaive.encriptarMensaje(mensajeAEncriptar);
		
		assertEquals(mensajeEsperado, mensajeEncriptadoObtenido);
		
	}
	
	@Test
	void verificacionDeDesencriptadorDeLetrasPorNumeros() {
		
		this.encriptadorNaive.setStrategy(encriptadorLetrasPorNumeros);
		
		String mensajeADesencriptar = "Hola, como estas";
		String mensajeEsperado   = "8,15,12,1,0,3,15,13,15,0,5,19,20,1,19";
		
		when(encriptadorLetrasPorNumeros.desencriptar(mensajeADesencriptar)).thenReturn(mensajeEsperado);
		
		String mensajeEncriptadoObtenido = encriptadorNaive.desencriptarMensaje(mensajeADesencriptar);
		
		assertEquals(mensajeEsperado, mensajeEncriptadoObtenido);
		
	}
	
	@Test
	void verificacionDeEncriptadorDeVocalesYConsonantesCambiantes() {
		
		this.encriptadorNaive.setStrategy(encriptadorVocalesYConconantesCambiantes); //Seteo que strategia quiero usar.
		
		String mensajeAEncriptar = "¿Hola, como estas?";
		String mensajeEsperado   = "¿hule, cumu istes?";
		
		when(encriptadorVocalesYConconantesCambiantes.encriptar(mensajeAEncriptar)).thenReturn(mensajeEsperado);
		
		String mensajeEncriptadoObtenido = encriptadorNaive.encriptarMensaje(mensajeAEncriptar);
		
		assertEquals(mensajeEsperado, mensajeEncriptadoObtenido);
		
	}
	
	@Test
	void verificacionDeDesencriptadorDeVocalesYConsonantesCambiantes() {
		
		this.encriptadorNaive.setStrategy(encriptadorVocalesYConconantesCambiantes); //Seteo que strategia quiero usar.
		
		String mensajeADesencriptar = "¿Hule, cumu istes?";
		String mensajeEsperado      = "¿hola, como estas?";
		
		when(encriptadorVocalesYConconantesCambiantes.desencriptar(mensajeADesencriptar)).thenReturn(mensajeEsperado);
		
		String mensajeEncriptadoObtenido = encriptadorNaive.desencriptarMensaje(mensajeADesencriptar);
		
		assertEquals(mensajeEsperado, mensajeEncriptadoObtenido);
		
	}

}