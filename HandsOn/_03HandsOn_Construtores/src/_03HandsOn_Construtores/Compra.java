package _03HandsOn_Construtores;

public class Compra {

	int valorTotal;
	int numeroParcelas;
	
	public Compra(int valor) {
		this.valorTotal = valor;
		this.numeroParcelas = 1;
	}
	
	public Compra(int quantidadeParcelas, int valorParcela) {
		this.numeroParcelas = quantidadeParcelas;
		this.valorTotal = valorParcela * quantidadeParcelas;
	}
	
	public int getValorTotal() {
		return this.valorTotal;
	}
	
	public int getNumeroParcelas() {
		return this.numeroParcelas;
	}
	
	public int getValorParcela() {
		return this.valorTotal / this.numeroParcelas;
	}
}
