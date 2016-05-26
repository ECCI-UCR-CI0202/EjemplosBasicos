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

		// Se imprime el valor de la constante PI de la clase Matemático
		System.out.println("Valor de la constante PI de la clase Matemático: " + Matematico.PI);

		// Se realizan pruebas con un círculo de radio 5
		double radioCirculo1 = 5.0;
		double areaCirculo1 = Matematico.areaCirculo(radioCirculo1);
		double perimetroCirculo1 = Matematico.perimetroCirculo(radioCirculo1);
		System.out.println("Circulo 1:");
		System.out.println("\tRadio: " + radioCirculo1);
		System.out.println("\tArea: " + areaCirculo1);
		System.out.println("\tPerimetro: " + perimetroCirculo1);
		System.out.println();

		// Se realizan pruebas con un círculo de radio 10
		double radioCirculo2 = 10.0;
		double areaCirculo2 = Matematico.areaCirculo(radioCirculo2);
		double perimetroCirculo2 = Matematico.perimetroCirculo(radioCirculo2);
		System.out.println("Circulo 1:");
		System.out.println("\tRadio: " + radioCirculo2);
		System.out.println("\tArea: " + areaCirculo2);
		System.out.println("\tPerimetro: " + perimetroCirculo2);
		System.out.println();
	}
}
