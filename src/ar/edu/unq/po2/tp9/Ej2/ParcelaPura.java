package ar.edu.unq.po2.tp9.Ej2;

public class ParcelaPura implements Parcela{

	private Cultivo cultivo;
	
	public ParcelaPura(Cultivo cultivo) {
		super();
		this.setCultivo(cultivo);
	}

	public Cultivo getCultivo() {
		return cultivo;
	}
	
	public void setCultivo(Cultivo cultivo) {
		this.cultivo = cultivo;
	}

	@Override
	public double gananciasAnuales() {
		return this.getCultivo().getPrecio();
	}
	
}