package ar.edu.unq.po2.tp7.MockitoConJugadas;

public class Carta {

	private Valor valor;
	private Palo  palo;
	
	Carta(Valor valor, Palo palo) {
		super();
		this.valor = valor;
		this.palo = palo;
	}

	public Valor getValor() {
		return valor;
	}

	public void setValor(Valor valor) {
		this.valor = valor;
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}
	
	
}