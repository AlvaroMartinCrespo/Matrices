package Matrices;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ARRAY

		int[][] numeros = new int[10][10];
		int[] diagonal=new int[10];
		int contador=0;
		int numeroMasAlto=0;
		int numeroMasBajo=600;
		int sumaDiagonal=0;

//		RELLENAMOS ARRAY

		for (int i = 0; i < numeros.length; i++) {

			for (int j = 0; j < numeros[i].length; j++) {

				numeros[i][j] = (int) (Math.random() * 100 + 200);

			}

		}

//		MOSTRAMOS LA ARRAY

		for (int i = 0; i < numeros.length; i++) {

			for (int j = 0; j < numeros[i].length; j++) {

				System.out.printf("%7d", numeros[i][j]);

			}

			System.out.println("");

		}

//		DIAGONAL

		System.out.println(" ");
		System.out.println("Los numeros de la diagonal son:");
		
		for (int i = 0; i < numeros.length; i++) {

			for (int j = 0; j < numeros[i].length; j++) {

				if (i == j) {

					System.out.print(numeros[i][j] + ", ");
					diagonal[contador]=numeros[i][j];
					contador++;
					sumaDiagonal+=numeros[i][j];

				}

			}

		}
		
//		NUMEROS MAS ALTO Y MAS BAJO
		
		for(int i=0;i<diagonal.length;i++) {
			
			if(diagonal[i]>numeroMasAlto) {
				
				numeroMasAlto=diagonal[i];
				
			}
			
			if(diagonal[i]<numeroMasBajo) {
				
				numeroMasBajo=diagonal[i];
				
			}
			
		}
		System.out.println("");
		System.out.println("------------------------------");
		System.out.println("-El número más alto es: " + numeroMasAlto + "\n-El número más bajo es: " + numeroMasBajo + "\n-La media de los números de la diagonal es: " + (sumaDiagonal/10));


	}

}
