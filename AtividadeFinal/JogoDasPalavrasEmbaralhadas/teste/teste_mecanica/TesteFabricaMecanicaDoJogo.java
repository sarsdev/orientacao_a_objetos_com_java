package teste_mecanica;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import auxiliar.Embaralhadores;
import auxiliar.Modos;
import auxiliar.Temas;
import mecanica.FabricaMecanicaDoJogo;
import mecanica.MecanicaMelhorDeTres;
import mecanica.MecanicaMorteSubita;

class TesteFabricaMecanicaDoJogo {

private static FabricaMecanicaDoJogo _fabrica;
	
	@BeforeAll
	static void altesDeTodosOsTeste() {
		_fabrica = new FabricaMecanicaDoJogo();
	}
	
	@Test
	void testeMelhorDeTres() throws Exception {
		assertInstanceOf(MecanicaMelhorDeTres.class, _fabrica.getMecanicaDoJogo(Modos.MELHOR_DE_TRES, Temas.DIA_A_DIA, Embaralhadores.RANDOMICO));
	}
	
	@Test
	void testeMorteSubita() throws Exception {
		assertInstanceOf(MecanicaMorteSubita.class, _fabrica.getMecanicaDoJogo(Modos.MORTE_SUBITA, Temas.DIA_A_DIA, Embaralhadores.RANDOMICO));
	}
	
	@Test
	void testeExceptionModoNulo() {
		assertThrows(
				Exception.class,
				() -> { _fabrica.getMecanicaDoJogo(null, Temas.DIA_A_DIA, Embaralhadores.RANDOMICO); }
		);
	}

}
