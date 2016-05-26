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

		// ==============================================
		// == Ejemplo while 1 ===========================
		// ==============================================

		System.out.println("Ejemplo While 1");

		// Este código imprime números del 1 al 10
		int i1 = 0;
		while (i1 < 10) {
			System.out.println(i1 + 1);
			++i1;
		}

		System.out.println();

		// ==============================================
		// == Ejemplo while 2 ===========================
		// ==============================================

		System.out.println("Ejemplo While 2");

		int i2 = 0;

		// Este código imprime números del 10 al 1
		while (i2 < 10) {
			System.out.println(10 - i2);
			++i2;
		}

		System.out.println();

		// ==============================================
		// == Ejemplo do while 1 ========================
		// ==============================================

		System.out.println("Ejemplo Do While 1");

		int i3 = 0;

		// Este código imprime números del 1 al 10
		do {
			System.out.println(i3 + 1);
			++i3;
		} while (i3 < 10);
		
		System.out.println();
		
		// ==============================================
		// == Ejemplo do while 2 ========================
		// ==============================================

		System.out.println("Ejemplo Do While 2");

		int i4 = 0;

		// Este código imprime números del 10 al 1
		do {
			System.out.println(10 - i4);
			++i4;
		} while (i4 < 10);
		
		System.out.println();

		// ==============================================
		// == Ejemplo for 1 =============================
		// ==============================================

		System.out.println("Ejemplo For 1");
		
		// Este código imprime números del 1 al 10
		for(int i5 = 1; i5 <= 10; ++i5) {
			System.out.println(i5);
		}
		
		System.out.println();
		
		// ==============================================
		// == Ejemplo for 2 =============================
		// ==============================================

		System.out.println("Ejemplo For 2");
		
		// Este código imprime números del 10 al 1
		for(int i6 = 10; i6 > 0; --i6) {
			System.out.println(i6);
		}
		
		System.out.println();
		
	}
}