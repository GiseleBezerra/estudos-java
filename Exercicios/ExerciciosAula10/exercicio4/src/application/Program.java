package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = entrada.nextInt();
		double[] vectNumeros = new double[n];
		
		for (int i = 0; i < vectNumeros.length; i++) {
			
			System.out.print("Digite um número: ");
			vectNumeros[i] = entrada.nextInt();
		
		}
		
		System.out.println();
		System.out.println("Números Pares:");
		for (int i = 0; i < vectNumeros.length; i++) {
			if (vectNumeros[i] % 2 == 0) {
				System.out.printf("%.0f  ", vectNumeros[i]);
			}
			
		}
		
		System.out.println();
		int contagemPar = 0;
		for (int i = 0; i < vectNumeros.length; i++) {
			if (vectNumeros[i] % 2 == 0) {
				contagemPar ++;
				
			}
		}
		
		System.out.println("Quantidade de Pares = " + contagemPar);
		
		
		
		entrada.close();

	}

}
