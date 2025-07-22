package udemyAula5;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		
		
		if (A % B == 0 || B % A == 0) {
			System.out.printf("São Multiplos");
		}
		else {
			System.out.printf("Não são Multiplos");
		}	
		
		entrada.close();

	}

}
