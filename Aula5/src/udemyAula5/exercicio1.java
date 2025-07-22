package udemyAula5;
import java.util.Scanner;


public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int x = entrada.nextInt();
		
		if (x < 0) {
			System.out.printf("NEGATIVO");
		}
		else {
			System.out.printf("NÃO NEGATIVO");
		}
		
		entrada.close();
	}

}
