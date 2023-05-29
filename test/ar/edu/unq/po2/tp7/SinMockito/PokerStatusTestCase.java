package ar.edu.unq.po2.tp7.SinMockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.SinMockito.Carta;
import ar.edu.unq.po2.tp7.SinMockito.Palo;
import ar.edu.unq.po2.tp7.SinMockito.PokerStatus;
import ar.edu.unq.po2.tp7.SinMockito.Valor;

class PokerStatusTestCase {

	PokerStatus pokerStatus;
	
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	private Carta carta6;
	private Carta carta7;
	private Carta carta8;
	private Carta carta9;
	private Carta carta10;
	
	//Setup
	
	@BeforeEach
	void setUp(){
	
		pokerStatus = new PokerStatus();
		
		//Cartas con poker
		
		carta1 = new Carta(Valor.DOS, Palo.DIAMANTE);
		carta2 = new Carta(Valor.DOS, Palo.PICAS);
		carta3 = new Carta(Valor.DOS, Palo.CORAZONES);
		carta4 = new Carta(Valor.DOS, Palo.TREBOL);;
		carta5 = new Carta(Valor.CUATRO, Palo.TREBOL);
		
		//Cartas con color
		
		carta6  = new Carta(Valor.SEIS, Palo.DIAMANTE);
		carta7  = new Carta(Valor.OCHO, Palo.DIAMANTE);
		carta8  = new Carta(Valor.J, Palo.DIAMANTE);;
		carta9  = new Carta(Valor.CINCO, Palo.DIAMANTE);
		carta10 = new Carta(Valor.A, Palo.DIAMANTE);
				
	}
	
	
	@Test
	void testCuandoHayPoker(){
		
		String stringEsperado = "Poker";
		
		assertEquals(stringEsperado, pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5)); //excercise
	}
	
	@Test
	void testCuandoHayColor(){
		String stringEsperado = "Color";
		
		assertEquals(stringEsperado, pokerStatus.verificar(carta6, carta7, carta8, carta9, carta10));
	}

	@Test
	void testCuandoHayTrio(){
		String stringEsperado = "Trio";
		
		assertEquals(stringEsperado, pokerStatus.verificar(carta8, carta2, carta9, carta3, carta1));
		// Probar cuando el trio empieza en el medio.
	}	
	
	@Test
	void testCuandoNoHayNada(){
		String stringEsperado = "Nada";
		
		assertEquals(stringEsperado, pokerStatus.verificar(carta1, carta2, carta5, carta6, carta7));
	}
	
}