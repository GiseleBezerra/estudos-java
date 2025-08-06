package application;

public class Program {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		
		//For each --> Le cada elemento contido no vetor
		//Leitura: para cada objeto 'obj' contido em vect, faça:
		for (String obj : vect) { //Define o tipo(String) coloca o nome desejado(obj) : vetor(vect)
			System.out.println(obj);
		}

	}

}
