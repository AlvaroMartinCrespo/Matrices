package Matrices;

import java.util.*;

public class Ejercicio2Corregido {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[4][5];

		int sumaFila, sumaColumna;

//		ENTRADA DE NUMEROS A LA ARRAY

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Matriz [" + i + "]" + j + "]: ");
				matriz[i][j] = entrada.nextInt();
			}
		}
		
//		SUMA FILA

		for (int i = 0; i < 4; i++) {
			sumaFila=0;
			for(int j=0;j<5;j++) {
				System.out.printf("%7d", matriz[i][j]);
				sumaFila+=matriz[i][j];
			}
			System.out.printf("|%7d", sumaFila);
			System.out.println();
		}
		System.out.println("-------------------------------------------");
		
		int sumaTotal=0;
		
		for(int j=0;j<5;j++) {
			sumaColumna=0;
			for(int i=0;i<4;i++) {
				sumaColumna+=matriz[i][j];
			}
			sumaTotal+=sumaColumna;
			System.out.printf("%7d", sumaColumna);
		}
		System.out.printf("|%7d", sumaTotal);

	}

}
