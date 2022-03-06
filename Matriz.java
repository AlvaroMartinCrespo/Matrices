package Matrices;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] todoTerreno = new int[4][4];

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {

				todoTerreno[i][j] = 4;

			}

		}

		for (int x = 0; x < todoTerreno.length; x++) {
			System.out.print("|");
			for (int y = 0; y < todoTerreno[x].length; y++) {
				System.out.print(todoTerreno[x][y]);
				if (y != todoTerreno[x].length - 1)
					System.out.print("\t");
			}
			System.out.println("|");
		}

	}

}
