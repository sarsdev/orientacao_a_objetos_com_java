package _17HandsOn_DiferentesProdutos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Produto {
	
	private static List<Integer> _listaDeCodigosUsados = new ArrayList<Integer>();

	protected int codigo;
	protected String nome;
	protected double preco;

	public Produto(int codigo) {
		this(codigo, "Nome não informado", 0.0);
	}

	public Produto(int codigo, String nome, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		adicionarCodigoUsado(codigo);
	}
	
	private static void adicionarCodigoUsado(int codigo) {
		if(!_listaDeCodigosUsados.contains(codigo)) {
			_listaDeCodigosUsados.add(codigo);
		}
	}
	
	public static List<Integer> getListaDeCodigosUsados() {
		return _listaDeCodigosUsados;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		if(nome.isBlank()) {
			throw new Exception("Nome do produto inválido. Deve ser informado algum nome!");
		}
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) throws Exception {
		if(preco <= 0.0) {
			throw new Exception("Preço do produto inválido. Deve ser informado um valor maior do que zero!");
		}
		this.preco = preco;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			Produto produto = (Produto) obj;
			return this.codigo == produto.codigo;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.codigo);
	}

}
