

public class AlteracaoEmStrings {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG   ";
		String s01 = original.toLowerCase(); //alterar para letras mínusculas
		String s02 = original.toUpperCase(); //alterar para letras maiúsculas
		String s03 = original.trim(); //remover espaços externos da string
		String s04 = original.substring(2); //pegar os caracteres a partir do numero digitado nos ()
		String s05 = original.substring(2, 9); //pegar os caracteres a partir do primeiro numero até o último numero
		String s06 = original.replace('a', 'x'); //troca algum caractere por outro caractere
		String s07 = original.replace("abc", "xy"); //troca alguma parte/string por outra parte/string
		int i = original.indexOf("bc"); //1ª posição da string digitada nos ()
		int j = original.lastIndexOf("bc"); //Última posição da string digitada nos () 
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		
		String s = "potato apple lemon"; //Recortar String pelos espaços e armaneza cada palavra em uma variável dentro de um vetor
		String[] vect = s.split(" ");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);

	}

}
