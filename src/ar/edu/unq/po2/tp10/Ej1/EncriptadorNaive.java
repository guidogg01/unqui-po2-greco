package ar.edu.unq.po2.tp10.Ej1;

public class EncriptadorNaive {
	
	private IEncriptador strategy;

	public IEncriptador getStrategy() {
		return strategy;
	}

	public void setStrategy(IEncriptador strategy) {
		this.strategy = strategy;
	}

	public String encriptarMensaje(String mensajeAEncriptar) {
		return this.getStrategy().encriptar(mensajeAEncriptar);
	}
	
	public String desencriptarMensaje(String mensajeAEncriptar) {
		return this.getStrategy().desencriptar(mensajeAEncriptar);
	}
	
}
