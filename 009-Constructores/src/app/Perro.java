package app;
/**
 * 
 * @author Rubén Jiménez Goñi
 */
public class Perro {

	private String nombre;
	private int peso;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void imprimir() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Peso: " + peso);
	}
}
