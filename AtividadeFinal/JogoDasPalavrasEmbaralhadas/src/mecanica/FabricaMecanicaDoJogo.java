package mecanica;

import auxiliar.Embaralhadores;
import auxiliar.Modos;
import auxiliar.Temas;

public class FabricaMecanicaDoJogo {
	
	public MecanicaDoJogo getMecanicaDoJogo(Modos modoDoJogo, Temas temaDoJogo, Embaralhadores nivelDoJogo) throws Exception {
		switch(modoDoJogo) {
			case MELHOR_DE_TRES: return new MecanicaMelhorDeTres(temaDoJogo, nivelDoJogo);
			case MORTE_SUBITA: return new MecanicaMorteSubita(temaDoJogo, nivelDoJogo);
			default: throw new Exception("Erro interno: O modo informado não existe! - Valor informador: " + modoDoJogo.name());
		}
	}
	
}