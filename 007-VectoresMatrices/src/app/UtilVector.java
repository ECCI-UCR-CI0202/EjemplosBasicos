package app;
// Import para utilizar objetos de tipo Random
import java.util.Random;
// Import para leer datos de la consola
import java.util.Scanner;

/**
 * Esta clase demuestra el uso de métodos estáticos y constantes estáticas.
 * 
 * Además contiene métodos que realizan funciones útiles con vectores.
 * 
 * @author Rubén Jiménez Goñi
 */
public class UtilVector {

	/**
	 * Objeto estático de tipo Random que se puede utilizar en cualquier parte
	 * del programa
	 */
	public static final Random RAND = new Random(); // Objeto constante
	private static Scanner s = new Scanner(System.in);

	/**
	 * Método que recibe un vector de números enteros y aleatoriza cada posición
	 * del vector
	 * 
	 * @param v
	 *            Vector que se desea aleatorizar
	 */
	public static void aleatorizar(int v[]) {
		// Este for recorre todo el vector y...
		for (int i = 0; i < v.length; i++) {
			// ... coloca en cada posición i un número aleatorio
			// en el rango [0, 100[
			v[i] = RAND.nextInt(100);
		}
	}

	/**
	 * Método que recibe un vector de números enteros y le solicita al usuario
	 * que digite un valor para cada posición
	 * 
	 * @param v
	 *            Vector que se desea que el usuario llene
	 */
	public static void pedirDatosUsuario(int v[]) {

		System.out.println("Ingrese " + v.length
				+ " valores y digite Enter luego de cada valor");

		// Este for recorre todo el vector y...
		for (int i = 0; i < v.length; i++) {

			System.out.print("Valor para posicion " + i + ": ");

			// ... solicita al usuario un valor al usuario con s.nextLine()
			v[i] = Integer.parseInt(s.nextLine());

			// Integer.parseInt(...) convierte de String a int
		}

	}

	/**
	 * Este método se encarga de cerrar el Scanner.
	 * 
	 * Debe ser llamado si alguien llama al método pedirDatosUsuario
	 * 
	 * Una vez llamado este método en el programa, ya no se puede volver a
	 * llamar al método pedirDatosUsuario
	 */
	public static void cerrarScanner() {
		// Se cierra el Scanner
		s.close();

		// y de paso también se cierra la entrada de consola
		// System.in
	}

	/**
	 * Método que recibe un vector de números enteros e imprime su contenido en
	 * la consola
	 * 
	 * @param v
	 *            Vector que se quiere imprimir en la consola
	 */
	public static void imprimir(int v[]) {

		// NOTA!
		// Se utiliza print y no println para imprimir todo el vector
		// en la misma línea

		// Se imprime un paréntesis cuadrado inicial
		System.out.print("[");

		// Este for recorre el vector e ...
		for (int i = 0; i < v.length; i++) {

			// ... e imprime cada valor
			System.out.print(v[i]); // <-- print

			// Si no estoy en la última posicion del vector ...
			if (i != v.length - 1) {

				// ... imprimo una coma
				System.out.print(", "); // <-- print
			}
		}

		// Se imprime el paréntesis cuadrado inicial con un println
		System.out.println("]"); // <-- println!
	}

	/**
	 * Método que recibe 2 vectores de int y devuelve un vector con la suma v1 +
	 * v2
	 * 
	 * @param v1
	 *            Primer Vector
	 * @param v2
	 *            Segundo Vector
	 * @return Si ambos vectores son del mismo tamaño, devuelve un vector que
	 *         contiene la suma. Si son de diferentes tamaños, devuelve null.
	 */
	public static int[] sumar(int v1[], int v2[]) {

		// Se crea el vector para devolver el resultado de la suma
		int resultado[] = null;

		// Si v1 y v2 tienen el mismo tamaño ...
		if (v1.length == v2.length) {
		
		}

			// ... se re-inicializa el vector de resultado
			// con un vector del tamaño adecuado
			resultado = new int[v1.length];

			// Este for recorre el vector de resultado y ...
			for (int i = 0; i < resultado.length; i++) {

				// ... en cada posición coloca la suma correspondiente
				resultado[i] = v1[i] + v2[i];
			}

		return resultado;
	}

	/**
	 * Método que recibe 2 vectores de int y devuelve un vector con la resta v1
	 * - v2
	 * 
	 * @param v1
	 *            Primer Vector
	 * @param v2
	 *            Segundo Vector
	 * @return Si ambos vectores son del mismo tamaño, devuelve un vector que
	 *         contiene la resta. Si son de diferentes tamaños, devuelve null.
	 */
	public static int[] restar(int v1[], int v2[]) {

		// Se crea el vector para devolver el resultado de la resta
		int resultado[] = null;

		// Si v1 y v2 tienen el mismo tamaño ...
		if (v1.length == v2.length) {

			// ... se re-inicializa el vector de resultado
			// con un vector del tamaño adecuado
			resultado = new int[v1.length];

			// Este for recorre el vector de resultado y ...
			for (int i = 0; i < resultado.length; i++) {

				// ... en cada posición coloca la resta correspondiente
				resultado[i] = v1[i] - v2[i];
			}
		} else {

			// si v1 y v2 tienen tamaños distintos
			// el método imprime un error y devuelve null
			// en vez de un vector
			System.err
					.println("Util.restar: Los vectores tienen tamaño diferente");
		}

		return resultado;
	}

	/**
	 * Método que recibe 2 vectores de int y devuelve el producto punto.
	 * 
	 * Si los vectores son de diferente tamaño, se asume que el vector de menor
	 * tamaño tiene ceros hasta igualar el tamaño del otro vector.
	 * 
	 * @param v1
	 *            Primer Vector
	 * @param v2
	 *            Segunto Vector
	 * @return Producto punto de los vectores.
	 */
	public static int productoPunto(int v1[], int v2[]) {

		// Variable auxiliar para guardar el producto punto
		int resultado = 0;

		// For que recorre el vector de menor tamaño,
		// gracias a la condición escrita
		for (int i = 0; i < v1.length && i < v2.length; i++) {

			// Se multiplican las posiciones actuales de los dos vectores
			// y el resultado se acumula en la variable resultado
			resultado += v1[i] * v2[i];
		}

		// Solo se recorre hasta el vector de menor tamaño.
		// Esto produce el mismo resultado que si se hubiera continuado
		// recorriendo el vector de mayor tamaño y se multiplicara cada
		// valor por 0.

		return resultado;
	}

}
