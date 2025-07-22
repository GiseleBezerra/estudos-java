package teste;

public class Banco {
	public int conta;
	public double saldo;
	public String nome;
	
	public String toString() {
		return String.format("%s %d %.2f", nome, conta, saldo);
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor;
	}
	
	public void transferencia() {
		
		
	}
}
