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

		// Este ejemplo demuestra el uso de métodos estáticos
		// para crear métodos con funcionalidades específicas
		// que posiblemente no deberían pertenecer a objetos cualquiera

		// ==========================================================
		// === VECTORES =============================================
		// ==========================================================

		// Se imprime un número aleatorio utilizando el objeto rand
		// que se encuentra en la clase Util
		System.out.println("Aleatorio: " + UtilVector.RAND.nextDouble());

		// Se genera un tamaño aleatorio n
		int n = UtilVector.RAND.nextInt(5) + 5;
		
		// Se crea un vector de tamaño n
		int a[] = new int[n];

		// Se aleatoriza el contenido del vector a
		UtilVector.aleatorizar(a);

		// Se imprime el contenido del vector a
		System.out.print("A = ");
		UtilVector.imprimir(a);

		// Se declara e inicializa un vector de 5 int
		int b[] = new int[n];

		// Se aleatoriza el contenido del vector b
		UtilVector.aleatorizar(b);

		// Se imprime el contenido del vector b
		System.out.print("B = ");
		UtilVector.imprimir(b);

		// Se obtiene el resultado de sumar a + b
		// y el resultado que es un vector, se utiliza para inicializar
		// el vector suma
		int suma[] = UtilVector.sumar(a, b);

		// Se imprime la suma de los vectores
		System.out.print("Suma = ");
		UtilVector.imprimir(suma);

		// Se obtiene el resultado de restar a - b
		// y el resultado que es un vector, se utiliza para inicializar
		// el vector resta
		int resta[] = UtilVector.restar(a, b);

		// Se imprime la resta de los vectores
		System.out.print("Resta = ");
		UtilVector.imprimir(resta);

		// Se imprime el resultado del producto punto entre los vectores a y b
		System.out.println("Producto Punto = " + UtilVector.productoPunto(a, b));

		// Se declara e inicializa un vector de 5 int
		int d[] = new int[n];

		// Se le solicita al usuario que llene el vector d
		// UtilVector.pedirDatosUsuario(d);

		// Se imprimen los datos que el usuario ingresó
		System.out.print("D = ");
		UtilVector.imprimir(d);


		// ==========================================================
		// === MATRICES =============================================
		// ==========================================================
	
		int repeticiones = UtilVector.RAND.nextInt(5) + 5;
		System.out.println("Se van a realizar " + repeticiones + " pruebas del código");
		
		for (int i = 0; i < repeticiones; ++i) {
		
			int m[][] = new int[5][5];
			
			System.out.println("La matriz m es: ");
			UtilMatriz.aleatorizar(m);
			UtilMatriz.imprimir(m);
			System.out.println("La suma de los elementos es: " + UtilMatriz.sumar(m));
			
			System.out.println();
		}
		
		
		int tabla[][] = UtilMatriz.tablaMultiplicar(100, 10);
		UtilMatriz.imprimir(tabla);
		
		// Se cierra el Scanner
		UtilVector.cerrarScanner();

	}

}
