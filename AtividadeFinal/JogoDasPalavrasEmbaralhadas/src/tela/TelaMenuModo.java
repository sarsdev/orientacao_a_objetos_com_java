package tela;

import auxiliar.Modos;

public class TelaMenuModo implements Tela {
	
	private Modos[] opcoes;
	
	public TelaMenuModo() {
		opcoes = Modos.values();
	}

	@Override
	public String desenhar() {
		return "========================================\n"
			 + "||          Menu Embaralhados         ||\n"
			 + "========================================\n"
			 + "|| Escolha o modo do jogo             ||\n"
			 + "|| [1] Melhor de três                 ||\n"
			 + "|| [2] Morte subita                   ||\n"
			 + "========================================\n"
			 + "Digite a opção:                         ";
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T escolherOpcao(String respostaConsole) throws Exception {
		return (T) this.opcoes[Integer.parseInt(respostaConsole)-1];
	}

}
