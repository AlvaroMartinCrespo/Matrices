package Matrices;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador=8;
		int numero;
		int[] numerosDiagonal=new int[9];
		int numeroAlto=0;
		int numeroBajo=1000;
		int sumaTotal=0;
		
		int[][] numeros = new int[9][9];
		
//		RELLENAMOS ARRAY

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {

				numeros[i][j] = (int) (Math.random() * 400 + 500);

			}
		}

//		MOSTRAMOS ARRAY

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {

				System.out.printf("%7d", numeros[i][j]);

			}
			System.out.println("");
		}

//		DIAGONAL
		
		System.out.println("");

		for (int i = 0; i < numeros.length; i++) {
			
			numerosDiagonal[i]=numeros[i][contador];
			sumaTotal+=numeros[i][contador];
			contador--;
			
		}
		
		for(int i=0;i<numeros.length;i++) {
			
			if(numerosDiagonal[i]>numeroAlto) {
				
				numeroAlto=numerosDiagonal[i];
				
			}
			
			if(numerosDiagonal[i]<numeroBajo) {
				
				numeroBajo=numerosDiagonal[i];
				
			}
			
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("------------------------------");
		System.out.println("-El número más alto es: " + numeroAlto + "\n-El número más bajo es: " + numeroBajo + "\n-La media de los números de la diagonal es: " + (sumaTotal/10));
		
		

	}

}
