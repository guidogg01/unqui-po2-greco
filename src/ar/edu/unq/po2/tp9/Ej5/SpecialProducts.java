package ar.edu.unq.po2.tp9.Ej5;

public class SpecialProducts extends Product{

	public float getPirce() {
		return super.getPrice() * 2f; //Esto es porque debería hacer algo diferente pero no aclara en el enunciado.
	}
	
}
