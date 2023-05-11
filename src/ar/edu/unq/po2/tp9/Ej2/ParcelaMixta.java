package ar.edu.unq.po2.tp9.Ej2;

import java.util.ArrayList;

public class ParcelaMixta implements Parcela{

	private ArrayList<Parcela> parcelas;
	
	public ParcelaMixta() {
		this.setParcelas(new ArrayList<Parcela>(4));
	}

	public ArrayList<Parcela> getParcelas() {
		return parcelas;
	}

	public void setParcelas(ArrayList<Parcela> parcelas) {
		this.parcelas = parcelas;
	}

	@Override
	public double gananciasAnuales() {
		return this.getParcelas().stream().mapToDouble(p -> p.gananciasAnuales()).sum();
	}
	
	public void agregarParcela(Parcela parcela){
		this.getParcelas().add(parcela);
	}

}