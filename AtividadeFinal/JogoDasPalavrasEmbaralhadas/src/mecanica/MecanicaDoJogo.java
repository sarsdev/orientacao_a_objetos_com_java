package mecanica;

import auxiliar.Rodada;

public interface MecanicaDoJogo {

	public String mensagemDoResultado();
	public Rodada getDadosNovaRodada();
	public boolean jogadorDesistiu(String resposta);
	public boolean jogadorAcertou(String palavra, String resposta);
	public boolean jogoTerminou();

}
