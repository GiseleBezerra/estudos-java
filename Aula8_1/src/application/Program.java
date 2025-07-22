package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product; //importando a entidade da classe para poder usar o obejto

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		Product product = new Product(); //um novo objeto produto para a classe Produto
		
		System.out.println("Digite os dados do produto: ");
		System.out.print("Nome: ");
		product.name = entrada.nextLine(); //objeto produto recebendo a entrada digitada
		
		System.out.print("Preço:");
		product.price = entrada.nextDouble();
		
		System.out.print("Quantidade no estoque: \n");
		product.quantity = entrada.nextInt();
		
		System.out.println("Dados do produto: " + product);
		System.out.println();
		
		System.out.println("Digite a quantidade de produtos que deseja adicionar no estoque: ");
		int quantity = entrada.nextInt();
		product.addProducts(quantity); //objeto produto recebendo a quantidade digitada para a função de adicionar produtos
		
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		
		System.out.println();
		System.out.println("Digite a quantidade de produtos para serem removidos do estoque: ");
		quantity = entrada.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		
		entrada.close();
	}
	
}
