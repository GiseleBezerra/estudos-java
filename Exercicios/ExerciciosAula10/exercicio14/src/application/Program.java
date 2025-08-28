package application;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Program {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();
		
		int linha = entrada.nextInt();
		int coluna = entrada.nextInt();
		
		int[][] matriz = new int[linha][coluna];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = random.nextInt(1, 20);
			}
		}
		
		for(int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
		
		int x = entrada.nextInt();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j ++) {
				
				int direita = j+1;
				int esquerda = j-1;
				int acima = i-1;
				int abaixo = i+1;
				
				int indiceMaximoDireita = matriz[i].length - 1;
				int indiceMaximoAbaixo = matriz.length - 1;
				int indiceMinimo = 0;
				
				if (matriz[i][j] == x) {
					System.out.printf("Posição: %d,%d\n", i, j);
					
					if(esquerda >= indiceMinimo) {
						System.out.printf("Esquerda: %d\n", matriz[i][esquerda]);
					}
					
					if(direita <= indiceMaximoDireita) {
						System.out.printf("Direita: %d\n", matriz[i][direita]);
					}
					
					if(abaixo <= indiceMaximoAbaixo) {
						System.out.printf("Abaixo: %d\n", matriz[abaixo][j]);
					}
					
					
					if(acima >= indiceMinimo) {
						System.out.printf("Acima: %d\n", matriz[acima][j]);
					}
					
					System.out.println();
					
				}
			}
		}
		
		entrada.close();
	}
}