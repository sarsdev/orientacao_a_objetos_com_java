package embaralhador;

import auxiliar.Aleatorio;
import auxiliar.Embaralhadores;

public class FabricaEmbaralhadores {
	
	private Embaralhadores[] listaDeEmbaralhadores;
	private int quantidadeDeEmbaralhadores;
	
	public FabricaEmbaralhadores() {
		this.listaDeEmbaralhadores = Embaralhadores.values();
		this.quantidadeDeEmbaralhadores = this.listaDeEmbaralhadores.length;
	}
	
	public Embaralhador getEmbaralhador(Embaralhadores embaralhador) throws Exception {
		switch(embaralhador) {
			case RANDOMICO: return new EmbaralhadorRandomico();
			case CIFRA_DE_CESAR: return new EmbaralhadorCifraDeCesar();
			default: throw new Exception("Erro interno: O embaralhador informado não existe! - Valor informador: " + embaralhador.name());
		}
	}
	
	public Embaralhador getEmbaralhadorAleatorio() throws Exception {
		int posicaoAleatoria = Aleatorio.getNumeroAleatorioBaseZero(this.quantidadeDeEmbaralhadores);
		switch(this.listaDeEmbaralhadores[posicaoAleatoria]) {
			case RANDOMICO: return new EmbaralhadorRandomico();
			case CIFRA_DE_CESAR: return new EmbaralhadorCifraDeCesar();
			default: throw new Exception("Erro interno: O embaralhador escolhido aleatoriamente não existe! - Valor aleatório: " + posicaoAleatoria);
		}
	}
	
}