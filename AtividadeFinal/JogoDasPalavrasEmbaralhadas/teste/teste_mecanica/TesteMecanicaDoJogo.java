package teste_mecanica;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import auxiliar.Embaralhadores;
import auxiliar.Temas;
import mecanica.MecanicaDoJogo;
import mecanica.MecanicaMelhorDeTres;
import mecanica.MecanicaMorteSubita;

class TesteMecanicaDoJogo {

	@Test
	void testeMelhorDeTresJogadorAcertou() throws Exception {
		MecanicaDoJogo melhorDeTres = new MecanicaMelhorDeTres(Temas.DIA_A_DIA, Embaralhadores.RANDOMICO);
		assertEquals(true, melhorDeTres.jogadorAcertou("ABACAXI", "ABACAXI"));
		assertEquals(false, melhorDeTres.jogadorAcertou("ABACAXI", "ABACATE"));
	}
	
	@Test
	void testeMelhorDeTresJogoTerminou() throws Exception {
		MecanicaDoJogo melhorDeTres = new MecanicaMelhorDeTres(Temas.DIA_A_DIA, Embaralhadores.RANDOMICO);
		melhorDeTres.getDadosNovaRodada();
		melhorDeTres.jogadorAcertou("ABACAXI", "ABACAXI");
		melhorDeTres.getDadosNovaRodada();
		melhorDeTres.jogadorAcertou("ABACAXI", "ABACAXI");
		melhorDeTres.getDadosNovaRodada();
		melhorDeTres.jogadorAcertou("ABACAXI", "ABACAXI");
		assertEquals(true, melhorDeTres.jogoTerminou());
	}
	
	@Test
	void testeMelhorDeTresJogadorDesistiu() throws Exception {
		MecanicaDoJogo melhorDeTres = new MecanicaMelhorDeTres(Temas.DIA_A_DIA, Embaralhadores.RANDOMICO);
		assertEquals(true, melhorDeTres.jogadorDesistiu(""));
	}
	
	@Test
	void testeMorteSubitaJogadorAcertou() throws Exception {
		MecanicaDoJogo morteSubita = new MecanicaMorteSubita(Temas.DIA_A_DIA, Embaralhadores.RANDOMICO);
		assertEquals(true, morteSubita.jogadorAcertou("ABACAXI", "ABACAXI"));
		assertEquals(false, morteSubita.jogadorAcertou("ABACAXI", "ABACATE"));
	}
	
	@Test
	void testeMorteSubitaJogoTerminou() throws Exception {
		MecanicaDoJogo morteSubita = new MecanicaMorteSubita(Temas.DIA_A_DIA, Embaralhadores.RANDOMICO);
		morteSubita.jogadorAcertou("ABACAXI", "ABACATE");
		assertEquals(true, morteSubita.jogoTerminou());
	}
	
	@Test
	void testeMorteSubitaJogadorDesistiu() throws Exception {
		MecanicaDoJogo morteSubita = new MecanicaMorteSubita(Temas.DIA_A_DIA, Embaralhadores.RANDOMICO);
		assertEquals(true, morteSubita.jogadorDesistiu(""));
	}

}
