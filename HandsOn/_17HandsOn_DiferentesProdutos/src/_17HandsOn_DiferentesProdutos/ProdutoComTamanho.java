package _17HandsOn_DiferentesProdutos;

import java.util.Objects;

public class ProdutoComTamanho extends Produto {

	private String tamanho;
	
	public ProdutoComTamanho(int codigo) {
		super(codigo);
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			ProdutoComTamanho prodComTamanho = (ProdutoComTamanho) obj;
			return this.codigo == prodComTamanho.codigo &&
				   this.tamanho == prodComTamanho.tamanho;
		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.codigo, this.tamanho);
	}

}
