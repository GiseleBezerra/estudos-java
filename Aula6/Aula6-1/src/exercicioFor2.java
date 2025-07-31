
import java.util.Scanner;

public class exercicioFor2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		
		int x = 0;
		
		int in = 0;
		int out = 0;
		
		for (int i = 1; i <= n; i++) {
			x = entrada.nextInt();
			
			
			if (x >= 10 && x <= 20) {
				in += 1;
			}
			else {
				out += 1;
			}
		}
		
		System.out.printf("%d in\n", in);
		System.out.printf("%d out\n", out);
		
		entrada.close();
		
	}

}
