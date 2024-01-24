package embaralhador;

import auxiliar.Aleatorio;

public class EmbaralhadorRandomico implements Embaralhador {

	@Override
	public String embaralharPalavra(String palavra) {
		char[] letrasNaOrdem = palavra.toCharArray();
		char[] letrasEmbaralhadas = new char[palavra.length()];
		Integer[] listaDeNovasPosicoes = Aleatorio.getListaDeNumerosAleatorios(palavra.length()).toArray(new Integer[0]);
		for(int i=0; i<palavra.length(); i++) {
			letrasEmbaralhadas[i] = letrasNaOrdem[listaDeNovasPosicoes[i]];
		}
		return String.valueOf(letrasEmbaralhadas);
	}

	@Override
	public String getDica() {
		return null;
	}

}
