package Matrices;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aleatorio, numero;
		int posicionFilaAlto = 0;
		int posicionColumnaAlto = 0;
		int posicionFilaBajo = 0;
		int posicionColumnaBajo = 0;
		int contador = 0;
		int numeroAlto = 0;
		int numeroBajo = 1000;
		boolean repetido = false;

		int[][] matriz = new int[6][10];

//		RELLENAMOS LA ARRAY

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				aleatorio = (int) (Math.random() * 1000);
				numero = aleatorio;

				for (int h = 0; h < 6; h++) {
					for (int k = 0; k < matriz[i].length; k++) {

						if (numero == matriz[h][k]) {

							repetido = true;
							break;

						} else {

							repetido = false;
						}

					}

					if (repetido) {
						break;
					}

				}

				if (repetido) {

					matriz[i][j] = 0;

				} else {

					matriz[i][j] = aleatorio;

				}

			}

		}

//		BUSCAMOS EL NUMERO MAS ALTO Y EL MAS BAJO

		for (int i = 0; i < 6; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				if (matriz[i][j] > numeroAlto) {

					numeroAlto = matriz[i][j];
					posicionFilaAlto = i;
					posicionColumnaAlto = j;

				}

				if (matriz[i][j] < numeroBajo) {

					numeroBajo = matriz[i][j];
					posicionFilaBajo = i;
					posicionColumnaBajo = j;

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
		System.out.println("Posicion del numero más alto ( " + numeroAlto + " ) --> Fila: " + posicionFilaAlto
				+ ", Columna: " + posicionColumnaAlto);
		System.out.println("Posicion del numero más bajo ( " + numeroBajo + " ) --> Fila: " + posicionFilaBajo
				+ ", Columna: " + posicionColumnaBajo);

	}

}
