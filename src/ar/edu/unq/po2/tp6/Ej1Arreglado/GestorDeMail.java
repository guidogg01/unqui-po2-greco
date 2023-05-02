package ar.edu.unq.po2.tp6.Ej1Arreglado;

public class GestorDeMail {

	private IServidor servidor;
	
	public void conectar(String nombreUsuario, String passusuario){
		servidor.conectar(nombreUsuario,passusuario);
	}
	
	public void recibirNuevos(String nombreUsuario, String passusuario){
		this.servidor.recibirNuevos(nombreUsuario, passusuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		servidor.enviar(correo);
	}
	
	public void enviar(Correo correo) {
		this.servidor.enviar(correo);
	}
	
}