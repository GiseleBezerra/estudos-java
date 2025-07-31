package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		Employee funcionario = new Employee();
		
		System.out.print("Nome: ");
		funcionario.name = entrada.nextLine();
		
		System.out.print("Salário bruto: ");
		funcionario.glossSalary = entrada.nextDouble();
		
		System.out.print("Imposto: ");
		funcionario.tax = entrada.nextDouble();
		
		System.out.println(funcionario);
	
		System.out.print("Qual a porcentagem para aumentar o salário?: ");
		double porcentagem = entrada.nextDouble();
		funcionario.increaseSalary(porcentagem);
		
		System.out.println("Dados atualizados: " + funcionario);
		
		
		

		entrada.close();
	}

}
