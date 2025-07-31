package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;
public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		Student estudante = new Student();
		
		estudante.name = entrada.nextLine();
		estudante.nota1 = entrada.nextDouble();
		estudante.nota2 = entrada.nextDouble();
		estudante.nota3 = entrada.nextDouble();
		
		double notaFinal = estudante.finalGrade();
		
		System.out.println("NOTA FINAL = " + notaFinal);
		
		if (notaFinal >= 60) {
			System.out.println("PASSOU");
		}
		else {
			System.out.println("FALHOU");
			System.out.println("FALTOU " + estudante.pontosFaltantes());
		}
		
		entrada.close();
	}

}
