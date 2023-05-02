package ar.edu.unq.po2.tp5;

public class Impuesto implements Comprable{

	private double tasaDeServicio;

	Impuesto(double tasaDeServicio) {
		super();
		this.tasaDeServicio = tasaDeServicio;
	}

	public double getTasaDeServicio() {
		return tasaDeServicio;
	}

	public void setTasaDeServicio(double tasaDeServicio) {
		this.tasaDeServicio = tasaDeServicio;
	}
	
	@Override
	public double registrarse() {
		return this.getTasaDeServicio();
	}
}