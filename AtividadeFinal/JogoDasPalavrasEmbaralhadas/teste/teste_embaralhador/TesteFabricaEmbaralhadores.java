package teste_embaralhador;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import auxiliar.Embaralhadores;
import embaralhador.EmbaralhadorCifraDeCesar;
import embaralhador.EmbaralhadorRandomico;
import embaralhador.FabricaEmbaralhadores;

class TesteFabricaEmbaralhadores {
	
	private static FabricaEmbaralhadores _fabrica;
	
	@BeforeAll
	static void altesDeTodosOsTeste() {
		_fabrica = new FabricaEmbaralhadores();
	}

	@Test
	void testeEmbaralhadorAleatorio() throws Exception {		
		var embaralhadorSelecionado = _fabrica.getEmbaralhadorAleatorio().getClass();
		if(!(embaralhadorSelecionado.isNestmateOf(EmbaralhadorRandomico.class) || embaralhadorSelecionado.isNestmateOf(EmbaralhadorCifraDeCesar.class))) {
			fail("O embaralhador não é válido. Error: " + embaralhadorSelecionado);
		}		
	}
	
	@Test
	void testeEmbaralhadorRandomico() throws Exception {
		assertInstanceOf(EmbaralhadorRandomico.class, _fabrica.getEmbaralhador(Embaralhadores.RANDOMICO));
	}
	
	@Test
	void testeEmbaralhadorCifraDeCesar() throws Exception {
		assertInstanceOf(EmbaralhadorCifraDeCesar.class, _fabrica.getEmbaralhador(Embaralhadores.CIFRA_DE_CESAR));
	}

}
