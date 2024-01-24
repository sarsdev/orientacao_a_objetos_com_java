package tela;

public class TelaDoJogo implements Tela {
	
	private final int _TAMANHO_MAX_NRO_RODADA = 7;
	private final int _TAMANHO_MAX_PALAVRA_CIFRADA = 34;
	private int nroDaRodada;
	private String palavraEmbaralhada;
	private String dica;
	
	public void setNroDaRodada(int nroDaRodada) {
		this.nroDaRodada = nroDaRodada;
	}
	
	public void setPalavraEmbaralhada(String palavraEmbaralhada) {
		this.palavraEmbaralhada = palavraEmbaralhada;
	}
	
	public void setDica(String dica) {
		this.dica = dica;
	}

	@Override
	public String desenhar() {
		String textoRodada = this.completarComCaractereADireita(String.valueOf(this.nroDaRodada), ' ', this._TAMANHO_MAX_NRO_RODADA);
		String textoPalavraCifrada = this.completarComCaractereADireita(this.palavraEmbaralhada, ' ', this._TAMANHO_MAX_PALAVRA_CIFRADA);
		String textoDica = this.completarComCaractereADireita(this.dica, ' ', this._TAMANHO_MAX_PALAVRA_CIFRADA);
		return "========================================\n"
			 + "||      Embaralhados - Rodada "+ textoRodada +" ||\n"
			 + "========================================\n"
			 + "|| Decifre a palavra:                 ||\n"
			 + "|| "+ textoPalavraCifrada +" ||\n"
			 + "|| "+ textoDica +" ||\n"
			 + "========================================\n"
			 + "Digite qual é a palavra (ou Enter para desistir):";
	}

	@Override
	public <T> T escolherOpcao(String respostaConsole) throws Exception {
		throw new Exception("A tela do jogo não tem menu!");
	}
	
	private String completarComCaractereADireita(String palavraOriginal, char caractere, int tamanhoFinal) {
		String palavraRecebida = palavraOriginal == null ? " " : palavraOriginal;
		return palavraRecebida + String.valueOf(caractere).repeat(tamanhoFinal - palavraRecebida.length());
	}

}
