package EjemplosEnClaseDeMockito;
import java.beans.BeanProperty;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import java.util.stream.Collectors;



public class TestStream2 {



	public static void main(String[] args) {

	

			// TODO Auto-generated method stub

			List<String> arrayListDeStrings = Arrays.asList("Luciafno", "Florencia", "Federico");

			

			List<String> arrayNuevo = arrayListDeStrings.stream().filter(s -> s.startsWith("F")).toList();
			

			System.out.println(arrayNuevo);

			

			ArrayList<Producto> lista = new ArrayList<Producto>();

			

			lista.add(new Producto("Milanesa", 80));

			lista.add(new Producto("Puré", 50));

			lista.add(new Producto("Agua", 70));

			lista.add(new Producto("Fideo", 95));

			

			double precioTotal = lista.stream().filter(producto -> producto.precioFinal() > 100d)

				                               .mapToDouble(Producto::precioFinal)

				                               .sum();

			

			

			System.out.println("El precio total es igual a = " + precioTotal + " que es igual a 114.95");

			

		}

}

