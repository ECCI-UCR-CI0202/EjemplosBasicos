package app;

public class UtilMatriz {

	public static void aleatorizar(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m[i][j] = UtilVector.RAND.nextInt(100);
			}
		}
	}

	public static int sumar(int m[][]) {
		int suma = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				suma += m[i][j];
			}
		}
		return suma;
	}
	
	public static int[][] tablaMultiplicar(int n, int m) {
		int matriz [][] = new int[n][m];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = i * j;
			}
		}
		return matriz;
	}

	public static void imprimir(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			UtilVector.imprimir(m[i]);
		}
	}

}
