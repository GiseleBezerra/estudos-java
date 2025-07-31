package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar? ");
		int n = entrada.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = entrada.nextDouble();
		}
		
		System.out.println();
		
		double valorMaior = vect[0];
		int posicaoMaior = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] > valorMaior) {
				valorMaior = vect[i];
				posicaoMaior = i;
			}
			
		}
		
		System.out.printf("Maior valor: %.1f\n", valorMaior);
		System.out.println("Posição do maior valor: " + posicaoMaior);
		
		
		entrada.close();
	}

}
