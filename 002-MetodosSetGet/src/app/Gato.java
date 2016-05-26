package app;

/**
 * 
 * Ejemplo de clase Gato con 2 atributos y métodos set y get para cada atributo
 * 
 * @author Rubén Jiménez Goñi
 */
public class Gato {

	/**
	 * Atributo para guardar el nombre de los gatos que se pueden crear a partir
	 * de esta clase
	 */
	private String nombre;

	/**
	 * Atributo para guardar el peso de los gatos que se pueden crear a partir
	 * de esta clase
	 */
	private double peso;

	/**
	 * Atributo para guardar la edad de los gatos que pueden crear a partir de
	 * esta clase
	 */
	private int edad;

	/**
	 * Método que permite obtener el nombre de un gato
	 * 
	 * @return Nombre del gato
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método para asignar un nombre cualquiera a un gato
	 * 
	 * @param nombre
	 *            Nombre nuevo para el gato
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método para obtener el peso de un gato
	 * 
	 * @return Peso del gato
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Método para asignar un peso cualquiera a un gato
	 * 
	 * @param peso
	 *            Peso nuevo para el gato
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * Método para obtener la edad de un gato
	 * 
	 * @return Edad del gato
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Método para asignar una edad cualquiera a un gato
	 * 
	 * @param edad
	 *            Edad nuevo para el gato
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
