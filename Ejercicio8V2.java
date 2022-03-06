package Matrices;

import java.util.*;

public class Ejercicio8V2 {

	static Scanner entrada = new Scanner(System.in);
	
	static final int NUMEROSTOTALMATRIZ=16;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		VARIABLES
		int accion;
		int contador = 0;

//		INSTANCIAMOS LA MATRIZ
		int[][] todoTerreno = new int[4][4];

//		MOSTRAR ARRAY VACIA
		mostrarMatriz(todoTerreno);

//		MENU

		do {

			if (contador == 0) {

				do {

					mostrarMenu2();
					accion = accionMenu();
					tratarMenu2(accion, todoTerreno);

					if (accion == 1 || accion == 2) {
						contador++;
					}

				} while (contador == 0);

			}

			mostrarMenu();
			accion = accionMenu();
			tratarMenu(accion, todoTerreno);

		} while (accion != 7);

	}

	public static void mostrarMenu() {

		System.out.println("");
		System.out.println(".:MENU PRINCIPAL:.");
		System.out.println(
				"1.-Suma de una fila \n2.-Suma de una columna \n3.-Suma de la diagonal principal \n4.-Suma de la diagonal inversa \n5.-Calcular media de todos los valores de la matriz \n6.-Mostrar matriz \n7.-Salir");

	}

	public static void mostrarMenu2() {

		System.out.println("");
		System.out.println(".:MENU RELLENAR:.");
		System.out.println("1.-Rellenar matriz manualmente \n2.-Rellenar matriz automaticamente");

	}

	public static int accionMenu() {

//		VARIABLES
		int accion;

		System.out.println("Introduce lo que desea hacer:");
		accion = entrada.nextInt();

		return accion;

	}

	public static void tratarMenu2(int accion, int[][] matriz) {

//		VARIABLES
		int fin;

		switch (accion) {

		case 1:
			rellenarMatriz(matriz);
			break;
		case 2:
			System.out.println("Hasta que valor desea que la matriz tome valores:");
			fin = entrada.nextInt();
			rellenarMatrizAutomaticamente(matriz, fin);
			break;

		}

	}

	public static void tratarMenu(int accion, int[][] matriz) {

		switch (accion) {

		case 1:
			sumaFila(matriz);
			break;
		case 2:
			sumaColumna(matriz);
			break;
		case 3:
			sumaDiagonalPrincipal(matriz);
			break;
		case 4:
			sumaDiagonalInversa(matriz);
			break;
		case 5:
			mediaNumerosMatriz(matriz);
			break;
		case 6:
			mostrarMatriz(matriz);
			break;
		case 7:
			System.out.println("Saliendo...");
			break;

		}

	}

	public static void rellenarMatriz(int[][] matriz) {

		System.out.println();
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

	public static void rellenarMatrizAutomaticamente(int[][] matriz, int fin) {

//		VARIABLES
		int aleatorio;

		System.out.println();
		System.out.println(".:SE VA A RELLENAR LA MATRIZ AUTOMATICAMENTE:.");
		System.out.println();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				aleatorio = (int) (Math.random() * fin);
				matriz[i][j] = aleatorio;
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
		int sumaTotal = 0;
		int media;

//		RECORREMOS LA MATRIZ SUMANDO TODOS LOS NUMEROS

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				sumaTotal += matriz[i][j];
			}
		}

//		REALIZAMOS LA MEDIA
		media = sumaTotal / NUMEROSTOTALMATRIZ;

		System.out.println("La media es: " + media);

	}

	public static void mostrarMatriz(int[][] matriz) {

		System.out.println("Matriz:");
		System.out.println();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("%7d", matriz[i][j]);
			}
			System.out.println();
		}

	}

}
