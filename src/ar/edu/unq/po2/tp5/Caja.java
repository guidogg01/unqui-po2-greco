package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class Caja {
	
	private Agencia agenciaRecaduadora;
	
	double precioTotal(ArrayList<Comprable> cobrables){
		
		return cobrables.stream().mapToDouble(cobrable -> cobrable.registrarse()).sum();
		
	}
	
	void notificarPago(double monto, String concepto) {
		
		Factura factura = new Factura(monto, concepto);
		this.agenciaRecaduadora.registrarPago(factura);
		
	}
	
}