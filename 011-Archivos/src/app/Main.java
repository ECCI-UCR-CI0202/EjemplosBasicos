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

		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// =-= ARCHIVO EN MODO DE ESCRITURA =-=-=-=-=-=-=-=-=-=-
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

		// Se crea un archivo denominado "t.txt" en modo de escritura.
		// "t.txt" es un path relativo. En el caso de Eclipse, esto quiere
		// decir que el archivo se creará en la carpeta raíz del proyecto
		Archivo escritura = new Archivo("t.txt", false);

		// Se escriben 3 líneas en el archivo
		escritura.escribirLinea("Hola " + Math.random());
		escritura.escribirLinea("Mundo " + Math.random());
		escritura.escribirLinea("! " + Math.random());

		// Se cierra el archivo
		// ES MUY IMPORTANTE CERRARLO SIEMPRE!
		escritura.cerrar();

		// Luego de ejecutar el programa, asegúrese de dar click derecho
		// en el nombre del proyecto y luego en "Refresh" esto actualizará la
		// estructura del proyecto de Eclipse y podrá observar el archivo que
		// el programa acaba de crear

		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// =-= ARCHIVO EN MODO DE LECTURA =-=-=-=-=-=-=-=-=-=-=-
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

		// Se abre un archivo denominado "t.txt".
		// Como se abre el archivo en modo de lectura, este
		// archivo tiene que existir previamente
		Archivo lectura = new Archivo("t.txt", true);

		// Se lee la primera línea del archivo con el método leer
		String linea = lectura.leer();

		// Se introduce un while mientras que la línea sea diferente de null
		// Es decir, mientras el archivo tenga líneas...
		while (linea != null) {

			//... se imprime la línea actual
			System.out.println(linea);

			// y se lee la siguiente línea del archivo
			linea = lectura.leer();

			// Recuerde que el método leer siempre devuelve la
			// siguiente línea del archivo

			// Cuando el archivo no contiene más líneas,
			// el método leer devolverá null
		}

		// Se cierra el archivo que fue abierto en modo de lectura
		lectura.cerrar();

	}

}
