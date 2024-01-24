package mecanica;

import auxiliar.Embaralhadores;
import auxiliar.Rodada;
import auxiliar.Temas;
import embaralhador.Embaralhador;
import embaralhador.FabricaEmbaralhadores;
import palavras.BancoDePalavras;

public class MecanicaMorteSubita implements MecanicaDoJogo {
	
	private int nroDaRodada;
	private int nroDeAcertos;
	private boolean jogoTerminou;
	private Embaralhador embaralhador;
	private BancoDePalavras palavras;
	
	public MecanicaMorteSubita(Temas tema) throws Exception {
		this.inicializaAtributosEmComum(tema);
		this.embaralhador = new FabricaEmbaralhadores().getEmbaralhadorAleatorio();
	}
	
	public MecanicaMorteSubita(Temas tema, Embaralhadores embaralhador) throws Exception {
		this.inicializaAtributosEmComum(tema);
		this.embaralhador = new FabricaEmbaralhadores().getEmbaralhador(embaralhador);
	}
	
	private void inicializaAtributosEmComum(Temas tema) throws Exception {
		this.nroDaRodada = 0;
		this.nroDeAcertos = 0;
		this.jogoTerminou = false;
		this.palavras = new BancoDePalavras(tema);
	}

	@Override
	public boolean jogadorAcertou(String palavra, String resposta) {
		if(palavra.equalsIgnoreCase(resposta)) {
			this.nroDeAcertos++;
			return true;
		}
		this.jogoTerminou = true;
		return false;
	}

	@Override
	public boolean jogoTerminou() {
		return this.jogoTerminou;
	}

	@Override
	public boolean jogadorDesistiu(String resposta) {
		if(resposta.isBlank()) {
			this.jogoTerminou = true;
			return true;
		}
		return false;
	}

	@Override
	public String mensagemDoResultado() {
		String mensagem = ">>> FORAM "+ this.nroDeAcertos +" ACERTOS ::: PARABÉNS E SIGA MELHORANDO! <<<";
		return mensagem;
	}

	@Override
	public Rodada getDadosNovaRodada() {
		int nroRodadaAtual = ++this.nroDaRodada;
		String palavraEscolhida = this.palavras.getPalavraAleatoria();
		String palavraEmbaralhada = this.embaralhador.embaralharPalavra(palavraEscolhida);
		String dica = this.embaralhador.getDica();
		return new Rodada(nroRodadaAtual, palavraEscolhida, palavraEmbaralhada, dica);
	}

}
