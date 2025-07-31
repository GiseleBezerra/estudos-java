package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual é o valor do dólar?");
		double precoDolar = entrada.nextDouble();
		
		System.out.println("Quantos dólares será comprado?");
		double compraDolar = entrada.nextDouble();
		
		double conversao = CurrencyConverter.calculoDolar(precoDolar, compraDolar);
		System.out.printf("Preço convertido em reais: %.2f\n", conversao);
		
		
		entrada.close();
	}

}
