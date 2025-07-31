package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		Product[] vect = new Product[n]; //criação do vetor
		
		for (int i=0; i<vect.length; i++) { //tamanho do vetor feito com a propriedade length
			String name = entrada.next();
			double price = entrada.nextDouble();
			vect[i] = new Product(name, price); //preenchendo o vetor por classe
		}
		
		double soma = 0.0;
		for (int i=0; i<vect.length; i++) {
			soma += vect[i].getPrice();
		}
		
		double media = soma / vect.length;
		
		System.out.printf("Preço médio = %.2f\n", media);
		
		
		entrada.close();
	}

}
