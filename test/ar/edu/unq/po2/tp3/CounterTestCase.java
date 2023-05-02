package ar.edu.unq.po2.tp3;


import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CounterTestCase {
	private Counter counter;
	private Counter otherCounter;
	
	/**
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*/
	
	@BeforeEach
		public void setUp() throws Exception {
			//Se crea el contador
			counter = new Counter();
			otherCounter = new Counter();
			//Se agregan los numeros. Un solo par y nueve impares
			counter.addNumber(1);
			counter.addNumber(3);
			counter.addNumber(5);
			counter.addNumber(7);
			counter.addNumber(9);
			counter.addNumber(1);
			counter.addNumber(1);
			counter.addNumber(1);
			counter.addNumber(1);
			counter.addNumber(4);
			
			otherCounter.addNumber(31221221);
			otherCounter.addNumber(51212121);
			otherCounter.addNumber(71222122);
			otherCounter.addNumber(91111211);
		}
	/**
	* Verifica la cantidad de pares
	*/
	
	//1.
	
	@Test
	public void testEvenNumbers() {
			
		// Getting the even occurrences
		int amount = counter.cantDeNumerosPares();
		// I check the amount is the expected one
		assertEquals(1, amount);
		
	}
	
	@Test
	public void testOddNumbers() {
			
		// Getting the even occurrences
		int amount = counter.cantDeNumerosInpares();
		// I check the amount is the expected one
		assertEquals(9, amount);
			
	}
	
	@Test
	public void testMultiplosDelMultiplo() {
			
		// Getting the even occurrences
		int amount = counter.cantDeNumerosMultiplosDe(3);
		// I check the amount is the expected one
		assertEquals(2, amount);
			
	}
	
	//2.
	
	@Test
	public void testMayorCantidadDePares() {
			
		// Getting the even occurrences
		int mayorDePares = otherCounter.mayorDeParesDeLaLista();
		// I check the amount is the expected one
		assertEquals(71222122, mayorDePares);
			
	}

	//3.
	
	@Test
	public void testMultiplos() {
			
		// Getting the even occurrences
		int multiplosDe = counter.multiploMasGrande(3,9);
		// I check the amount is the expected one
		assertEquals(999, multiplosDe);
			
	}

}



















