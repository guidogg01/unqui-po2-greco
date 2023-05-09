package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeportesDelMunicipioTestCase {

	private DeportesDelMunicipio deportesMunicipio;
	
	private ActividadSemanal actividad1;
	private ActividadSemanal actividad2;
	private ActividadSemanal actividad3;
	private ActividadSemanal actividad4;
	private ActividadSemanal actividad5;
	private ActividadSemanal actividad6;
	private ActividadSemanal actividad7;
	private ActividadSemanal actividad8;
	private ActividadSemanal actividad9;
	private ActividadSemanal actividad10;
	
	@BeforeEach
	void setUp() {
		
		//Sut
		
		deportesMunicipio = new DeportesDelMunicipio();
		
		//Doc
		
		actividad1  = mock(ActividadSemanal.class);
		actividad2  = mock(ActividadSemanal.class);
		actividad3  = mock(ActividadSemanal.class);
		actividad4  = mock(ActividadSemanal.class);
		actividad5  = mock(ActividadSemanal.class);
		actividad6  = mock(ActividadSemanal.class);
		actividad7  = mock(ActividadSemanal.class);
		actividad8  = mock(ActividadSemanal.class);
		actividad9  = mock(ActividadSemanal.class);
		actividad10 = mock(ActividadSemanal.class);
		
		deportesMunicipio.agregarActividad(actividad1);
		deportesMunicipio.agregarActividad(actividad2);
		deportesMunicipio.agregarActividad(actividad3);
		deportesMunicipio.agregarActividad(actividad4);
		deportesMunicipio.agregarActividad(actividad5);
		
	}
	
	@Test
	void testFiltrandoPorDeportes() {
		
		when(actividad1.getDeporte()).thenReturn(Deporte.FUTBOL);   //Stub
		when(actividad2.getDeporte()).thenReturn(Deporte.BASKET);   //Stub
		when(actividad3.getDeporte()).thenReturn(Deporte.JABALINA); //Stub
		when(actividad4.getDeporte()).thenReturn(Deporte.TENNIS);   //Stub
		when(actividad5.getDeporte()).thenReturn(Deporte.FUTBOL);   //Stub
		
		List<ActividadSemanal> actividadesEsperadas = new ArrayList<ActividadSemanal>();
		
		actividadesEsperadas.add(actividad1);
		actividadesEsperadas.add(actividad2);
		
		assertEquals(actividadesEsperadas.size(), deportesMunicipio.actividadesDe(Deporte.FUTBOL).size());
		
	}
	
	@Test
	void testFiltrandoPorNivelDeComplejidad() {

		/* Esto no es necesario ya que cuando lo mockeo (como está abajo) ya le puedo pedir la compejidad a cada deporte.
		when(actividad1.getDeporte().getComplejidad()).thenReturn(2); //Stub
		when(actividad2.getDeporte().getComplejidad()).thenReturn(2); //Stub
		when(actividad3.getDeporte().getComplejidad()).thenReturn(1); //Stub
		when(actividad4.getDeporte().getComplejidad()).thenReturn(3); //Stub
		when(actividad5.getDeporte().getComplejidad()).thenReturn(4); //Stub
		*/
		
		when(actividad1.getDeporte()).thenReturn(Deporte.FUTBOL);   //Stub
		when(actividad2.getDeporte()).thenReturn(Deporte.BASKET);   //Stub
		when(actividad3.getDeporte()).thenReturn(Deporte.JABALINA); //Stub
		when(actividad4.getDeporte()).thenReturn(Deporte.TENNIS);   //Stub
		when(actividad5.getDeporte()).thenReturn(Deporte.FUTBOL);   //Stub
		
		List<ActividadSemanal> actividadesEsperadas = new ArrayList<ActividadSemanal>();
		
		actividadesEsperadas.add(actividad1);
		actividadesEsperadas.add(actividad2);
		actividadesEsperadas.add(actividad5);
		
		assertEquals(actividadesEsperadas.size(), deportesMunicipio.actividadesDeComplejidad(2).size());
		
	}
	
	@Test
	void testTotalDeCantidadDeHoras() {
		
		when(actividad1.getDuracion()).thenReturn(2); //Stub
		when(actividad2.getDuracion()).thenReturn(3); //Stub
		when(actividad3.getDuracion()).thenReturn(1); //Stub
		when(actividad4.getDuracion()).thenReturn(2); //Stub
		when(actividad5.getDuracion()).thenReturn(4); //Stub
		
		assertEquals(12, deportesMunicipio.totalDeCantHorasSemanales());
		
	}

	@Test
	void testActividadDeInteresMasBarata() {
		
		when(actividad1.getDeporte()).thenReturn(Deporte.FUTBOL);          //Stub
		when(actividad1.getDiaDeSemana()).thenReturn(DiaDeSemana.MARTES);  //Stub
		
		when(actividad2.getDeporte()).thenReturn(Deporte.BASKET);          //Stub
		when(actividad2.getDiaDeSemana()).thenReturn(DiaDeSemana.MARTES);  //Stub
		
		when(actividad3.getDeporte()).thenReturn(Deporte.JABALINA);        //Stub
		when(actividad3.getDiaDeSemana()).thenReturn(DiaDeSemana.JUEVES);  //Stub
		
		when(actividad4.getDeporte()).thenReturn(Deporte.TENNIS);          //Stub
		when(actividad4.getDiaDeSemana()).thenReturn(DiaDeSemana.SABADO);  //Stub
		
		when(actividad5.getDeporte()).thenReturn(Deporte.FUTBOL);          //Stub
		when(actividad5.getDiaDeSemana()).thenReturn(DiaDeSemana.VIERNES); //Stub
		
		assertEquals(actividad1, deportesMunicipio.actividadSemanalDeMenorCosto(Deporte.FUTBOL));
		
	}
	
	@Test
	void testActividadesEnMapMasBaratas() {
		
		when(actividad1.getDeporte()).thenReturn(Deporte.FUTBOL);             //Stub
		when(actividad1.getDiaDeSemana()).thenReturn(DiaDeSemana.MARTES);     //Stub
		
		when(actividad2.getDeporte()).thenReturn(Deporte.BASKET);             //Stub
		when(actividad2.getDiaDeSemana()).thenReturn(DiaDeSemana.MARTES);     //Stub
		
		when(actividad3.getDeporte()).thenReturn(Deporte.JABALINA);           //Stub
		when(actividad3.getDiaDeSemana()).thenReturn(DiaDeSemana.JUEVES);     //Stub
		
		when(actividad4.getDeporte()).thenReturn(Deporte.TENNIS);             //Stub
		when(actividad4.getDiaDeSemana()).thenReturn(DiaDeSemana.SABADO);     //Stub
		
		when(actividad5.getDeporte()).thenReturn(Deporte.FUTBOL);             //Stub
		when(actividad5.getDiaDeSemana()).thenReturn(DiaDeSemana.VIERNES);    //Stub
		
		when(actividad6.getDeporte()).thenReturn(Deporte.JABALINA);           //Stub
		when(actividad6.getDiaDeSemana()).thenReturn(DiaDeSemana.JUEVES);     //Stub
		
		when(actividad7.getDeporte()).thenReturn(Deporte.FUTBOL);             //Stub
		when(actividad7.getDiaDeSemana()).thenReturn(DiaDeSemana.DOMINGO);    //Stub
		
		when(actividad8.getDeporte()).thenReturn(Deporte.BASKET);             //Stub
		when(actividad8.getDiaDeSemana()).thenReturn(DiaDeSemana.JUEVES);     //Stub
		
		when(actividad9.getDeporte()).thenReturn(Deporte.BASKET);             //Stub
		when(actividad9.getDiaDeSemana()).thenReturn(DiaDeSemana.SABADO);     //Stub
		
		when(actividad10.getDeporte()).thenReturn(Deporte.TENNIS);            //Stub
		when(actividad10.getDiaDeSemana()).thenReturn(DiaDeSemana.VIERNES);   //Stub
		
		deportesMunicipio.agregarActividad(actividad6);
		deportesMunicipio.agregarActividad(actividad7);
		deportesMunicipio.agregarActividad(actividad8);
		deportesMunicipio.agregarActividad(actividad9);
		deportesMunicipio.agregarActividad(actividad10);

		Map<Deporte, Optional<ActividadSemanal>> mapObtenido = deportesMunicipio.actividadesMasEconomicas();
		
		assertEquals(mapObtenido.get(Deporte.BASKET).hashCode(), actividad2.hashCode());
		
	}
	
}