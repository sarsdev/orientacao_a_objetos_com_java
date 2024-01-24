package tela;

public class TelaDeAprensentacao implements Tela {

	@Override
	public String desenhar() {
		return "========================================\n"
			 + "||     Bem vindo ao Embaralhados!     ||\n"
			 + "========================================\n"
			 + "||  Escolha o tema do jogo e o modo   ||\n"
			 + "|| depois divirta-se com esse desafio ||\n"
			 + "========================================";
	}

	@Override
	public <T> T escolherOpcao(String respostaConsole) throws Exception {
		throw new Exception("A tela de apresentação não tem menu!");
	}

}
