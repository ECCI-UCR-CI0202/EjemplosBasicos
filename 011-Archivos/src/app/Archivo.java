package app;
// Clases de la librería de Java a partir de las cuales
// se crea objetos para interactuar con archivos del 
// sistema operativo subyaciente.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase Archivo que funciona como un intermediario entre la librería de Java y
 * los estudiantes, para que puedan manipular archivos de texto de una forma
 * mucho más sencilla, sin tener que conocer todas las clases de Java.
 * 
 * @author Rubén Jiménez Goñi
 */
public class Archivo {

	// Si el archivo es abierto en modo de lectura,
	// se utiliza este atributo
	private BufferedReader br;

	// Si el archivo es abierto en modo de escritura,
	// se utiliza este atributo
	private BufferedWriter bw;

	/**
	 * Constructor de la clase Archivo. Sirve para crear objetos Archivo que
	 * permiten leer y escribir de archivos reales del sistema operativo
	 * 
	 * @param nombre
	 *            Nombre del archivo a leer o escribir
	 * @param lectura
	 *            True - Indica que el archivo se abre en modo de lectura, False
	 *            - Indica que el archivo se abre en modo de escritura
	 */
	public Archivo(String nombre, boolean lectura) {
		// Se utiliza un try catch por si ocurre un error al crear los
		// objetos de la librería de Java
		try {
			// Se crean los objetos de la librería de Java,
			// dependiendo de si el archivo se abre en modo de lectura
			// o en modo de escritura
			if (lectura) {
				br = new BufferedReader(new FileReader(nombre));
			} else {
				bw = new BufferedWriter(new FileWriter(nombre));
			}
		} catch (IOException e) {
			// Si no se puede abrir el archivo, por ejemplo si:
			// - El archivo no existe
			// - El programa no cuenta con permisos para acceder al archivo
			// Entonces se imprime un error en la pantalla
			System.err.println("Hubo un error abriendo el archivo");
			e.printStackTrace(System.err);
		}
	}

	/**
	 * Método que lee la siguiente línea del archivo.
	 * 
	 * Cada llamado a este método devuelve la siguiente línea del archivo, hasta
	 * que el archivo no contiene más líneas, en cuyo caso devuelve null
	 * 
	 * @return La siguiente línea del archivo o null, si no hay más líneas
	 */
	public String leer() {

		// Se crea una variable auxiliar inicializada con null
		String hilera = null;

		// Si el archivo es abierto en modo de lectura
		if (br != null) {
			try {
				// Se intenta leer una línea
				hilera = br.readLine();
			} catch (Exception e) {
				// El método readLine puede tirar errores, por ejemplo si:
				// - El archivo es borrado
				// - El medio donde se encuentra el archivo es extraído
				// Si eso sucede, el programa imprime un error
				System.err.println("Hubo un error leyendo la linea");
				e.printStackTrace(System.err);
			}
		} else {
			// Si el archivo fue abierto en modo de escritura y no de lectura,
			// se indica así al usuario
			System.err.println("El archivo fue abierto en modo de escritura.");
		}
		return hilera;
	}

	/**
	 * Método que imprime un String en el archivo. Los caracteres se imprimen
	 * "de derecha a izquierda y de arriba a abajo"
	 * 
	 * @param hilera
	 *            String a escribir en el archivo
	 */
	public void escribir(String hilera) {

		// Si el archivo fue abierto en modo de escritura
		if (bw != null) {
			try {
				// Se intenta escribir la línea
				bw.write(hilera);
			} catch (Exception e) {
				// El método write puede tirar errores, por ejemplo si:
				// - El archivo es borrado
				// - El medio donde se encuentra el archivo es extraído
				// Si eso sucede, el programa imprime un error
				System.err.println("Hubo un error escribiendo la linea");
				e.printStackTrace(System.err);
			}
		} else {
			// Si el archivo fue abierto en modo de lectura y no de escritura,
			// se indica así al usuario
			System.err.println("El archivo fue abierto en modo de lectura.");
		}
	}

	/**
	 * Método que imprime un String en el archivo. Los caracteres se imprimen
	 * "de derecha a izquierda y de arriba a abajo".
	 * 
	 * A diferencia del método escribir, este concatena un \n al String para
	 * imprimir un enter en el archivo
	 * 
	 * @param hilera
	 *            String a escribir en el archivo
	 */
	public void escribirLinea(String hilera) {
		// Si alguien llama a este método, 
		// este método llama al método escribir concatenando un \n
		escribir(hilera + "\n");
	}

	/**
	 * Este método cierra el archivo independientemente de si fue abierto
	 * en modo de lectura o de escritura
	 */
	public void cerrar() {
		try {
			// Se intenta cerrar el archivo
			if (bw != null) {
				bw.close();
			} else {
				br.close();
			}
		} catch (Exception e) {
			// Si ocurre algún error al cerrar el archivo, 
			// entonces se imprime
			System.err.println("Hubo un error cerrando el archivo.");
			e.printStackTrace(System.err);
		}

	}

}
