package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Peoples;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantas pessoas serão digitadas? ");
		int n = entrada.nextInt();

		Peoples[] vectPeoples = new Peoples[n];

		double sum = 0.0;
		double percent = 0.0;

		for (int i = 0; i < vectPeoples.length; i++) {
			System.out.printf("Dados da %dª pessoa: \n", i + 1);

			System.out.print("Nome: ");
			String name = entrada.next();

			System.out.print("Idade: ");
			int age = entrada.nextInt();

			if (age < 16) {
				percent += 1;
			}

			System.out.print("Altura: ");
			double height = entrada.nextDouble();
			
			sum += height;

			vectPeoples[i] = new Peoples(name, age, height);

			System.out.println();
			System.out.println(vectPeoples[i].toString());
			System.out.println();

		}

		double avgHeight = sum / vectPeoples.length;
		System.out.printf("Altura média: %.2f\n", avgHeight);

		percent = percent / vectPeoples.length * 100;

		System.out.printf("Pessoas com menos de 16 anos: %.1f\n", percent);

		for (int i = 0; i < vectPeoples.length; i++) {
			if (vectPeoples[i].getAge() < 16) {

				System.out.println(vectPeoples[i].getName());
			}
		}

		entrada.close();
	}

}
