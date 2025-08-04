package application;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar?");
		int n = entrada.nextInt();
		
		String[] vectNome = new String[n];
		double[] vectIdade = new double[n];
		
		
		for (int i = 0; i < vectNome.length; i++) {
			System.out.println("Dados da " + ( i + 1 ) + "ª pessoa: ");
			System.out.print("Nome: ");
			vectNome[i] = entrada.next();
			System.out.print("Idade: ");
			vectIdade[i] = entrada.nextDouble();
		}
		
		double idadeMaior = 0.0;
		String nomeMaior = "";
		for (int i = 0; i < vectNome.length; i++) {
			if (idadeMaior < vectIdade[i]) {
				idadeMaior = vectIdade[i];
				nomeMaior = vectNome[i];
			}
			
		}
		
		System.out.println("Pessoa mais velha: " + nomeMaior);
		
		

		entrada.close();
	}

}
