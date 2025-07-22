package apliccation;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Digite as medidas do triângulo X");
		xA = entrada.nextDouble();
		xB = entrada.nextDouble();
		xC = entrada.nextDouble();
		
		System.out.println("Digite as medidas do triângulo Y");
		yA = entrada.nextDouble();
		yB = entrada.nextDouble();
		yC = entrada.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
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
