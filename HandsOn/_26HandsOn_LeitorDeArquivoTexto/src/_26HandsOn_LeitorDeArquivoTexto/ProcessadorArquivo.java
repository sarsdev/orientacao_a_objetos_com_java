package _26HandsOn_LeitorDeArquivoTexto;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessadorArquivo {
	
	public static Map<String, String> processar(String nomeDoArquivo) throws LeituraArquivoException {
		File file;
		Scanner scanner = null;
		Map<String, String> mapDadosDoArquivo;
		
		try {
			mapDadosDoArquivo = new HashMap<String, String>();
			file = new File(nomeDoArquivo);
			scanner = new Scanner(file);
			
			if(!scanner.hasNextLine()) {
				throw new LeituraArquivoException("Arquivo vazio");
			}
			while (scanner.hasNextLine()){
				String linha = scanner.nextLine();
				var dadosDaLinha = linha.split("->");
				
				if(dadosDaLinha.length != 2) {
					throw new LeituraArquivoException("Formato de arquivo inválido");
				}
				
				mapDadosDoArquivo.put(dadosDaLinha[0], dadosDaLinha[1]);
			}
			
			scanner.close();			
			return mapDadosDoArquivo;
		} catch(IOException error) {
			throw new LeituraArquivoException("Erro ao abrir o arquivo" + error.getMessage());
		} finally {
			if(scanner != null) {				
				scanner.close();
			}
		}
	}

}
