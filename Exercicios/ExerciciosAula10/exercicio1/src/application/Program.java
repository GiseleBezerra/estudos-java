package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantos números você vai digitar? ");
		n = entrada.nextInt();
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um número: ");
			vect[i] = entrada.nextInt();
		}
		
		System.out.println("NÚMEROS NEGATIVOS:");
		
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }
				
		entrada.close();
		
	}

}
