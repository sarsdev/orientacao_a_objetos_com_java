package _13HandsOn_Banco;

public class ContaEspecial extends ContaCorrente {

	int limite;

	public ContaEspecial(int limite) {
		this.limite = limite;
	}
	
	public int sacar(int valor) {
		if(valor > (this.saldo + this.limite)) {
			return 0;
		} else {
			this.saldo -= valor;
			return valor;
		}
	}
}
