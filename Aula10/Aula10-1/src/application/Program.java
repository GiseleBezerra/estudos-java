package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		double[] vect = new double[n]; //criação de um vetor
		
		for (int i = 0; i < n; i++) {
			vect[i] = entrada.nextDouble();
		}
		
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vect[i];
		}
		
		double media = soma / n;
		System.out.printf("Altura média: %.2f%n", media);
		
		entrada.close();
	}
}
