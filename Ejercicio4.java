package Matrices;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio;
		int posicionFilaAlto = 0;
		int posicionColumnaAlto = 0;
		int posicionFilaBajo = 0;
		int posicionColumnaBajo = 0;
		int contador = 0;
		int numeroAlto = 0;
		int numeroBajo = 1000;

		int[][] matriz = new int[6][10];

//		RELLENAMOS LA ARRAY

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				aleatorio = (int) (Math.random() * 1000);
				matriz[i][j] = aleatorio;
			}
		}

//		BUSCAMOS EL NUMERO MAS ALTO Y EL MAS BAJO

		for (int i = 0; i < 6; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				if (matriz[i][j] > numeroAlto) {

					numeroAlto=matriz[i][j];
					posicionFilaAlto = i;
					posicionColumnaAlto = j;

				}
				
				if(matriz[i][j]<numeroBajo) {
					
					numeroBajo=matriz[i][j];
					posicionFilaBajo=i;
					posicionColumnaBajo=j;
					
				}

			}
		}

//		MOSTRAMOS LA ARRAY

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("%7d", matriz[i][j]);
			}
			System.out.println("");
		}

//		MOSTRAMOS LA POSICION DEL NUMERO MAS ALTO Y LA POSICION DEL NUMERO MAS BAJO
		System.out.println("");
		System.out.println("Posicion del numero más alto ( " + numeroAlto + " ) --> Fila: " + posicionFilaAlto + ", Columna: " + posicionColumnaAlto);
		System.out.println("Posicion del numero más bajo ( " + numeroBajo + " ) --> Fila: " + posicionFilaBajo + ", Columna: " + posicionColumnaBajo);

	}

}
