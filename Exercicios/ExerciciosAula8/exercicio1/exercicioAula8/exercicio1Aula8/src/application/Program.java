package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		Rectangle retangulo = new Rectangle();
		
		System.out.println("Digite a largura e altura do retângulo: ");
		retangulo.width = entrada.nextDouble();
		retangulo.height = entrada.nextDouble();
		
		System.out.println("AREA = " + retangulo.area());
		System.out.println("PERIMETRO = " + retangulo.perimeter());
		System.out.printf("DIAGONAL = %.2f\n", retangulo.diagonal());
		
		
		entrada.close();

	}

}
