package _17HandsOn_DiferentesProdutos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteProduto {
	
	private Produto produto;
	
	@BeforeEach
	void antesDeCadaTeste() {
		produto = new Produto(100);
	}
	
	@Test
	void testeProdutoComCodigoNovo() {
		assertEquals(100, produto.codigo);
	}
	
	@Test
	void testeSetNomeValido() {
		try {
			produto.setNome("Molho de tomate");
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	void testeSetNomeInvalido() {
		assertThrows(
				Exception.class,
				() -> { produto.setNome(null); },
				"Nome do produto inválido. Deve ser informado algum nome!"
		);
	}
	
	@Test
	void testeSetPrecoValido() {
		try {
			produto.setPreco(15.90);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	void testeSetPrecoInvalido() {
		assertThrows(
				Exception.class,
				() -> { produto.setPreco(-1.0); },
				"Preço do produto inválido. Deve ser informado um valor maior do que zero!"
		);
	}

	@Test
	void testeProdutosCodigosIguais() {
		Produto produto2 = new Produto(100);
		assertEquals(produto.hashCode(), produto2.hashCode());
	}
	
	@Test
	void testeProdutosCodigosDiferentes() {
		Produto produto2 = new Produto(200);
		assertEquals(false, produto.hashCode() == produto2.hashCode());
	}
	
	@Test
	void testeEqualsObjetosIguais() {
		Produto produto2 = new Produto(100);
		assertEquals(true, produto.equals(produto2));
	}
	
	@Test
	void testeEqualsObjetosDiferentes() {
		Produto produto2 = new Produto(200);
		assertEquals(false, produto.equals(produto2));
	}
	
	@Test
	void testeHashCodeProduto100() {
		assertEquals(131, produto.hashCode());
	}
	
	@Test
	void testeHashCodeProduto200() {
		Produto produto2 = new Produto(200);
		assertEquals(231, produto2.hashCode());
	}

}
