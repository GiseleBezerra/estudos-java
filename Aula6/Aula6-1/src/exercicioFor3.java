
import java.util.Scanner;

public class exercicioFor3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		
		int peso1 = 2;
		int peso2 = 3;
		int peso3 = 5;
		
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		
		
		for (int i = 1; i <= n; i++) {
			nota1 = entrada.nextDouble();
			nota2 = entrada.nextDouble();
			nota3 = entrada.nextDouble();
						double media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
			System.out.printf("%.1f\n", media);
		}
		
		System.out.println();
		
		entrada.close();
		
	}

}
