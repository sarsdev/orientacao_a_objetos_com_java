package _16HandsOn_CarrosUsandoAbstracao;

public class CarroSoma extends CarroDeCorrida {

	private int potencia;
	
	public CarroSoma(String nome, int potencia, int velocidadeMaxima) {
		super(nome, velocidadeMaxima);
		this.potencia = potencia;
	}
	
	@Override
	public void acelerar() {
		this.velocidade += this.potencia;
		this.velocidade = this.velocidade > this.velocidadeMaxima ? this.velocidadeMaxima : this.velocidade;
	}
}
