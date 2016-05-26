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

		// ====================================================
		// == CLASE SIN CONSTRUCTOR ===========================
		// ====================================================

		// Llamado al constructor por defecto
		Perro p = new Perro();

		// Se asignan valores a los atributos del perro
		p.setNombre("Max");
		p.setPeso(5);

		// Se imprimen los valores del perro
		p.imprimir();

		// ====================================================
		// == CLASE CON CONSTRUCTOR 1 =========================
		// ====================================================

		// Llamado al constructor por defecto
		Gato g1 = new Gato();
		g1.imprimir();

		// Llamado al constructor 1
		Gato g2 = new Gato("Roberto");
		g2.imprimir();

		// Llamado al constructor 2
		Gato g3 = new Gato("Roberto", 4);
		g3.imprimir();

		// Llamado al constructor 3
		Gato g4 = new Gato("Roberto", 4, 5);
		g4.imprimir();

		// ====================================================
		// == CLASE CON CONSTRUCTOR 2 =========================
		// ====================================================

		// Este ejemplo es un poco más complejo que el anterior

		Vector v = new Vector(10);
		System.out.println("Suma: " + v.suma());
		v.imprimir();
		v.ordenar();
		v.imprimir();
	}

}
