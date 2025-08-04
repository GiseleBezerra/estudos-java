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
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = entrada.nextDouble();
		}
		
		int somaPares = 0;
		int qtdPares = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				somaPares += vect[i];
				qtdPares++;
			}
		}
		
		if (qtdPares == 0) {
			System.out.println("Nenhum número Par");
		} else {
			double media = (double) somaPares / qtdPares;
			System.out.printf("Média dos Pares = %.1f\n", media);
		}
		

		entrada.close();
	}

}
