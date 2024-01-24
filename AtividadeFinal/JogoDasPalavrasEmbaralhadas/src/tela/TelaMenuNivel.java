package tela;

import auxiliar.Embaralhadores;

public class TelaMenuNivel implements Tela {
	
	private Embaralhadores[] opcoes;
	
	public TelaMenuNivel() {
		opcoes = Embaralhadores.values();
	}

	@Override
	public String desenhar() {
		return "========================================\n"
			 + "||          Menu Embaralhados         ||\n"
			 + "========================================\n"
			 + "|| Escolha o nível do jogo            ||\n"
			 + "|| [1] Embaralhar letras              ||\n"
			 + "|| [2] Cifra de Cesar                 ||\n"
			 + "========================================\n"
			 + "Digite a opção:                         ";
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T escolherOpcao(String respostaConsole) throws Exception {
		return (T) this.opcoes[Integer.parseInt(respostaConsole)-1];
	}

}
