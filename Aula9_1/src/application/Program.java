package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite os dados do produto: ");
		System.out.print("Nome: ");
		String name = entrada.nextLine();
		
		System.out.print("Preço: ");
		double price = entrada.nextDouble();		
		
		Product product = new Product(name, price);
		
		product.setName("Computador");
		System.out.println("Nome atualizado: " + product.getName());
		
		product.setPrice(1200.00);
		System.out.println("Preço atualizado: " + product.getPrice());
		
		System.out.println();
		System.out.println("Dados do produto: " + product);
		System.out.println();
		System.out.print("Digite a quantidade de produto que será adicionado no estoque: ");
		int quantity = entrada.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		System.out.println();
		System.out.print("Digite a quantidade de produto que será removido do estoque: ");
		quantity = entrada.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		
		
		entrada.close();

	}

}
