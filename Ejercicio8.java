package Matrices;

import java.util.*;

public class Ejercicio8 {

	static Scanner entrada = new Scanner(System.in);
	final static int NUMEROSTOTALMATRIZ=16; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		VARIABLES
		int accion;

//		RELLENAMOS LA ARRAY
		int[][] todoTerreno = new int[4][4];

		for (int i = 0; i < todoTerreno.length; i++) {
			for (int j = 0; j < todoTerreno[i].length; j++) {
				todoTerreno[i][j] = 0;
			}
		}

//		MOSTRAR ARRAY VACIA
		mostrarMatriz(todoTerreno);

//		MENU

		do {

			mostrarMenu();
			accion = accionMenu();
			tratarMenu(accion, todoTerreno);

		} while (accion != 7);

	}

	public static void mostrarMenu() {

		System.out.println("");
		System.out.println(".:MENU:.");
		System.out.println(
				"1.-Rellenar toda la matriz \n2.-Suma de una fila \n3.-Suma de una columna \n4.-Suma de la diagonal principal \n5.-Suma de la diagonal inversa \n6.-Calcular media de todos los valores de la matriz \n7.-Mostrar matriz \n8.-Salir");

	}

	public static int accionMenu() {

//		VARIABLES
		int accion;
		int contador=0;
		
		do {
			
			System.out.println("Introduce lo que desea hacer:");
			accion = entrada.nextInt();
			
			if(contador==0 && accion!=1) {
				System.out.println("No puede elegir esa opción, no se ha rellenado la matriz aún");
				
			}
			if(accion==1) {
				contador++;
			}
			
		}while(contador==0);

		

		return accion;

	}

	public static void tratarMenu(int accion, int[][] matriz) {

		switch (accion) {

		case 1:
			rellenarMatriz(matriz);
			break;
		case 2:
			sumaFila(matriz);
			break;
		case 3:
			sumaColumna(matriz);
			break;
		case 4:
			sumaDiagonalPrincipal(matriz);
			break;
		case 5:
			sumaDiagonalInversa(matriz);
			break;
		case 6:
			mediaNumerosMatriz(matriz);
			break;
		case 7:
			mostrarMatriz(matriz);
			break;
		case 8:
			System.out.println("Saliendo...");
			break;

		}

	}

	public static void rellenarMatriz(int[][] matriz) {

		System.out.println(".:VA A RELLENAR LA MATRIZ:.");
		System.out.println();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Introduce el número que va a ir en la posición: [" + i + "] [" + j + "]");
				matriz[i][j] = entrada.nextInt();
			}
		}

		mostrarMatriz(matriz);

	}

	public static void sumaFila(int[][] matriz) {

//		VARIABLES
		int fila, suma = 0;

		System.out.println(".:SUMA DE FILA:.");
		System.out.println("Intruce la fila de la que quieres sumar sus numeros:");
		fila = entrada.nextInt();

		for (int i = 0; i < 4; i++) {
			suma += matriz[fila][i];
		}

		System.out.println("La suma de la fila " + fila + " es " + suma);

	}

	public static void sumaColumna(int[][] matriz) {

//		VARIABLES
		int columna, suma = 0;

		System.out.println(".:SUMA DE COLUMNA:.");
		System.out.println("Intruce la fila de la que quieres sumar sus numeros:");
		columna = entrada.nextInt();

		for (int i = 0; i < 4; i++) {
			suma += matriz[i][columna];
		}

		System.out.println("La suma de la fila " + columna + " es " + suma);

	}

	public static void sumaDiagonalPrincipal(int[][] matriz) {

//		VARIABLES
		int[] diagonal = new int[4];
		int contador = 0;
		int sumaDiagonal = 0;

		System.out.println("Los numeros que conforman la diagonal principal son:");
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				if (i == j) {

					System.out.print(matriz[i][j] + ", ");
					diagonal[contador] = matriz[i][j];
					contador++;
					sumaDiagonal += matriz[i][j];

				}

			}

		}
		System.out.println();
		System.out.println("La suma de la diagonal principal es: " + sumaDiagonal);

	}

	public static void sumaDiagonalInversa(int[][] matriz) {

//		VARIABLES
		int contador = 3;
		int sumaTotal = 0;

//		CREAMOS LA ARRAY DONDE SE ALMACENAN LOS NUMEROS DE LA DIAGONAL
		int[] diagonalInversa = new int[4];

//		RECORREMOS LA ARRAY PARA BUSCAR LOS NUMEROS DE LA DIAGONAL

		for (int i = 0; i < matriz.length; i++) {

			diagonalInversa[i] = matriz[i][contador];

			contador--;
		}

//		IMPRIMIMOS LOS NUMEROS DE LA DIAGONAL Y HACEMOS LA SUMA TOTAL DE LA DIAGONAL

		System.out.println("Los números que conforman la diagonal inversa son: ");

		for (int j = 0; j < diagonalInversa.length; j++) {

			System.out.print(diagonalInversa[j] + ", ");

			sumaTotal += diagonalInversa[j];
		}

//		IMPRIMIMOS LA SUMA TOTAL

		System.out.println("La suma total de la diagonal inversa es: " + sumaTotal);

	}
	
	public static void mediaNumerosMatriz(int[][] matriz) {
		
//		VARIABLES
		int sumaTotal=0;
		int media;
		
//		RECORREMOS LA MATRIZ SUMANDO TODOS LOS NUMEROS
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				sumaTotal+=matriz[i][j];
			}
		}
		
//		REALIZAMOS LA MEDIA
		media = sumaTotal/NUMEROSTOTALMATRIZ;
		
		System.out.println( "La media es: " + media);
		
		
	}

	public static void mostrarMatriz(int[][] matriz) {

		System.out.println("Matriz:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("%7d", matriz[i][j]);
			}
			System.out.println();
		}

	}

}
