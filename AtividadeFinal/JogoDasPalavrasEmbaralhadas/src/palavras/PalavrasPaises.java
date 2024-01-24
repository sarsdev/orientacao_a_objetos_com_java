package palavras;

import java.io.IOException;

import auxiliar.LeitoDeArquivo;

public class PalavrasPaises implements BancoDePalavra {

	private String diretorioDoArquivo = "paises.txt";

	@Override
	public String[] getListaDePalavras() throws IOException {
		String conteudoDoArquivo = LeitoDeArquivo.getTodoConteudoDoArquivo(this.diretorioDoArquivo);
		return LeitoDeArquivo.getQuebraPorDelimitador(conteudoDoArquivo, ",");
	}

}