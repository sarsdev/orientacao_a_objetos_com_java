package _18HandsOn_ParcelaComJuros;

public class CompraParcelada extends Compra {
	
	private int quantidadeParcelas;
	private double jurosAoMes;

	public CompraParcelada(double valor, int quantidadeParcelas, double jurosAoMes) throws Exception {
		super(valor);
		if(quantidadeParcelas <= 0) {
			throw new Exception("A quantidade de parcelas não pode ser zero ou um valor negativo!");
		}
		if(jurosAoMes <= 0.0) {
			throw new Exception("O valor do juros não pode ser zero ou um valor negativo!");
		}
		this.quantidadeParcelas = quantidadeParcelas;
		this.jurosAoMes = jurosAoMes;
	}
	
	public double total() {
		return this.arredondaNumero(this.calculaJurosCompostos(), 2);
	}
	
	private double calculaJurosCompostos() {
		return super.total() * Math.pow((1 + (this.jurosAoMes / 100)), this.quantidadeParcelas);
	}
	
	private double arredondaNumero(double valor, int quantidadeCasasDecimais) {
		double fatorCasasDecimais = Math.pow(10.0, quantidadeCasasDecimais);
		return Math.round(valor * fatorCasasDecimais) / fatorCasasDecimais;
	}

}
