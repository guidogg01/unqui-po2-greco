package ar.edu.unq.po2.tp10.Ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaquinaDeVideoJuegosTestCase {

	private MaquinaDeVideoJuegos maquina;
	
	@BeforeEach
	void setUp() {
		
		maquina = new MaquinaDeVideoJuegos();
		
	}
	
	@Test
	void verificacionDeInicializacionDeUnaMaquinaDeVideoJuegos() {
		//SetUp
		int cantDeFichasEsperada = 0;
		String estadoEsperado    = "Ingresar fichas"; //Cuando una maquina recien se crea espera las fichas a ingresar.
		
		assertEquals(cantDeFichasEsperada, this.maquina.getCantFichasIngresadas());
		assertEquals(estadoEsperado,       this.maquina.presionarBotonDeInicio());
		
	}

	@Test
	void verificacionDeEstadoDeUnaMaquinaCuandoSeIngresaUnaFicha() {
		//SetUp
		
		int cantDeFichasEsperada = 1;
		String estadoEsperado    = "Se está iniciando el modo single player";
		
		//Exercise
		
		this.maquina.ingresarFicha();
		
		assertEquals(cantDeFichasEsperada, this.maquina.getCantFichasIngresadas());
		assertEquals(estadoEsperado,       this.maquina.presionarBotonDeInicio());
		
	}
	
	@Test
	void verificacionDeEstadoDeUnaMaquinaCuandoSeIngresanDosFicha() {
		//SetUp
		
		int cantDeFichasEsperada = 2;
		String estadoEsperado    = "Se está iniciando el modo multiPlayer";
		
		//Exercise
		
		this.maquina.ingresarFicha();
		this.maquina.ingresarFicha();
		
		assertEquals(cantDeFichasEsperada, this.maquina.getCantFichasIngresadas());
		assertEquals(estadoEsperado,       this.maquina.presionarBotonDeInicio());
		
	}
	
}