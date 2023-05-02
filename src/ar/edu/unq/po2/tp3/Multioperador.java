package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
	private ArrayList<Integer> numeros;
	
	Multioperador() {
		this.numeros = new ArrayList<Integer>();
	}
	
	public void agregarNumeros(Integer numero) {
		this.numeros.add(numero);
	}
	
	public int sumaTotal() {
		
		return numeros.stream().mapToInt(Integer::intValue).sum();
	
	}
	
	public int restaTotal() {
		
		return numeros.stream().reduce((n1,n2) -> n1 - n2).orElse(0); //El orElse sirve para cuando una lista está vacía devolver 0.
	
	}
	
	public int multiplicacionTotal(){
		
		return numeros.stream().reduce((n1,n2) -> n1 * n2).orElse(1);
		
	}
	
}
