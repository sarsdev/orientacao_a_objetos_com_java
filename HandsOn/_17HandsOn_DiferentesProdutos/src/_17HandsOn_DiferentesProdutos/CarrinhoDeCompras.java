package _17HandsOn_DiferentesProdutos;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CarrinhoDeCompras {
	
	private Map<Produto, Integer> listaDeProdutos;

	public CarrinhoDeCompras() {
		listaDeProdutos = new HashMap<>();
	}
	
	public void adicionarProduto(Produto produto, int quantidade) {
		int quantidadeAtual = this.getQuantidadeProdutoCarrinho(produto);
		this.listaDeProdutos.put(produto, quantidade + quantidadeAtual);
	}
	
	public void removerProduto(Produto produto, int quantidade) {
		int quantidadeAtual = this.getQuantidadeProdutoCarrinho(produto);
		this.listaDeProdutos.put(produto, quantidadeAtual - quantidade);
	}
	
	public int getQuantidadeProdutoCarrinho(Produto produto) {
		Integer quantidadeProduto = this.listaDeProdutos.get(produto);
		return quantidadeProduto == null ? 0 : quantidadeProduto.intValue();
	}

	public double calculaValorTotal() {
		double valorTotal = 0.0;
		for(Entry<Produto, Integer> produto : listaDeProdutos.entrySet()) {
			valorTotal += produto.getKey().preco * produto.getValue();
		}
		return valorTotal;
	}
	
}
