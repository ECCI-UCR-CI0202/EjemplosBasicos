package app;

/**
 * Esta clase se utiliza para implementar algunos métodos estáticos que sirvan
 * como prueba de concepto de lo que un método estático puede hacer
 * 
 * @author Rubén Jiménez Goñi
 */
public class Matematico {

	/**
	 * Constante que guarda el valor de PI de la clase Math
	 * 
	 * Esto es usualmente innecesario, pues podría utilizarse Math.PI directamente en el
	 * código, pero es solo un ejemplo de una constante
	 */
	public static final double PI = Math.PI;

	/**
	 * Método estático que calcula el área de un círculo
	 * 
	 * @param radio Radio del círculo
	 * @return Área del círculo
	 */
	public static double areaCirculo(double radio) {
		return Math.pow(radio, 2) * PI;
	}

	/**
	 * Método estático que calcula el perímetro de un círculo
	 * 
	 * @param radio Radio del círculo
	 * @return Perímetro del círculo
	 */
	public static double perimetroCirculo(double radio) {
		return 2.0 * PI * radio;
	}
}
