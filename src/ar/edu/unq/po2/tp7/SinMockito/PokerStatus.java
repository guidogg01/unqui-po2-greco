package ar.edu.unq.po2.tp7.SinMockito;

import java.util.ArrayList;

public class PokerStatus {
	
	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5){
		
		String resultado;
		
		ArrayList<Carta> manoDePoker = new ArrayList<Carta>(5);
		
		manoDePoker.add(carta1);
		manoDePoker.add(carta2);
		manoDePoker.add(carta3);
		manoDePoker.add(carta4);
		manoDePoker.add(carta5);
				
		//Poker
		int cantCartasDelMismoNumero  = manoDePoker.stream().filter(c -> carta1.getValor().equals(c.getValor())).toList().size();
		//Estos se agregan para contemplar los casos de trio.
		int cantCartasDelMismoNumero2 = manoDePoker.stream().filter(c -> carta2.getValor().equals(c.getValor())).toList().size();
		int cantCartasDelMismoNumero3 = manoDePoker.stream().filter(c -> carta3.getValor().equals(c.getValor())).toList().size();
		// En el filter se pone "s" porque son un string pero podría ser carta.
		//Color
		int cantCartasDelMismoPalo  = manoDePoker.stream().filter(c -> carta1.getPalo().equals(c.getPalo())).toList().size();
		
		if (cantCartasDelMismoNumero == 4){
			resultado = "Poker";
		}else if (cantCartasDelMismoPalo == 5) {
			resultado = "Color";
		}else if (cantCartasDelMismoNumero == 3 || cantCartasDelMismoNumero2 == 3 || cantCartasDelMismoNumero3 == 3) {
			resultado = "Trio";
		}else {
			resultado = "Nada";
		}
		
		return resultado;
		
	}
	
}
