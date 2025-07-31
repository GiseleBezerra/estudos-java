

import java.util.Scanner;

public class exercicioFor4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		
		for (int i=1; i<=n; i++) {
			double n1 = entrada.nextDouble();
			double n2 = entrada.nextDouble();
			
			if (n2 == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double div = n1 / n2;
				System.out.println(div);
			}
		}
		
		entrada.close();
		
	}

}
