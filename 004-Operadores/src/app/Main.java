package app;
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
	public static void main(String[] args) {

		// ================================================
		// === Operadores aritméticos =====================
		// ================================================

		int x = 11;
		int y = 5;

		int suma = x + y;
		int resta = x - y;
		int multiplicacion = x * y;
		int division = x / y;
		int residuo = x % y;

		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);
		System.out.println("Multiplicacion: " + multiplicacion);
		System.out.println("Division: " + division);
		System.out.println("Residuo: " + residuo);

		// Algunos operadores unarios

		int q = +7; // Operador unario +
		int r = -5; // Operador unario -

		// El operador unario - se puede anteponer a una variable
		// para multiplicar por -1 su valor
		System.out.println(-q);
		System.out.println(-r);

		int dividendo = 9;
		int divisor = 4;

		// Ejemplo de uso del operador de residuo con la estructura condicional
		// if
		// que se verá más adelante en el curso

		if (dividendo % divisor == 0) {
			System.out.println(dividendo + " es divisible por " + divisor);
		} else {
			System.out.println(dividendo + " no es divisible por " + divisor);
		}

		// ================================================
		// === Operadores prefijos y posfijos =============
		// ================================================

		int c = 2;
		int d = c++;
		System.out.println(d);

		c = 2;
		d = ++c;
		System.out.println(d);

		c = 2;
		d = c--;
		System.out.println(d);

		c = 2;
		d = --c;
		System.out.println(d);

		// ================================================
		// === Operadores de igualdad y relacionales ======
		// ================================================

		long s = 5L;
		long t = 5L;

		System.out.println("S = " + s);
		System.out.println("T = " + t);
		System.out.println("S == T\t" + (s == t)); // Igualdad
		System.out.println("S != T\t" + (s != t)); // Desigualdad
		System.out.println("S > T\t" + (s > t)); // Mayor
		System.out.println("S >= T\t" + (s >= t)); // Mayor o igual
		System.out.println("S < T\t" + (s < t)); // Menor
		System.out.println("S <= T\t" + (s <= t)); // Menor o igual

		// ================================================
		// === Operadores condicionales ===================
		// ================================================

		int w = 5;
		int z = 10;
		System.out.println("W: " + w);
		System.out.println("Z: " + z);

		// Operador AND
		boolean b1 = w == 5 && z < 15; // álgebra booleana
		System.out.println("B1 contiene " + b1);

		// Operador OR
		boolean b2 = w == 5 || z > 15; // álgebra booleana
		System.out.println("B2 contiene " + b2);

		// Operador Negacion
		boolean b3 = !(w == z); // Investigar Ley de Morgan
		System.out.println("B3 contiene " + b3);

		// Condición más compleja
		boolean b4 = !(w == 1 || w == 1 && z == 2);
		System.out.println("B3 contiene " + b4);

	}

}
