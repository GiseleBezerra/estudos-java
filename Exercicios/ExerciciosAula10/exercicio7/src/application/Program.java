package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = entrada.nextInt();
		double[] vect = new double[n];
		
		double somaVetor = 0.0;
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = entrada.nextDouble();
			somaVetor += vect[i];
		}
		
		double mediaVetor = somaVetor / vect.length;
		System.out.println("Média do vetor: " + mediaVetor);
		
		
		System.out.print("Elementos abaixo da média:");
		System.out.println();
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < mediaVetor) {
				System.out.println(vect[i]);
			}
		}
		
		entrada.close();
	}

}
