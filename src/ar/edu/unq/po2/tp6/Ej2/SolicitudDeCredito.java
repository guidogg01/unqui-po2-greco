package ar.edu.unq.po2.tp6.Ej2;

public abstract class SolicitudDeCredito {

	private Cliente solicitante;
	private double  montoSolicitado;
	private int     plazoEnMeses;
	private boolean esAceptable;
	
	SolicitudDeCredito(Cliente solicitante, double montoSolicitado, int plazoEnMeses) {
		super();
		this.solicitante     = solicitante;
		this.montoSolicitado = montoSolicitado;
		this.plazoEnMeses    = plazoEnMeses;
	}
	
	public Cliente getSolicitante() {
		return solicitante;
	}
	
	public void setSolicitante(Cliente solicitante) {
		this.solicitante = solicitante;
	}
	
	public double getMontoSolicitado() {
		return montoSolicitado;
	}
	
	public void setMontoSolicitado(double montoSolicitado) {
		this.montoSolicitado = montoSolicitado;
	}
	
	public int getPlazoEnMeses() {
		return plazoEnMeses;
	}
	
	public void setPlazoEnMeses(int plazoEnMeses) {
		this.plazoEnMeses = plazoEnMeses;
	}
	
	public boolean isEsAceptable() {
		return esAceptable;
	}

	public void setEsAceptable(boolean esAceptable) {
		this.esAceptable = esAceptable;
	}
	
	public abstract void evaluarSolicitud();
	
	public boolean condicionDeMontoDeCuota(double porcentajeRequerido) {
		return this.montoDeLaCuotaPorMes() <  this.porcentajeRequeridoMensual(porcentajeRequerido);
	}
	
	public double montoDeLaCuotaPorMes() {
		return this.getMontoSolicitado() / this.getPlazoEnMeses();
	}

	public double porcentajeRequeridoMensual(double porcentajeRequerido) {
		return porcentajeRequerido * this.getSolicitante().getSueldoNetoMensual();
	}
	
}
