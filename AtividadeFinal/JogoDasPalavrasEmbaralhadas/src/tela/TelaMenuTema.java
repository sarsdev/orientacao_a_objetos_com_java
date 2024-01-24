package tela;

import auxiliar.Temas;

public class TelaMenuTema implements Tela {
	
	private Temas[] opcoes;
	
	public TelaMenuTema() {
		opcoes = Temas.values();
	}

	@Override
	public String desenhar() {
		return "========================================\n"
			 + "||          Menu Embaralhados         ||\n"
			 + "========================================\n"
			 + "|| Escolha o tema do jogo             ||\n"
			 + "|| [1] Palavras do dia a dia          ||\n"
			 + "|| [2] Frutas                         ||\n"
			 + "|| [3] Paises                         ||\n"
			 + "========================================\n"
			 + "Digite a opção:                        ";
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T escolherOpcao(String respostaConsole) throws Exception {
		return (T) this.opcoes[Integer.parseInt(respostaConsole)-1];
	}

}
