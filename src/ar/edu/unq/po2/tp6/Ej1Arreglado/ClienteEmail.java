package ar.edu.unq.po2.tp6.Ej1Arreglado;

import java.util.ArrayList;

public class ClienteEmail {

	private String  nombreUsuario;
	private String  passusuario;
	private GestorDeMail      servidor;
	private ArrayList<Correo> borrados;
	private ArrayList<Correo> inbox;
	
	ClienteEmail(String nombreusuario, String passusuario, ArrayList<Correo> borrados, ArrayList<Correo> inbox) {
		super();
		this.nombreUsuario = nombreusuario;
		this.passusuario = passusuario;
		this.borrados = borrados;
		this.inbox = inbox;
	}

	public String getNombreusuario() {
		return nombreUsuario;
	}

	public void setNombreusuario(String nombreusuario) {
		this.nombreUsuario = nombreusuario;
	}

	public String getPassusuario() {
		return passusuario;
	}

	public void setPassusuario(String passusuario) {
		this.passusuario = passusuario;
	}

	public ArrayList<Correo> getBorrados() {
		return borrados;
	}

	public void setBorrados(ArrayList<Correo> borrados) {
		this.borrados = borrados;
	}

	public ArrayList<Correo> getInbox() {
		return inbox;
	}

	public void setInbox(ArrayList<Correo> inbox) {
		this.inbox = inbox;
	}
	
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.remove(correo);
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}
	
	public void recibirNuevos(){
		servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		servidor.enviar(correo);
	}
	
}