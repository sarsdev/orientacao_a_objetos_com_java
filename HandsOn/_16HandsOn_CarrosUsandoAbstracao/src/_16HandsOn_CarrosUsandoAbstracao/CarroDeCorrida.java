package _16HandsOn_CarrosUsandoAbstracao;

public abstract class CarroDeCorrida {

	protected int velocidade;
	protected int velocidadeMaxima;
	protected String nome;
	
	public CarroDeCorrida(String nome, int velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidade = 0;
	}
	
	public abstract void acelerar();

	public String getNome() {
		return this.nome;
	}

	public int getVelocidade() {
		return this.velocidade;
	}

	public void frear() {
		this.velocidade /= 2;
	}

}
