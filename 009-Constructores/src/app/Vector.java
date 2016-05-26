package app;
import java.util.Arrays;

public class Vector {

	public double v[];

	public Vector(int n) {
		v = new double[n];
		for (int i = 0; i < v.length; i++) {
			v[i] = Math.random() * 100.0;
		}
	}
	
	public void ordenar() {
		Arrays.sort(v);
	}

	public double suma() {
		double c = 0;
		for (int i = 0; i < v.length; i++) {
			c += v[i];
		}
		return c;
	}

	public void imprimir() {
		System.out.println(Arrays.toString(v));
		// for (int i = 0; i < v.length; i++) {
		// System.out.println(v[i]);
		// }
	}

}
