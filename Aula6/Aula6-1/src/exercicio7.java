

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int quadrado = i * i;
			int cubo = i * i * i;
			System.out.printf("%d %d %d\n", i, quadrado, cubo);
		}

		entrada.close();
		
	}

}
