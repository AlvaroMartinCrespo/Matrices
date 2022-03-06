package Matrices;
import java.util.*;

public class Matriz2 {
	
	static Scanner entrada=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int fila=0; fila<3;fila++) {
			for(int columna=0; columna<3; columna++) {
//				System.out.println("|");
//				System.out.printf(" | " + matriz[fila][columna] + " | ");
				System.out.printf("%5d", matriz[fila][columna]);
				System.out.print("|");
			}
			System.out.println("");
		}
		
		int matriz2[][];
		int numeroFilas;
		int numeroColumnas;
		
		System.out.println("¿Cuantas filas tendrá la matriz?");
		numeroFilas=entrada.nextInt();
		
		System.out.println("¿Cuantas columnas tendrá la matriz?");
		numeroColumnas=entrada.nextInt();
		
		matriz2=new int[numeroFilas][numeroColumnas];
		
		for(int fila=0; fila<matriz2.length; fila++) {
			for(int columna=0; columna<matriz2[fila].length ;columna++) {
				System.out.println("Introduzca el valor de la posición [" + fila + "] [" + columna + "]:");
				matriz2[fila][columna]=entrada.nextInt();
			}
		}
		
		System.out.println("Matriz 2:");
		
		for(int fila=0; fila<matriz2.length;fila++) {
			for(int columna=0; columna<matriz2[fila].length; columna++) {
				System.out.printf("%5d", matriz2[fila][columna]);
			}
			System.out.println("");
		

	}

}
}
