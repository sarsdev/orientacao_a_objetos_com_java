package _16HandsOn_CarrosUsandoAbstracao;

public class CarroMultiplica extends CarroDeCorrida {
	
	private double potencia;

	public CarroMultiplica(String nome, double potencia, int velocidadeMaxima) {
		super(nome, velocidadeMaxima);
		this.potencia = (potencia > 1 && potencia < 2) ? potencia : 1.5;		
	}

	@Override
	public void acelerar() {
		if(this.velocidade == 0) {
			this.velocidade = 10;
		} else {
			this.velocidade *= this.potencia;			
		}
		this.velocidade = this.velocidade > this.velocidadeMaxima ? this.velocidadeMaxima : this.velocidade;
	}

}
