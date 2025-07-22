package udemyAula5;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float x = entrada.nextFloat();
		
		if (x >= 0 && x <= 25) {
			System.out.printf("Intervalo [0,25]");
		}
		else if (x > 25 && x <= 50) {
			System.out.printf("Intervalo (25,50]");
		}
		else if (x > 50 && x <= 75) {
			System.out.printf("Intervalo (50,75]");
		}
		else if (x > 75 && x <= 100){
			System.out.printf("Intervalo (75,100]");
		}
		else {
			System.out.printf("Fora de intervalo");
		}
		
		entrada.close();
	}

}
