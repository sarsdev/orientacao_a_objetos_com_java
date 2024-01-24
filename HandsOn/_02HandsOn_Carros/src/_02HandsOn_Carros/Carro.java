package _02HandsOn_Carros;

public class Carro {

	int potencia;
	int velocidade;
	String nome;
	
	int getVelocidade() {
		return velocidade;
	}
	
	void acelerar() {
		velocidade += this.potencia;
	}
	
	void frear() {
		velocidade /= 2;
	}
	
	void imprimir() {
		System.out.println("O carro "+ nome +" está a velocidade de "+ getVelocidade() +" km/h");
	}
}
