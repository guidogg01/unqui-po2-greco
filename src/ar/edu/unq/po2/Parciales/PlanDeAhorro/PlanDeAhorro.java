package ar.edu.unq.po2.Parciales.PlanDeAhorro;

import ar.edu.unq.po2.Parciales.PlanDeAhorro.State.EstadoPlanDeAhorro;
import ar.edu.unq.po2.Parciales.PlanDeAhorro.Strategy.RetribucionStrategy;

public class PlanDeAhorro {

	private String marca;
	private String modelo;
	private int cantCuotas;
	private int cantCuotasPagadas;
	private String CBU;
	private Cliente titular;
	private RetribucionStrategy retribucion;
	private EstadoPlanDeAhorro estadoPlanDeAhorro;
	
	PlanDeAhorro(String marca, String modelo, int cantCuotas, int cantCuotasPagadas, String CBU, Cliente titular,
			RetribucionStrategy retribucion, EstadoPlanDeAhorro estadoPlanDeAhorro) {
		super();
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setCantCuotas(cantCuotas);
		this.setCantCuotasPagadas(cantCuotasPagadas);
		this.setCBU(CBU);
		this.setTitular(titular);
		this.setRetribucionStrategy(retribucion);
		this.setEstadoPlanDeAhorro(estadoPlanDeAhorro);
	}

	public String getMarca() {
		return marca;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCantCuotas() {
		return cantCuotas;
	}

	private void setCantCuotas(int cantCuotas) {
		this.cantCuotas = cantCuotas;
	}

	public int getCantCuotasPagadas() {
		return cantCuotasPagadas;
	}

	private void setCantCuotasPagadas(int cantCuotasPagadas) {
		this.cantCuotasPagadas = cantCuotasPagadas;
	}

	public String getCBU() {
		return CBU;
	}

	private void setCBU(String CBU) {
		this.CBU = CBU;
	}

	public Cliente getTitular() {
		return titular;
	}

	private void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public RetribucionStrategy getRetribucionStrategy() {
		return retribucion;
	}

	public void setRetribucionStrategy(RetribucionStrategy retribucion) {
		this.retribucion = retribucion;
	}

	public EstadoPlanDeAhorro getEstadoPlanDeAhorro() {
		return estadoPlanDeAhorro;
	}

	public void setEstadoPlanDeAhorro(EstadoPlanDeAhorro estadoPlanDeAhorro) {
		this.estadoPlanDeAhorro = estadoPlanDeAhorro;
	}
	
	public void pagarCuota() {
		this.setCantCuotasPagadas(this.getCantCuotasPagadas() + 1);;
	}
	
	public boolean esUltimaCuota() {
		return this.getCantCuotas() == this.getCantCuotasPagadas();
	}
	
	public void ejecutarRetribucion() {
		this.getRetribucionStrategy().ejecutarRetribucion();
	}
	
	public int cantCuotasPendientes() {
		return 0; // Habría que hacer un select.
	}
	
}
