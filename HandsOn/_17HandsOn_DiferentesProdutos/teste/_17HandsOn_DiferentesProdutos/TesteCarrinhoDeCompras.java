package _17HandsOn_DiferentesProdutos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteCarrinhoDeCompras {
	
	CarrinhoDeCompras carrinho;
	Produto produto;
	
	@BeforeEach
	void antesDeCadaTeste() {
		carrinho = new CarrinhoDeCompras();
		produto = new Produto(150);
	}

	@Test
	void testeAdicionaProduto() {
		carrinho.adicionarProduto(produto, 2);
		assertEquals(2, carrinho.getQuantidadeProdutoCarrinho(produto));
	}
	
	@Test
	void testeAdicionaDoisProdutosIguais() {
		carrinho.adicionarProduto(produto, 2);
		carrinho.adicionarProduto(produto, 8);
		assertEquals(10, carrinho.getQuantidadeProdutoCarrinho(produto));
	}
	
	@Test
	void testeAdicionaDoisProdutosDiferentes() {
		Produto produto2 = new Produto(250);
		carrinho.adicionarProduto(produto, 4);
		carrinho.adicionarProduto(produto2, 5);
		assertEquals(4, carrinho.getQuantidadeProdutoCarrinho(produto));
		assertEquals(5, carrinho.getQuantidadeProdutoCarrinho(produto2));
	}
	
	@Test
	void testeAdicionaProdutoComTamanho() {
		ProdutoComTamanho produto = new ProdutoComTamanho(150);
		produto.setTamanho("M");
		carrinho.adicionarProduto(produto, 6);
		assertEquals(6, carrinho.getQuantidadeProdutoCarrinho(produto));
	}
	
	@Test
	void testeAdicionaDoisProdutoComTamanhoIguais() {
		ProdutoComTamanho produto = new ProdutoComTamanho(150);
		produto.setTamanho("M");
		carrinho.adicionarProduto(produto, 6);
		carrinho.adicionarProduto(produto, 9);
		assertEquals(15, carrinho.getQuantidadeProdutoCarrinho(produto));
	}
	
	@Test
	void testeAdicionaDoisProdutoComTamanhoDiferentes() {
		ProdutoComTamanho produto = new ProdutoComTamanho(150);
		produto.setTamanho("M");
		ProdutoComTamanho produto2 = new ProdutoComTamanho(150);
		produto2.setTamanho("P");
		carrinho.adicionarProduto(produto, 3);
		carrinho.adicionarProduto(produto2, 6);
		assertEquals(3, carrinho.getQuantidadeProdutoCarrinho(produto));
		assertEquals(6, carrinho.getQuantidadeProdutoCarrinho(produto2));
	}
	
	@Test
	void testeValorTotalCarrinho() {
		try {
			produto.setPreco(5.0);
			ProdutoComTamanho produto2 = new ProdutoComTamanho(150);
			produto2.setTamanho("M");
			produto2.setPreco(15.0);
			ProdutoComTamanho produto3 = new ProdutoComTamanho(150);
			produto3.setTamanho("P");
			produto3.setPreco(25.0);
			carrinho.adicionarProduto(produto, 3);
			carrinho.adicionarProduto(produto2, 6);
			carrinho.adicionarProduto(produto3, 10);
			assertEquals(355.0, carrinho.calculaValorTotal());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

}
