package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Program {
	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio: ");
		double radius = entrada.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circunferência: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("Valor de PI: %.2f\n", Calculator.PI);
		
		entrada.close();

	}
	

}
