package Matrices;

import java.util.*;

public class Ejercicio2 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suma=0;

		int[][] num = new int[5][6];

//		INTRODUCIR NUMEROS EN LA ARRAY

		for (int fila = 0; fila < num.length - 1; fila++) {
			for (int columna = 0; columna < num[fila].length - 1; columna++) {
				System.out.println("Introduce un número");
				num[fila][columna] = entrada.nextInt();
			}

		}

//		FILAS
		
		for(int i=0; i<num.length; i++) {
			for(int j=0;j<num[i].length;j++) {
				suma+=num[i][j];
				
			}
			
			num[i][5]=suma;
			suma=0;
		}
		
		for(int i=0; i<num[i].length; i++) {
			for(int j=0;j<num.length;j++) {
				suma+=num[i][j];
				
			}
			
			num[4][i]=suma;
			suma=0;
		}
		
//		MOSTRAR LA ARRAY

		for (int fila = 0; fila < num.length; fila++) {
			for (int columna = 0; columna < num[fila].length; columna++) {
				System.out.printf("%5d", num[fila][columna]);
			}
			System.out.println("");

		}

		

	}

}
