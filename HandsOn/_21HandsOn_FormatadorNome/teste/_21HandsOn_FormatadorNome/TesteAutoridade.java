package _21HandsOn_FormatadorNome;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteAutoridade {

	@Test
	void testeTratamentoInformal() {
		Autoridade autoridade = new Autoridade("João", "Cardoso");
		assertEquals("João", autoridade.getTratamento());
	}
	
	@Test
	void testeTratamentoRespeitoso() {
		Autoridade autoridade = new Autoridade("Maria", "Regina", false);
		assertEquals("Sra. Maria Regina", autoridade.getTratamento());
	}
	
	@Test
	void testeTratamentoComTitulo() {
		Autoridade autoridade = new Autoridade("Ricardo", "Bartolomeu", "Excelentíssimo");
		assertEquals("Excelentíssimo Ricardo Bartolomeu", autoridade.getTratamento());
	}

}
