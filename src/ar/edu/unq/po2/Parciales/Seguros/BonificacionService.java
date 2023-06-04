package ar.edu.unq.po2.Parciales.Seguros;

public interface BonificacionService {

	public boolean codigoAprobado(int codigo);
	
	public void anularCodigo(int codigo);
	
	public void notificarTitular(String mail, int codigo);
	
}
