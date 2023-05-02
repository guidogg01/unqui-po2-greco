package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Counter {

	private ArrayList<Integer> numeros;

	Counter() {
		this.numeros = new ArrayList<Integer>();
	}
	
	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}
	
	public void addNumber(Integer numero){
		this.numeros.add(numero);
	}

	public int cantDeNumerosPares() {
		
		return numeros.stream().filter(numero -> numero%2 == 0).collect(Collectors.toList()).size();
		
		/*
		 * Otra manera de hacerlo con una subtarea que indica si el número es par:
		 * 
		 * return numeros.stream().filter(numero -> this.esPar(numero)).collect(Collectors.toList()).size();
		 * */
		
	}
	
	//1.
	
	public int cantDeNumerosInpares() {
		return numeros.stream().filter(numero -> this.esImpar(numero)).collect(Collectors.toList()).size();
	}
	
	private boolean esImpar(Integer numero) {
		return numero%2 == 1;
	}

	public int cantDeNumerosMultiplosDe(int numeroMultiplo) {
		
		return numeros.stream().filter(numero -> this.esMultiplo(numero, numeroMultiplo)).collect(Collectors.toList()).size();
	}
	
	private boolean esMultiplo(Integer numero,Integer numeroMultiplo) {
		return numero % numeroMultiplo == 0;
	}
	
	//2.

	public int mayorDeParesDeLaLista() {
		return numeros.stream().max((Integer n1, Integer n2) -> this.cantDigitosPares(n1) - (this.cantDigitosPares(n2))).get();
	}
	
	private int cantDigitosPares(int numero) {
		
		int numeroCambiante = numero;
		int resultado       = 0;
		
		while (numeroCambiante > 0) {
			if (numeroCambiante % 2 == 0){
				resultado ++;
			}
		numeroCambiante = numeroCambiante/10;
			
		}
		return resultado;
	}
	
	//3.

	public int multiploMasGrande(Integer multiplo1, Integer multiplo2){
		
		int resultado = -1;
		
		for (int i=0; i <= 1000; i++) {
			if (esMultiplo(i, multiplo1) && esMultiplo(i, multiplo2)) {
				resultado = i;
			}
		}
		return resultado;
	}

	
	//4.
	
	/*
	String a = "abc";
	String s = a;
	String t;
	
	s.length();                       -> esto devuelve 3.
	t.length();                       -> esto da error ya que t es null.
	1 + a =                           -> esto devuelve "1abc"
	a.toUpperCase()                   -> esto devuelve "ABC"
	"Libertad".indexOf("r");          -> esto devuelve 4 ya que 4 es donde está posicionada la letra "r".
	"Universidad".lastIndexOf('i');   -> esto devuelve 7 ya que 7 es la ultima vez que aparece la letra "i".
	"Quilmes".substring(2,4);         -> esto devuelve las letras que están ubicadas en la posición que se pasa por parámetro.
	(a.length() + a).startsWith("a"); -> esto devuelve false ya que se fija si empieza con la letra "a" y es false porque no pregunta 
	                                      si "abc" empieza con la letra "a" sino que pregunta por "3a".
	s == a;                           -> esto devuelve true.
	a.substring(1,3).equals("bc")     -> esto devuelve true ya que indica si entre las posiciones 1 y 3 se encuentra la cadane de texto
	                                      "bc" (cosa que es correcta).
	 */
	
}























