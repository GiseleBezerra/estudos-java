package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = entrada.nextInt();
		char[] vectGenero = new char[n];
		double[] vectAltura = new double[n];
		
		for (int i = 0; i < vectGenero.length; i++) {
			System.out.println("Altura da " + ( i + 1) + "ª pessoa: ");
			vectAltura[i] = entrada.nextDouble();
			
			System.out.println("Gênero da " + ( i + 1) + "ª pessoa: ");
			vectGenero[i] = entrada.next().charAt(0);
		}
		
		double menorAltura = vectAltura[0];
		double maiorAltura = vectAltura[0];
		for (int i = 0; i < vectGenero.length; i++) {
			if(vectAltura[i] < menorAltura) {
				menorAltura = vectAltura[i];
			}
			if (vectAltura[i] > maiorAltura){
				maiorAltura = vectAltura[i];
			}
			
		}
		
		double somaAltura = 0.0;
		int contMulheres = 0;
		for (int i = 0; i < vectAltura.length; i++) {
			if (vectGenero[i] == 'F' || vectGenero[i] == 'f') {
				somaAltura += vectAltura[i];
				contMulheres++;
			}
		}
		
		double mediaAltura = 0.0;
		if (contMulheres > 0) {
		    mediaAltura = somaAltura / contMulheres;
		}
		
		int contagem = 0;
		for (int i = 0; i < vectAltura.length; i++) {
			if (vectGenero[i] == 'M' || vectGenero[i] == 'm') {
				contagem++;
			}
		}
		
		System.out.println("Menor altura: " + menorAltura);
		System.out.println("Maior altura: " + maiorAltura);
		System.out.printf("Média das alturas das mulheres: %.2f\n", mediaAltura);
		System.out.println("Número de homens: " + contagem);
		

		
		entrada.close();
	}

}
