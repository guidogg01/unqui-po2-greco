package ar.edu.unq.po2.tp11.ej5;

public class CajaDeAhorro extends CuentaBancaria {

	private int limite;
	
	public CajaDeAhorro(String titular, int limite){
		super(titular);
		this.limite=limite;
	}
	
	public int getLimite(){
		return this.limite;
	}

	@Override
	public int valorSolicitadoParaExtraccion() {
		return this.getLimite();
	}
	
}
