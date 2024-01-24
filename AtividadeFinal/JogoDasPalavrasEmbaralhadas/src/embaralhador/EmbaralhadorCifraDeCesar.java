package embaralhador;

import auxiliar.Aleatorio;

public class EmbaralhadorCifraDeCesar implements Embaralhador {
	
	private final char _LETRA_INVALIDA = '*';
	private final int _CODIGO_LETRA_A = 65;
	private final int _CODIGO_LETRA_Z = 90;
	private final int _DESLOCAMENTO_MININO = 1;
	private final int _DESLOCAMENTO_MAXIMO = 10;
	private int deslocamentoDaCifra;
	
	public EmbaralhadorCifraDeCesar() {
		this.deslocamentoDaCifra = Aleatorio.getNumeroAleatorio(this._DESLOCAMENTO_MININO, this._DESLOCAMENTO_MAXIMO);
	}

	@Override
	public String embaralharPalavra(String palavra) {
		int indice = 0;
		char[] palavraEmbaralhada = new char[palavra.length()];
		for(char letra : palavra.toCharArray()) {
			palavraEmbaralhada[indice] = this.getLetraCifrada((int)letra);
			indice++;
		}
		return String.valueOf(palavraEmbaralhada);
	}

	@Override
	public String getDica() {
		return "DICA: Deslocamento = " + this.deslocamentoDaCifra;
	}
	
	private char getLetraCifrada(int letra) {
		if(letra < this._CODIGO_LETRA_A && letra > this._CODIGO_LETRA_Z) {
			return this._LETRA_INVALIDA;			
		} else if(letra + this.deslocamentoDaCifra > this._CODIGO_LETRA_Z) {
			int posicoesExcedentes = (letra + this.deslocamentoDaCifra) - this._CODIGO_LETRA_Z;
			return (char)(this._CODIGO_LETRA_A + posicoesExcedentes);			
		} else {
			return (char)(letra + this.deslocamentoDaCifra);
		}
	}

}
