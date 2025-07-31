package resultadoPoo;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class ResultadoFinal {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		
		System.out.println("Digite as medidas do triângulo X");
		x.a = entrada.nextDouble();
		x.b = entrada.nextDouble();
		x.c = entrada.nextDouble();
		
		System.out.println("Digite as medidas do triângulo Y");
		y.a = entrada.nextDouble();
		y.b = entrada.nextDouble();
		y.c = entrada.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("A área do triângulo X: %.4f\n", areaX);
		System.out.printf("A área do triângulo Y: %.4f\n", areaY);
		
		if (areaX > areaY) {
			System.out.println("A maior área: X");
		}
		else {
			System.out.println("A maior área: Y");
		}
		
		entrada.close();

	}
	
}
