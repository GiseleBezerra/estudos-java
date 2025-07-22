package udemyAula5;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int x = entrada.nextInt();
		
		if ((x % 2) == 0) {
			System.out.printf("PAR");
		}
		else {
			System.out.printf("IMPAR");
		}
		
		entrada.close();
	}

}
