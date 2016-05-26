package app;

public class Gato {

	private String nombre;
	private int peso;
	private int edad;

	// Constructor por defecto
	public Gato() {
		System.out.println("Llamado al constructor por defecto del Gato");
		this.nombre = "Max";
		this.peso = 3;
		this.edad = 1;
	}

	// Constructor 1
	public Gato(String nombre) {
		this.nombre = nombre;
		this.peso = 3;
		this.edad = 1;
	}
	
	// Constructor 2
	public Gato(String nombre, int peso) {
		this.nombre = nombre;
		this.peso = peso;
		this.edad = 1;
	}
	
	// Constructor 3
	public Gato(String nombre, int peso, int edad) {
		this.nombre = nombre;
		this.peso = peso;
		this.edad = edad;
	}

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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void imprimir() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Peso: " + peso);
		System.out.println("Edad: " + edad);
	}

}
