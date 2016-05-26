package app;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Perro p = new Perro("Max", 5);
		System.out.println(p);
		System.out.println(p.toString());

		Gato g = new Gato("Gatimo", 7);
		System.out.println(g);
		System.out.println(g.toString());

		int v[] = { 1, 2, 3, 4, 5 };
		String s = Arrays.toString(v);
		System.out.println(s);

	}
}
