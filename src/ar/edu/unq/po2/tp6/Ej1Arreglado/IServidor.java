package ar.edu.unq.po2.tp6.Ej1Arreglado;

import java.util.List;

public interface IServidor {

	public List<Correo> recibirNuevos(String user, String pass);

	public void conectar(String nombreUsuario, String passUsuario);
	
	public void enviar(Correo correo);
	
}