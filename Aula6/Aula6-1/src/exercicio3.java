
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int tipo = 0;
		
		int somaAlcool = 0;
		int somaGasolina = 0;
		int somaDiesel = 0;
		
		while (tipo != 4) {
			
			tipo = entrada.nextInt();
			
			switch (tipo) {
			case 1:
				somaAlcool += 1;
				break;
			case 2:
				somaGasolina += 1;
				break;
			case 3:
				somaDiesel += 1;
				break;
			case 4:
				System.out.println("MUITO OBRIGADO");
				System.out.printf("Álcool: %d\n", somaAlcool);
				System.out.printf("Gasolina: %d\n", somaGasolina);
				System.out.printf("Diesel: %d\n", somaDiesel);
				break;
			}
			
		}
		
		entrada.close();

	}

}
