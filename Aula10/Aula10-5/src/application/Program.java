package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); //Definindo uma interface(LIST) lista do tipo string que instancia para uma classe ArrayList
		
		list.add("Maria"); //Adicionando elementos na lista
		list.add("Alex");
		list.add("Bruna");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Judite");
		list.add("Marco"); //Primeiro posição e depois o que vai colocar
		
		System.out.println(list.size()); //Visualizar o tamanho da lista
		

		for (String nomes : list) {
			System.out.println(nomes);
		}
		
		System.out.println("----------------------");
		
		list.remove("Anna"); //irá remover o que é igual aqui
		list.remove(3); 	 //irá remover o que está na posição digitada
		list.removeIf(x -> x.charAt(0) == 'M'); //Predicado --> irá remover toda string que começa com M
		for (String nomes : list) {
			System.out.println(nomes);
		}
		
		System.out.println("----------------------");
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco")); //Quando não encontra um elemento, ele volta -1
		
		System.out.println("----------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //Criação de uma nova lista do tipo string chamada result, e a "stream" está preparando os dados da lista list para serem processados. "filter" irá filtrar o que está no predicado. "collect" irá coletar os elementos 
	
		for (String nomes : result) {
			System.out.println(nomes);
		}
		
		System.out.println("----------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'K').findFirst().orElse(null); //
		System.out.println(name);
	}

}
