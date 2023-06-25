package ar.edu.unq.po2.tp11.ej5;

public class CuentaCorriente extends CuentaBancaria {

	 private int descubierto;
	 
	 public CuentaCorriente(String titular, int descubierto){
		 super(titular);
		 this.descubierto=descubierto;
	 }
	 
	 public int getDescubierto(){
		 return this.descubierto;
	 }

	@Override
	public int valorSolicitadoParaExtraccion() {
		return this.getDescubierto();
	}
	
}
