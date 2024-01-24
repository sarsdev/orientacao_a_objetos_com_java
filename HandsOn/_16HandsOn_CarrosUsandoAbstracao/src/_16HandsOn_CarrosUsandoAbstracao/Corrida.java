package _16HandsOn_CarrosUsandoAbstracao;

import java.util.HashMap;
import java.util.Map;

public class Corrida {
	
	private int pista;
	private Map<CarroDeCorrida, Integer> carros = new HashMap<>();

	public Corrida(int tamanho) {
		this.pista = tamanho;
	}
	
	public void adicionaCarro(CarroDeCorrida carro) {
		carros.put(carro, 0);
	}
	
	private boolean terminou() {
		for(Integer valor : carros.values()) {
			if(valor > this.pista) {
				return true;
			}
		}
		return false;
	}
	
	public void umDoisTresEJa() {
		while(!this.terminou()) {
			for(CarroDeCorrida carro : carros.keySet()) {
				carro.acelerar();
				int distancia = carros.get(carro);
				distancia += carro.getVelocidade();
				carros.put(carro, distancia);
			}			
		}
		for(CarroDeCorrida carro : carros.keySet()) {
			System.out.println(carro.getNome() + " - " + carros.get(carro));
		}
	}

}
