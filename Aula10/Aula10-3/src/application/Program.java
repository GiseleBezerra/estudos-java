package application;

public class Program {

	public static void main(String[] args) {
		
		int x = 20;			//Boxing
		Object obj = x;		//Boxing -> Variável do tipo objeto vai converter o valor dela (compatível) para referência (Stack para Heap)
		//Integer obj = x;  //Wrapper class -> são classes que tratam os tipos primitivos como classes
		System.out.println(obj);
		
		
		int y = (int) obj;	//Unboxing -> Variável do tipo inteiro vai receber a conversão do tipo referência do objeto para o compatível (Heap para Stack)
		System.out.println(y); //obs: o Casting é necessário para essa conversão

	}

}
