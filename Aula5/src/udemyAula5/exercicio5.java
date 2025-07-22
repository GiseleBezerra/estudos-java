package udemyAula5;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int codigo = entrada.nextInt();
		int quantidade = entrada.nextInt();

		switch (codigo) {
		case 1: 
			System.out.printf("Total: R$ %.2f", 4.0 * quantidade);
			break;
			
		case 2:
			System.out.printf("Total: R$ %.2f", 4.5 * quantidade);
			break;
			
		case 3:
			System.out.printf("Total: R$ %.2f", 5.0 * quantidade);
			break;
			
		case 4:
			System.out.printf("Total: R$ %.2f", 2.0 * quantidade);
			break;
			
		case 5:
			System.out.printf("Total: R$ %.2f", 1.5 * quantidade);
			break;
		}
		
		entrada.close();
	}

}
