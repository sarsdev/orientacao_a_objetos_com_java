package tela;

public class TelaDeDespedida implements Tela {

	@Override
	public String desenhar() {
		return "========================================\n"
			 + "||            Embaralhados            ||\n"
			 + "========================================\n"
			 + "||                                    ||\n"
			 + "||         Obrigado por jogar!        ||\n"
			 + "||                                    ||\n"
			 + "========================================";
	}

	@Override
	public <T> T escolherOpcao(String respostaConsole) throws Exception {
		throw new Exception("A tela de despedida não tem menu!");
	}

}
