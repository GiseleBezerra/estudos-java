package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos valores vai ter cada vetor? ");
		int n = entrada.nextInt();
		double[] vectA = new double[n];
		double[] vectB = new double[n];
		double[] vectC = new double[n];
		
		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < vectA.length; i++) {
			vectA[i] = entrada.nextDouble();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < vectB.length; i++) {
			vectB[i] = entrada.nextDouble();
		}
		
		for (int i = 0; i < vectC.length; i++) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}

		entrada.close();
	}

}
