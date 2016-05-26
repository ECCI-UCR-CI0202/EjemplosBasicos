package app;
// Se importa la clase Random de la librería de Java
// Para poder utilizar crear objetos de tipo Random
import java.util.Random;

/**
 * 
 * Esta es la clase Main que contiene el punto de entrada de la aplicación
 * 
 * @author Rubén Jiménez Goñi
 */
public class Main {

	/**
	 * Punto de entrada de la aplicación
	 * 
	 * @param args
	 *            Argumentos que vienen fuera del programa
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Se crea un objeto Random para pedirle números aleatorios
		// Es una forma alternativa a Math.random()
		Random r = new Random();

		// ==============================================
		// == Ejemplo if 1 ==============================
		// ==============================================

		System.out.println("Ejemplo if 1:");

		// Recordar que los if tienen 3 partes:
		// - La palabra reservada if
		// - La condición (entre paréntesis redondos) que puede
		// ser un literal de boolean, una variable boolean o
		// una operación que se resuelva como boolean
		// - El bloque del if
		// Adicionalmente los if pueden tener un bloque opcional else

		if (true) {
			System.out.println("Este mensaje se muestra");
		}

		if (false) {
			System.out.println("Este mensaje no se muestra");
		}

		System.out.println();

		// ==============================================
		// == Ejemplo if 2 ==============================
		// ==============================================

		System.out.println("Ejemplo if 2:");

		// r.nextDouble() es lo mismo que Math.random()
		// Asumiento que el objeto r fue declarado e inicializado anteriormente
		// Devuelve un número double en el rango [0.0, 1.0[
		double x = r.nextDouble();
		double y = r.nextDouble();

		System.out.println("X = " + x);
		System.out.println("Y = " + y);

		if (x < y) {
			System.out.println("X es menor que y");
		} else {
			System.out.println("X no es menor que y");
		}

		System.out.println();

		// ==============================================
		// == Ejemplo if 3 ==============================
		// ==============================================

		System.out.println("Ejemplo if 3");

		// Genero un número en el rango [0, 10[
		int a = r.nextInt(10);

		// Dibujar lo siguiente para
		// entender mejor la situación!!

		// Esto simula búsqueda binaria
		// Se realiza un máximo de 4 comparaciones
		// para encontrar el número

		// Estos if "adivinan" el valor de "a"
		if (a > 4) {
			// Valores posibles: 5 6 7 8 9
			if (a > 7) {
				// Valores posibles: 8 9
				if (a > 8) {
					// Valores posibles: 9
					System.out.println("A es 9");
				} else {
					// Valores posibles: 8
					System.out.println("A es 8");
				}
			} else {
				// Valores posibles: 5 6 7
				if (a > 6) { // 7
					// Valores posibles: 7
					System.out.println("A es 7");
				} else {
					// Valores posibles: 5 6
					if (a > 5) {
						// Valores posibles: 6
						System.out.println("A es 6");
					} else {
						// Valores posibles: 5
						System.out.println("A es 5");
					}
				}
			}
		} else {
			// Valores posibles: 0 1 2 3 4
			if (a > 2) {
				// Valores posibles: 3 4
				if (a > 3) {
					// Valores posibles: 4
					System.out.println("A es 4");
				} else {
					// Valores posibles: 3
					System.out.println("A es 3");
				}
			} else {
				// Valores posibles: 0 1 2
				if (a > 1) {
					// Valores posibles: 2
					System.out.println("A es 2");
				} else {
					// Valores posibles: 0 1
					if (a > 0) {
						// Valores posibles: 1
						System.out.println("A es 1");
					} else {
						// Valores posibles: 0
						System.out.println("A es 0");
					}
				}
			}
		}

		// Esto imprime el valor real de "a"
		System.out.println("A = " + a);

		System.out.println();

		// ==============================================
		// == Ejemplo if 4 ==============================
		// ==============================================

		// Cuando no se escribe el bloque ya sea del if
		// o del else, el compilador asume que el bloque
		// contiene una única instrucción que es la que
		// está inmediatamente después

		System.out.println("Ejemplo if 4");

		// r.nextBoolean devuelve true 50% de las veces
		// y false el otro 50%
		// r debe ser declarado e inicializado anteriormente

		if (r.nextBoolean())
			System.out.println("El boolean es true");
		else
			System.out.println("El boolean es false");
		System.out.println("Mensaje fuera del bloque del else");

		System.out.println();

		// ==============================================
		// == Ejemplo if 5 ==============================
		// ==============================================

		System.out.println("Ejemplo if 5");

		// Número dentro del rango [0,5[
		int b = r.nextInt(5);

		// Búsqueda lineal
		// Realiza hasta 4 comparaciones

		// Se "adivina" el valor de b
		if (b == 4) {
			System.out.println("B es 4");
		} else if (b == 3) {
			System.out.println("B es 3");
		} else if (b == 2) {
			System.out.println("B es 2");
		} else if (b == 1) {
			System.out.println("B es 1");
		} else {
			System.out.println("B es 0");
		}

		// La estructura anterior se conoce como else if
		// Sin embargo no es un constructo especial del lenguaje
		// es un if que tiene un else y este else contiene una única
		// instrucción que es otro if

		// Se imprime el valor de b
		System.out.println("B = " + b);

		System.out.println();

		// ==============================================
		// == Ejemplo switch 1 ==========================
		// ==============================================

		System.out.println("Ejemplo switch 1:");

		// Se genera un número en el rango [0,3[
		int c = r.nextInt(3);

		// Ejemplo de switch con una variable de tipo int

		switch (c) {
		case 0:
			System.out.println("C es 0");
			break; // Sin el break se ejecuta el código del siguiente caso
		case 1:
			System.out.println("C es 1");
			break; // Sin el break se ejecuta el código del siguiente caso
		case 2:
			System.out.println("C es 2");
			break; // Sin el break se ejecuta el código del siguiente caso
		default:
			break;
		}

		// El break es importante para que no se continúe ejecutando el código
		// del siguiente caso

		System.out.println("C = " + c);

		System.out.println();

		// ==============================================
		// == Ejemplo switch 2 ==========================
		// ==============================================

		System.out.println("Ejemplo switch 2");

		char d = (char) ('a' + r.nextInt(26));

		// Ejemplo de switch con una variable de tipo int
		// y sin breaks

		switch (d) {
		case 'a':
			System.out
					.println("D es a, pero no hay break entonces se sigue ejecutando el codigo");
		case 'b':
			System.out
					.println("D es b, pero no hay break entonces se sigue ejecutando el codigo");
		case 'c':
			System.out.println("D es 'a' o 'b' o 'c'");
			break;
		default:
			System.out.println("D no es ni 'a' ni 'b' ni 'c'");
			break;
		}

		// Sin breaks, el código de los siguientes casos se sigue ejecutando
		// hasta encontrar un break o el final del switch.
		// En ocasiones esto es deseable.

		System.out.println("D = " + d);

		System.out.println();

		// ==============================================
		// == Ejemplo switch 3 ==========================
		// ==============================================

		System.out.println("Ejemplo switch 3");

		// Genero un String aleatorio
		String s = "a";
		while (r.nextDouble() < 0.8) {
		
			// En cada iteración del while, hay un 80%
			// de probabilidad de seguir concatenando el valor de a
		
			s += 'a';
			
			// y un 20% de probabilidad de que el while termine
		}

		System.out.println("El String generado es " + s);

		// Ejemplo de switch con una variable de tipo int

		switch (s) {
		case "a":
			System.out.println("Hay 1 a");
			break;
		case "aa":
			System.out.println("Hay 2 a's");
			break;
		case "aaa":
			System.out.println("Hay 3 a's");
			break;
		default:
			System.out.println("Hay 3 o mas a's");
			break;
		}

		System.out.println();

	}

}
