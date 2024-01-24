package _18HandsOn_ParcelaComJuros;

public class Compra {
	
	private double valor;

	public Compra(double valor) throws Exception {
		if(valor <= 0.0) {
			throw new Exception("O valor da compra não pode ser zero ou um valor negativo!");
		}
		this.valor = valor;
	}
	
	public double total() {
		return this.valor;
	}

}
