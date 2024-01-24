package _13HandsOn_Banco;

public class ContaCorrente {

	int saldo;
	
	public int sacar(int valor) {
		if(valor > this.saldo) {
			return 0;
		} else {
			this.saldo -= valor;
			return valor;
		}
	}
	
	public void depositar(int valor) {
		this.saldo += valor;
	}
}
