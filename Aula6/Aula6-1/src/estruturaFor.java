
import java.util.Scanner;

public class estruturaFor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int x = entrada.nextInt();
		
		int soma = 0;
		
		for (int i=0; i<x; i++) {
			int y = entrada.nextInt();
			soma += y;
		}
		
		System.out.println(soma);
		
		entrada.close();
		
	}

}
