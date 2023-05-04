package ar.edu.unq.po2.tp7.MockitoConJugadas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class PokerStatusTestCase {

	PokerStatus pokerStatus;
	
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	
	//Setup
	
	@BeforeEach
	void setUp(){
	
		//Sut
		
		pokerStatus = new PokerStatus();		
		
		//Doc
		
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);		
				
	}
	
	
	@Test
	void testCuandoHayPoker(){
		
		//SetUp/Mockeando
		
		when(carta1.getValor()).thenReturn(Valor.DOS);    //Dummy
		when(carta1.getPalo()).thenReturn(Palo.DIAMANTE); //Dummy

		when(carta2.getValor()).thenReturn(Valor.DOS); //Dummy
		when(carta2.getPalo()).thenReturn(Palo.PICAS); //Dummy
		
		when(carta3.getValor()).thenReturn(Valor.DOS);     //Dummy
		when(carta3.getPalo()).thenReturn(Palo.CORAZONES); //Dummy
		
		when(carta4.getValor()).thenReturn(Valor.DOS);  //Dummy
		when(carta4.getPalo()).thenReturn(Palo.TREBOL); //Dummy
		
		when(carta5.getValor()).thenReturn(Valor.CUATRO); //Dummy
		when(carta5.getPalo()).thenReturn(Palo.TREBOL);   //Dummy
		
		String stringEsperado = "Poker";
		
		//Excersice
		
		String stringObtenido = pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);
		
		//Verify
		
		assertEquals(stringEsperado, stringObtenido);
		
	}
	
	@Test
	void testCuandoHayColor(){
		//SetUp/Mockeando
		
		when(carta1.getValor()).thenReturn(Valor.SEIS); //Dummy
		when(carta1.getPalo()).thenReturn(Palo.DIAMANTE); //Dummy

		when(carta2.getValor()).thenReturn(Valor.OCHO); //Dummy
		when(carta2.getPalo()).thenReturn(Palo.DIAMANTE); //Dummy
				
		when(carta3.getValor()).thenReturn(Valor.J); //Dummy
		when(carta3.getPalo()).thenReturn(Palo.DIAMANTE); //Dummy
				
		when(carta4.getValor()).thenReturn(Valor.CINCO); //Dummy
		when(carta4.getPalo()).thenReturn(Palo.DIAMANTE); //Dummy
				
		when(carta5.getValor()).thenReturn(Valor.A); //Dummy
		when(carta5.getPalo()).thenReturn(Palo.DIAMANTE); //Dummy
		
		String stringEsperado = "Color";
				
		//Excersice
		
		String stringObtenido = pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);
		
		//Verify
		
		assertEquals(stringEsperado, stringObtenido);
	}

	@Test
	void testCuandoHayTrio(){
		
		when(carta1.getValor()).thenReturn(Valor.SEIS);   //Dummy
		when(carta1.getPalo()).thenReturn(Palo.DIAMANTE); //Dummy

		when(carta2.getValor()).thenReturn(Valor.J);   //Dummy
		when(carta2.getPalo()).thenReturn(Palo.PICAS); //Dummy
				
		when(carta3.getValor()).thenReturn(Valor.J);    //Dummy
		when(carta3.getPalo()).thenReturn(Palo.TREBOL); //Dummy
				
		when(carta4.getValor()).thenReturn(Valor.J);       //Dummy
		when(carta4.getPalo()).thenReturn(Palo.CORAZONES); //Dummy
				
		when(carta5.getValor()).thenReturn(Valor.A);       //Dummy
		when(carta5.getPalo()).thenReturn(Palo.CORAZONES); //Dummy
		
		String stringEsperado = "Trio";
		
		//Excersice
		
		String stringObtenido = pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);
		
		//Verify
		
		assertEquals(stringEsperado, stringObtenido);
	}	
	
	@Test
	void testCuandoNoHayNada(){
		
		when(carta1.getValor()).thenReturn(Valor.SEIS);   //Dummy
		when(carta1.getPalo()).thenReturn(Palo.DIAMANTE); //Dummy

		when(carta2.getValor()).thenReturn(Valor.OCHO); //Dummy
		when(carta2.getPalo()).thenReturn(Palo.PICAS);  //Dummy
				
		when(carta3.getValor()).thenReturn(Valor.CUATRO); //Dummy
		when(carta3.getPalo()).thenReturn(Palo.TREBOL);   //Dummy
				
		when(carta4.getValor()).thenReturn(Valor.J);       //Dummy
		when(carta4.getPalo()).thenReturn(Palo.CORAZONES); //Dummy
				
		when(carta5.getValor()).thenReturn(Valor.A);       //Dummy
		when(carta5.getPalo()).thenReturn(Palo.CORAZONES); //Dummy
		
		//Excersice
		
		String stringObtenido = pokerStatus.verificar(carta1, carta2, carta3, carta4, carta5);
		
		//Verify
		
		assertEquals("Nada", stringObtenido);
	}
	
}