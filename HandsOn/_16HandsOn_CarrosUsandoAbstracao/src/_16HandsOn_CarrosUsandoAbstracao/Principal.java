package _16HandsOn_CarrosUsandoAbstracao;

public class Principal {

	public static void main(String[] args) {
		Corrida corridaDaAmizade = new Corrida(2000);
		corridaDaAmizade.adicionaCarro(new CarroSoma("Carro A", 10, 110));
		corridaDaAmizade.adicionaCarro(new CarroSoma("Carro B", 8, 140));
		corridaDaAmizade.adicionaCarro(new CarroMultiplica("Carro C", 1.7, 100));
		corridaDaAmizade.adicionaCarro(new CarroMultiplica("Carro D", 1.4, 110));
		corridaDaAmizade.umDoisTresEJa();
	}

}
