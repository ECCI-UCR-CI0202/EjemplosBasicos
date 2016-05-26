package app;

/**
 * 
 * Esta es la clase Main que contiene el punto de entrada de la aplicación
 * 
 * @author Rubén Jiménez Go�i
 */
public class Main {

	/**
	 * Punto de entrada de la aplicación
	 * 
	 * @param args
	 *            Argumentos que vienen fuera del programa
	 */
	public static void main(String[] args) {

		// Se declaran e inicializan 3 objetos distintos de tipo de dato Gato
		Gato g1 = new Gato();
		Gato g2 = new Gato();
		Gato g3 = new Gato();

		// Se le da un nombre distinto a cada gato creado
		g1.setNombre("Roberto");
		g2.setNombre("Maria");
		g3.setNombre("Carlos");

		// Se le da un peso distinto a cada gato creado
		g1.setPeso(1.0);
		g2.setPeso(2.0);
		g3.setPeso(3.0);

		// Se le da una edad distinta a cado gato creado
		g1.setEdad(1);
		g2.setEdad(2);
		g3.setEdad(3);

		// Se imprimen los valores de los atributos del gato 1
		System.out.println("Gato 1:");
		System.out.println("\tNombre: " + g1.getNombre());
		System.out.println("\tPeso: " + g1.getPeso());
		System.out.println("\tEdad: " + g1.getEdad());
		System.out.println();

		// Se imprimen los valores de los atributos del gato 2
		System.out.println("Gato 2:");
		System.out.println("\tNombre: " + g2.getNombre());
		System.out.println("\tPeso: " + g2.getPeso());
		System.out.println("\tEdad: " + g2.getEdad());
		System.out.println();

		// Se imprimen los valores de los atributos del gato 3
		System.out.println("Gato 3:");
		System.out.println("\tNombre: " + g3.getNombre());
		System.out.println("\tPeso: " + g3.getPeso());
		System.out.println("\tEdad: " + g3.getEdad());
		System.out.println();
	}
}
