

import java.util.Scanner;

public class exercicioFor5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		
		for (int i = n; i >= 1; i--) {
			
			if(i-1 != 0) {
				System.out.println(i-1);
			}
			
			
		}
		
		entrada.close();

	}

}
