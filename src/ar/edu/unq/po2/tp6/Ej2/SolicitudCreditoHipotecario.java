package ar.edu.unq.po2.tp6.Ej2;

public class SolicitudCreditoHipotecario extends SolicitudDeCredito{

	private Propiedad propiedad;

	SolicitudCreditoHipotecario(Cliente solicitante, double montoSolicitado, int plazoEnMeses, boolean esAceptable, Propiedad propiedad) {
		super(solicitante, montoSolicitado, plazoEnMeses);
		this.setPropiedad(propiedad);
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}

	@Override
	public void evaluarSolicitud() {
		
		this.setEsAceptable(super.condicionDeMontoDeCuota(0.50) && condicionValorFiscal() && condicionEdad());
		
	}

	private boolean condicionEdad() {
		return edadSolicitante() + edadCuandoTerminaElCredito() < 65;
	}

	private int edadSolicitante() {
		return this.getSolicitante().getEdad();
	}

	private int edadCuandoTerminaElCredito() {
		return this.getPlazoEnMeses() / 12;
	}

	private boolean condicionValorFiscal() {
		return this.getMontoSolicitado() < 0.70 * propiedad.getValorFiscal();
	}		
	
}