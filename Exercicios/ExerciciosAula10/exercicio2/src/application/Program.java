package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Quantos números você vai digitar? ");
		int n = entrada.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = entrada.nextDouble();
		}
		
		System.out.println();
		
		System.out.print("Valores = ");
		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + "  ");
		}
		
		System.out.println();
		
		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}
		System.out.println("Soma = " + soma);
		
		double media = 0.0;
		for (int i = 0; i < vect.length; i++) {
			media = soma / vect.length;
		}
		System.out.println("Média = " + media);

		entrada.close();
	}

}
