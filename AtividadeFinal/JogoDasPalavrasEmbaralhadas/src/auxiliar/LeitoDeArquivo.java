package auxiliar;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class LeitoDeArquivo {
	
	public static String getTodoConteudoDoArquivo(String diretorioCompletoDoArquivo) throws IOException {
		return Files.readString(Path.of(diretorioCompletoDoArquivo), StandardCharsets.UTF_8);
	}
	
	public static String[] getQuebraPorDelimitador(String conteudoDoArquivo, String delimitador) {
		return conteudoDoArquivo.split(delimitador);
	}

}
