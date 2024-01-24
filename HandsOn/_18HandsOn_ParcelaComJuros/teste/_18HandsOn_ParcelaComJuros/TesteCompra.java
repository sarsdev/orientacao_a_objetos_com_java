package _18HandsOn_ParcelaComJuros;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCompra {

	@Test
	void testeValorTotalMaiorQueZero() {
		try {
			Compra compra = new Compra(150.0);
			assertEquals(150.0, compra.total());
		} catch(Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	void testeValorTotalZero() {
		assertThrows(
				Exception.class,
				() -> new Compra(0.0),
				"O valor da compra não pode ser zero ou um valor negativo!"
		);
	}
	
	@Test
	void testeValorTotalMenorQueZero() {
		assertThrows(
				Exception.class,
				() -> new Compra(-500.0),
				"O valor da compra não pode ser zero ou um valor negativo!"
		);
	}

}
