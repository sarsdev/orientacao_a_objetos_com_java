package _18HandsOn_ParcelaComJuros;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TesteCompraParcelada extends TesteCompra{
	
	@Test
	void testeQuantidadeParcelasInvalido() {
		assertThrows(
				Exception.class,
				() -> new CompraParcelada(500.0, 0, 1.0),
				"A quantidade de parcelas não pode ser zero ou um valor negativo!"
		);
	}
	
	@Test
	void testeJurosInvalido() {
		assertThrows(
				Exception.class,
				() -> new CompraParcelada(500.0, 1, -9.0),
				"O valor do juros não pode ser zero ou um valor negativo!"
		);
	}

	@Test
	void testeUmaParcela() {
		try {
			CompraParcelada compra = new CompraParcelada(500.0, 1, 0.99);
			assertEquals(504.95, compra.total());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	void testeDuasParcelas() {
		try {
			CompraParcelada compra = new CompraParcelada(500.0, 2, 0.99);
			assertEquals(509.95, compra.total());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	void testeCincoParcelas() {
		try {
			CompraParcelada compra = new CompraParcelada(500.0, 5, 0.99);
			assertEquals(525.24, compra.total());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	void testeDezParcela() {
		try {
			CompraParcelada compra = new CompraParcelada(500.0, 10, 0.99);
			assertEquals(551.76, compra.total());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

}
