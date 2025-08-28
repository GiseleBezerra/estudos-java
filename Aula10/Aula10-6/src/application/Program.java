package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		int[][] mat = new int[n][n]; //criação de matriz
		
		for (int i = 0; i < mat.length; i++) { //parte linha/vertical da matriz
			for (int j = 0; j < mat[i].length; j++) { //parte coluna/horizontal da matriz
				mat[i][j] = entrada.nextInt();
			}
		}
		
		System.out.println("Diagonal principal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();

		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("Números negativos: " + count);
		
		entrada.close();
	}

}
