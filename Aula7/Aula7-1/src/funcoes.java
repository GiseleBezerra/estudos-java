

import java.util.Scanner;

public class funcoes {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
			 System.out.println("Escreva três números:");
			 int a = entrada.nextInt();
			 int b = entrada.nextInt();
			 int c =entrada.nextInt();
			 
			 int higher = max(a, b, c);
			 
			 showResult(higher);
			 
			 entrada.close();		 
		
	}
	
		 public static int max(int x, int y, int z) { //método/função do tipo INT (retorna valores inteiros) que faz referência à funcão da Main
			 
		 int aux;
		 
		 if (x > y && x > z) {
			 	aux = x;
			 } else if (y > z) {
				 aux = y;
			 } else {
				 aux = z;
			 }
			 return aux;
			 
		 }
		 
		 public static void showResult(int value) { //método/função do tipo VOID pois não retornam nada, apenas realizam uma ação
			 System.out.println("O maior número é = " + value);
		 
		 }
		 
}
