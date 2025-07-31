
import java.util.Scanner;

public class exercicioFor1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int x = entrada.nextInt();
		
		int y = 0;
		
		for (int i=0; i<x; i++) {
			y = i;
			if (y % 2 == 0 ) {
				
			}
			else {
				System.out.println(y);
			}
		}
		
		entrada.close();
		
	}

}
