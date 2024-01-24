package palavras;

import auxiliar.Temas;

public class FabricaDePalavras {
	
	public BancoDePalavra getListaDePalavrasDoTema(Temas tema) throws Exception {
		switch(tema) {
			case DIA_A_DIA: return new PalavrasDoDiaADia();
			case FRUTAS: return new PalavrasFrutas();
			case PAISES: return new PalavrasPaises();
			default: throw new Exception("Erro interno: O tema informado não existe! - Valor informador: " + tema.name());
		}
	}

}
