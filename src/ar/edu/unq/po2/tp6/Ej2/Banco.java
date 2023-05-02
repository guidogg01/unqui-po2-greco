package ar.edu.unq.po2.tp6.Ej2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Banco {

	private ArrayList<Cliente> clientes;
	private ArrayList<SolicitudDeCredito> solicitudes;
	
	Banco() {
		this.clientes    = new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<SolicitudDeCredito>();
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<SolicitudDeCredito> getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(ArrayList<SolicitudDeCredito> solicitudes) {
		this.solicitudes = solicitudes;
	}

	public void verificarSolicitudes() {
		this.getSolicitudes().stream().forEach(s -> s.evaluarSolicitud());
	}
	
	public void agregarCliente(Cliente cliente){
		
		this.getClientes().add(cliente);
		
	}
	
	public void agregarSolicitud(SolicitudDeCredito solicitud){
		
		this.getSolicitudes().add(solicitud);
		
	}
		
	public double montoTotalDeLasSolicitudes() {
		
		return this.solicitudesAprobadas().stream().mapToDouble(s -> s.getMontoSolicitado()).sum();
		
	}
	
	public ArrayList<SolicitudDeCredito> solicitudesAprobadas(){
		
		return this.getSolicitudes().stream()
				   .filter(s -> s.isEsAceptable())
				   .collect(Collectors.toCollection(ArrayList::new));
		
	}
		
}