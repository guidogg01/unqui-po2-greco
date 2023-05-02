package ar.edu.unq.po2.tp6.Ej2;

public class SolicitudCreditoPersonal extends SolicitudDeCredito{

	SolicitudCreditoPersonal(Cliente solicitante, double montoSolicitado, int plazoEnMeses, boolean esAceptable) {
		super(solicitante, montoSolicitado, plazoEnMeses);
	}

	@Override
	public void evaluarSolicitud(){
		this.setEsAceptable (condicionMontoMensual() && super.condicionDeMontoDeCuota(0.70)); 
	}

	private boolean condicionMontoMensual() {
		return this.getSolicitante().sueldoNetoAnual() > 15000;
	}
	
}