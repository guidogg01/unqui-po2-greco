package ar.edu.unq.po2.tps;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrabajadorTest2 {

	private Ingreso ingresoFamiliar;
	private Ingreso ingresoEscolar;
	private Ingreso ingresoLaboral;
	private IngresoPorHorasExtra ingresoExtra;
	private Trabajador trabj;
	
	@BeforeEach
	public void setUp() {
		ingresoFamiliar = new Ingreso("Febrero", "Ingreso familiar", 200d);
		ingresoEscolar  = new Ingreso("Abril", "Ingreso escolar", 450d);
		ingresoLaboral  = new Ingreso("Octubre", "Ingreso laboral", 700d);
		ingresoExtra    = new IngresoPorHorasExtra("Junio", "Ingreso laboral", 300d, 4);
		trabj           = new Trabajador();
	}
	
	@Test
	public void ingresosTotalesPercibidos(){
		this.trabj.agregarIngreso(ingresoFamiliar);
		this.trabj.agregarIngreso(ingresoEscolar);
		this.trabj.agregarIngreso(ingresoLaboral);
		this.trabj.agregarIngreso(ingresoExtra);
		assertEquals(1650d, this.trabj.getTotalPercibido());
	}
	
	@Test
	public void montoImponibleTotal(){
		this.trabj.agregarIngreso(ingresoFamiliar);
		this.trabj.agregarIngreso(ingresoEscolar);
		this.trabj.agregarIngreso(ingresoLaboral);
		this.trabj.agregarIngreso(ingresoExtra);
		assertEquals(1350d, this.trabj.getMontoImponible());
	}
	
	@Test
	public void totalDeImpuestosAPagar(){
		this.trabj.agregarIngreso(ingresoFamiliar);
		this.trabj.agregarIngreso(ingresoEscolar);
		this.trabj.agregarIngreso(ingresoLaboral);
		this.trabj.agregarIngreso(ingresoExtra);
		assertEquals(27d, this.trabj.getImpuestoAPagar());
	}
}
