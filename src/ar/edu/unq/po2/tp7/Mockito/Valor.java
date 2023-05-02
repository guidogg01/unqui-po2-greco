package ar.edu.unq.po2.tp7.Mockito;

public enum Valor {

	A(14), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), OCHO(8), NUEVE(9), DIEZ(10), J(), Q(), K();
	
	int valorEnNumero;
	
	private Valor(){
	}


	private Valor(int valorEnNumero) {
		this.valorEnNumero = valorEnNumero;
	}
	
}