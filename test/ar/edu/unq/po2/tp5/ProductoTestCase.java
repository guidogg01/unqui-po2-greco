package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTestCase {

	Caja caja1;
	ArrayList<Comprable> comprables;
	ArrayList<Comprable> comprables2;
	ArrayList<Comprable> comprables3;
	ArrayList<Comprable> comprables4;
	
	Producto              producto1;
	ProductoDeCooperativa producto2;
	Producto              producto3;
	ProductoDeCooperativa producto4;
	
	Servicio servicio1;
	Servicio servicio2;
	Servicio servicio3;
	Servicio servicio4;
	
	Impuesto impuesto1;
	Impuesto impuesto2;
	Impuesto impuesto3;
	Impuesto impuesto4;
	
	@BeforeEach
	void setUp() {
		
		comprables  = new ArrayList<Comprable>();
		comprables2 = new ArrayList<Comprable>();
		comprables3 = new ArrayList<Comprable>();
		comprables4 = new ArrayList<Comprable>();
		caja1       = new Caja();
		
		producto1 = new Producto("Casancrem", 950);
		producto2 = new ProductoDeCooperativa("Leche", 300); //270
		producto3 = new Producto("Pepsi", 400);
		producto4 = new ProductoDeCooperativa("Polenta", 150); //135
		
		servicio1 = new Servicio(100, 200); //20000
		servicio2 = new Servicio(150, 500); //75000
		servicio3 = new Servicio(300, 700); //210000
		servicio4 = new Servicio(470, 800); //376000 
		
		impuesto1 = new Impuesto(150);
		impuesto2 = new Impuesto(300);
		impuesto3 = new Impuesto(360);
		impuesto4 = new Impuesto(620);
		
		comprables.add(producto1);
		comprables.add(producto2);
		comprables.add(producto3);
		comprables.add(producto4);
		
		//------------------------
		
		comprables2.add(producto1);
		comprables2.add(producto2);
		comprables2.add(producto3);
		comprables2.add(producto4);
		
		comprables2.add(servicio1);
		comprables2.add(servicio2);
		comprables2.add(servicio3);
		comprables2.add(servicio4);
		
		//------------------------
		
		comprables3.add(producto1);
		comprables3.add(producto2);
		comprables3.add(producto3);
		comprables3.add(producto4);
		
		comprables3.add(impuesto1);
		comprables3.add(impuesto2);
		comprables3.add(impuesto3);
		comprables3.add(impuesto4);
		
		//------------------------
		
		comprables4.add(producto1);
		comprables4.add(producto2);
		comprables4.add(producto3);
		comprables4.add(producto4);
		
		comprables4.add(servicio1);
		comprables4.add(servicio2);
		comprables4.add(servicio3);
		comprables4.add(servicio4);
		
		comprables4.add(impuesto1);
		comprables4.add(impuesto2);
		comprables4.add(impuesto3);
		comprables4.add(impuesto4);
	}
	
	@Test
	void testPrecioTotalDeProductos(){
		
		assertEquals(1755, caja1.precioTotal(comprables));
	
	}
	
	@Test
	void testPrecioTotalDeProductosConServicios(){
		
		assertEquals(682755, caja1.precioTotal(comprables2));
	
	}
	
	@Test
	void testPrecioTotalConImpuestos(){
		
		assertEquals(3185, caja1.precioTotal(comprables3));
	
	}
	
	@Test
	void testPrecioTotal(){
		
		assertEquals(684185, caja1.precioTotal(comprables4));
	
	}
}





























