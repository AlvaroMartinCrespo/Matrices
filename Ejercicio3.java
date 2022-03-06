package Matrices;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fila, columna, aleatorio;
		int sumaTotal = 0;

		int[][] matriz = new int[5][6];

		System.out.println(".:SE VA A RELLENAR LA ARRAY DE FORMA ALEATORIA CON NUMEROS ENTRE 100 Y 999:.");
		System.out.println("");
//		RELLENAR ARRAY

		for (fila = 0; fila < matriz.length - 1; fila++) {
			for (columna = 0; columna < matriz[fila].length - 1; columna++) {
				aleatorio=(int)(Math.random()*900+100);
				matriz[fila][columna]=aleatorio;
			}
		}

//		SUMAR FILAS	

		for (fila = 0; fila < 4; fila++) {
			int sumaFila = 0;
			for (columna = 0; columna < matriz[fila].length; columna++) {
				sumaFila += matriz[fila][columna];
			}
			matriz[fila][5] = sumaFila;
			sumaTotal += sumaFila;
			sumaFila = 0;
		}

//		SUMAR COLUMNAS

		for (columna = 0; columna < 5; columna++) {
			int sumaColumna = 0;
			for (fila = 0; fila < 4; fila++) {
				sumaColumna += matriz[fila][columna];
			}
			matriz[4][columna] = sumaColumna;
			sumaTotal += sumaColumna;
			sumaColumna = 0;
		}

//		SUMATOTAL
		matriz[4][5] = sumaTotal;

//		MOSTRAR ARRAY

		for (fila = 0; fila < matriz.length; fila++) {
			for (columna = 0; columna < matriz[fila].length; columna++) {
				System.out.printf("%7d", matriz[fila][columna]);

			}
			System.out.println("");
		}

	}

}
