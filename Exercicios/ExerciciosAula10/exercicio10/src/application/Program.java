package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = entrada.nextInt();
		
		String[] vectNome = new String[n];
		double[] vectNota1 = new double[n];
		double[] vectNota2 = new double[n];
		
		for (int i = 0; i < vectNome.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º aluno");
			vectNome[i] = entrada.next();
			vectNota1[i] = entrada.nextDouble();
			vectNota2[i] = entrada.nextDouble();	
		}
		
		System.out.println("Alunos aprovados:");
		double mediaNotas = 0.0;
		for (int i = 0; i < vectNome.length; i++) {
			mediaNotas = (vectNota1[i] + vectNota2[i]) / 2;
			if (mediaNotas >= 6.0) {
				System.out.println(vectNome[i]);
			}
			
		}
		
		entrada.close();
	}

}
