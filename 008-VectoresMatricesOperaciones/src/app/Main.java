
// Se indica el paquete donde se encuentra esta clase
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

		// Se crea un objeto de la clase Animador
		// de nuestro proyecto
		Animador anim = new Animador();

		// ========================================================
		// == Ejemplos ============================================
		// ========================================================

		/*
		 * NOTA: Comente o descomente líneas de código, según necesite
		 */

		// Se corren los ejemplos de vectores de int
		// anim.ejemploVectorInt();

		// Se corren los ejemplos de vectores de double
		// anim.ejemploVectorDouble();

		// Se corren los ejemplos de vectores de Persona
		// anim.ejemploVectorPersona();

		// Se corren los ejemplos de matrices de int
		// anim.ejemploMatrizInt();

		// Ejemplo de Recorrido en Z
		anim.ejemploRecorridoEnZ();
		
	}

}
