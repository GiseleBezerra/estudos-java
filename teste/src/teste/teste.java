package teste;

public class teste {

	public static void main(String[] args) {
		Banco contaGu = new Banco();
		Banco contaGi = new Banco();
		
		contaGu.nome = "Gustavo";
		contaGu.saldo = 1000;
		contaGu.conta = 123;
		
		contaGi.nome = "Gisele";
		contaGi.saldo = 2000;
		contaGi.conta = 321;

		System.out.println(contaGu);
		System.out.println(contaGi);

		
		contaGu.deposito(50);
		System.out.println(contaGu);
		
		contaGi.saque(50);
		System.out.println(contaGi);
		
		
	}

}
