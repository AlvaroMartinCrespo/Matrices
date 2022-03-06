package Matrices;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] num = new int[3][6];

		num[0][0] = 0;
		num[1][0] = 75;
		num[0][1] = 30;
		num[0][2] = 2;
		num[2][2] = -2;
		num[2][3] = 9;
		num[1][4] = 0;
		num[0][5] = 5;
		num[2][5] = 11;

		for (int fila = 0; fila < num.length; fila++) {
			for (int columna = 0; columna < num[fila].length; columna++) {
				System.out.printf("%5d", num[fila][columna]);
			}
			System.out.println("");

		}

	}
}
