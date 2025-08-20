package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Emplyoee;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		List<Emplyoee> list = new ArrayList<>();
		
		System.out.print("Quantos funcionários serão registrados? ");
		int n = entrada.nextInt();
		double percentage = 0.0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Funcionário #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = entrada.nextInt();
			System.out.print("Nome: ");
			entrada.nextLine();
			String name = entrada.nextLine();
			
			System.out.print("Salário: ");
			Double salary = entrada.nextDouble();
			
			list.add(new Emplyoee(id, name, salary));
			System.out.println();
		}
		
		System.out.print("Digite o id do funcionário que receberá um aumento: ");
		int id = entrada.nextInt();
		Emplyoee procurarFunc = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (procurarFunc == null) {
			System.out.println("Esse id não existe");
		}
		else {
			System.out.println("Digite a porcentagem: ");
			percentage = entrada.nextDouble();
			procurarFunc.increaseSalary(percentage);
		}
		
		System.out.println("Lista dos funcionários: ");
		for (Emplyoee func : list) {
			System.out.println(func);
		}
		
		entrada.close();
	}

}
