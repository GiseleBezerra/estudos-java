package udemyAula5;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float x = entrada.nextFloat();
		float y = entrada.nextFloat();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
		else if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if (x < 0 && y >= 1) {
			System.out.println("Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
		entrada.close();
	}

}
