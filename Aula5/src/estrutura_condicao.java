import java.util.Scanner;

public class estrutura_condicao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int hora;
		
		System.out.printf("Quantas horas?");
		hora = entrada.nextInt();
		
		if (hora < 12) {
			System.out.printf("Bom dia");
		}
		else if (hora < 18) {
			System.out.printf("Boa tarde");
		}
		else {
			System.out.printf("Boa noite");
		}
		
		
		entrada.close();

	}

}
