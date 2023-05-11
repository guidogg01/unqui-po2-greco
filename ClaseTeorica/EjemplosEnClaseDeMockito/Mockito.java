package EjemplosEnClaseDeMockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class EjemplosMockito {

	// Creacion
	ClassName varName = mock(ClassName.class);
	// Modo corto de crearlo, con la annotation
	@Mock private ClassName varName;
	
	// Setear un valor
	when(methodCall).thenReturn(value)
	.thenReturn(value, value).thenThrow(throwableClasses);
	
	// Verficar
	verify(mock).methodCall
	verify(mock, VerificationMode).methodCall
	verifyNoMoreInteractions(mock)
	verifyZeroInteractions(mock);
	
	// Modos de verificacion
	atLeastOne()	atLeast(int)
	atMost(int) 	times(int)
	timeout(long)	never()
	
	// --- Ejemplo guerrero de azar, ---
	puntosDeAtaque = 200; // NO son doc, porque son del lenguaje y no son parte de nuestro proyecto.
	puntosDeVida = 100; // IDEM.
	//DOC
	unaMoneda = mock(IMoneda.class);
	otroGuerrero = mock(IGuerrero.class);
	// SUT
	guerreroAzar = new GuerreroDelAzar(100, 200, unaMoneda);
	
	@Test
	public void testUnGuerreroDeIAzarAtacaAOtroGuerreroYLaMonedaSaleCaraDescuentanPuntosDeVidaDelAdversario() {
		// Exercise
		guerreroAzar.atacar(otroGuerrero);
		
		// Verify
		verify(otroGuerrero).descontarVida(puntosDeAtaque);
		verify(unaMoneda).esCara();
	}
	
	@Test
	public void testUnGuerreroDeIAzarAtacaAOtroGuerreroYLaMonedaSaleCruzDescuentaPuntosDeVidaDeSiMismo() {
		// Exercise
		guerreroAzar.atacar(otroGuerrero)
		when(unaMoneda.esCara()).thenReturn(false);
		
		// Verify
		verify(unaMoneda).esCruz();
		verify(otroGuerrero, never()).descontarVida(puntosDeAtaque);
	}
}