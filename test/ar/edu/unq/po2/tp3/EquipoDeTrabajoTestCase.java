package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {

	EquipoDeTrabajo equipoDeTrabajo1;
	Trabajador trabajador1;
	Trabajador trabajador2;
	Trabajador trabajador3;
	Trabajador trabajador4;
	Trabajador trabajador5;
	
	@BeforeEach
	void setUp() {
		
		equipoDeTrabajo1 = new EquipoDeTrabajo("Los picapiedra");
		trabajador1 = new Trabajador("Guido"    , "Greco"  , 21);
		trabajador2 = new Trabajador("Juan Cruz", "Perez"  , 29);
		trabajador3 = new Trabajador("Macarena" , "Perez"  , 32);
		trabajador4 = new Trabajador("Cristian" , "Sotilde", 31);
		trabajador5 = new Trabajador("Alejandro", "Castro" , 38);
		
		equipoDeTrabajo1.agregarTrabajador(trabajador1);
		equipoDeTrabajo1.agregarTrabajador(trabajador2);
		equipoDeTrabajo1.agregarTrabajador(trabajador3);
		equipoDeTrabajo1.agregarTrabajador(trabajador4);
		equipoDeTrabajo1.agregarTrabajador(trabajador5);
	}
	
	@Test
	void testPromedioEdad() {
		
		assertEquals(30.2, equipoDeTrabajo1.promedioEdad());
		
	}

}
