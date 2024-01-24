package _17HandsOn_DiferentesProdutos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteProdutoComTamanho {

private ProdutoComTamanho produto;
	
	@BeforeEach
	void antesDeCadaTeste() {
		produto = new ProdutoComTamanho(1000);
		produto.setTamanho("XL");
	}
	
	@Test
	void testeProdutoComCodigoNovo() {
		assertEquals(1000, produto.codigo);
	}
	
	@Test
	void testeProdutoComTamanhoInformado() {
		assertEquals("XL", produto.getTamanho());
	}
	
	@Test
	void testeProdutosCodigosETamanhoIguais() {
		ProdutoComTamanho produto2 = new ProdutoComTamanho(1000);
		produto2.setTamanho("XL");
		assertEquals(produto.hashCode(), produto2.hashCode());
	}
	
	@Test
	void testeProdutosCodigosIguaisTamanhosDiferentes() {
		ProdutoComTamanho produto2 = new ProdutoComTamanho(1000);
		produto2.setTamanho("M");
		assertEquals(false, produto.hashCode() == produto2.hashCode());
	}
	
	@Test
	void testeEqualsObjetosIguais() {
		ProdutoComTamanho produto2 = new ProdutoComTamanho(1000);
		produto2.setTamanho("XL");
		assertEquals(true, produto.equals(produto2));
	}
	
	@Test
	void testeEqualsObjetosDiferentes() {
		ProdutoComTamanho produto2 = new ProdutoComTamanho(2000);
		produto2.setTamanho("M");
		assertEquals(false, produto.equals(produto2));
	}
	
	@Test
	void testeHashCodeProduto1000() {
		assertEquals(34765, produto.hashCode());
	}
	
	@Test
	void testeHashCodeProduto2000() {
		ProdutoComTamanho produto2 = new ProdutoComTamanho(2000);
		assertEquals(62961, produto2.hashCode());
	}

}
