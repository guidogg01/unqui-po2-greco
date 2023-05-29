package ar.edu.unq.po2.tp10.Ej1;

public class EncriptadorPalabrasAleatorias implements IEncriptador{

	//Aclaración:
	//Este encriptador va a dar vuelta el texto que se le pase.
	
	@Override
	public String encriptar(String mensajeAEncriptar) {
		return new StringBuilder(mensajeAEncriptar).reverse().toString();
	}

	@Override
	public String desencriptar(String mensajeAEncriptar) {
		return this.encriptar(mensajeAEncriptar);
	}
}
