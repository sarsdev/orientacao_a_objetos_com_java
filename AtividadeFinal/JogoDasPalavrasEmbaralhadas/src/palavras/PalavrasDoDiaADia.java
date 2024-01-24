package palavras;

public class PalavrasDoDiaADia implements BancoDePalavra {
	
	private String[] listaDePalavras = {
			"IGLU", "ILHA", "IDEAL", "IDADE", "JANELA",
			"JARDIM", "INVADIR", "JACARE", "JAPONES", "JORNAL",
			"MENINO", "MELAO", "MACARRAO", "LIBERDADE", "MARROM",
			"MEXERICA", "MOLEQUE", "MASCOTE", "JORNALEIRO", "IMPOSSIVEL"
	};

	@Override
	public String[] getListaDePalavras() {
		return this.listaDePalavras;
	}

}
