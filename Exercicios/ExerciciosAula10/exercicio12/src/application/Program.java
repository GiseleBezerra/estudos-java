package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Pensionato;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		Pensionato[] vectPessoa = new Pensionato[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = entrada.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.print("Aluguel #" + i + ":");
			System.out.println();
			System.out.print("Nome: ");
			entrada.nextLine();
			String name = entrada.nextLine();
			System.out.print("Email: ");
			String email = entrada.next();
			System.out.print("Quarto: ");
			int quartoNum = entrada.nextInt();
			Pensionato aluguelQuarto = new Pensionato(name, email); //"variável" aluguelQuarto da classe Pensionato irá receber o construtor pensionato os dados digitados
			vectPessoa[quartoNum] = aluguelQuarto;	//vetor na posição do quarto(numero digitado) irá receber os dados da variavel aluguelQuarto
		}
		
		System.out.println();
		System.out.println("Quartos alugados: ");
		for (int i = 0; i < vectPessoa.length; i++) {
			if (vectPessoa[i] != null) {
				System.out.println(i + ": " + vectPessoa[i]);
			}
		}
		
		entrada.close();
	}

}
