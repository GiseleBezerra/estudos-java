
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int senha = entrada.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida");
			senha = entrada.nextInt();
		}
		
		System.out.print("Acesso permitido");
		
		entrada.close();
		
	}

}
