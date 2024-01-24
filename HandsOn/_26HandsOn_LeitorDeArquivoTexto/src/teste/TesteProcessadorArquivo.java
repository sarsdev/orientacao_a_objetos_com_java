package teste;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import _26HandsOn_LeitorDeArquivoTexto.LeituraArquivoException;
import _26HandsOn_LeitorDeArquivoTexto.ProcessadorArquivo;

class TesteProcessadorArquivo {

	@Test
	void testeArquivoLidoComSucesso() throws LeituraArquivoException {
		Map<String, String> mapResultadoEsperado = new HashMap<String, String>();
		mapResultadoEsperado.put("nome", "Eduardo");
		mapResultadoEsperado.put("sobrenome", "Guerra");
		mapResultadoEsperado.put("idade", "35");
		
		assertEquals(mapResultadoEsperado, ProcessadorArquivo.processar("ArquivoParaTeste.txt"));
	}
	
	@Test
	void testeFalhaAoAbrirOArquivo() {
		assertThrows(
				LeituraArquivoException.class,
				() -> { ProcessadorArquivo.processar("ArquivoParaTest.txt"); },
				"Erro ao abrir o ArquivoParaTest.txt (O sistema não pode encontrar o arquivo especificado)"
		);
	}
	
	@Test
	void testeArquivoVazio() {
		assertThrows(
				LeituraArquivoException.class,
				() -> { ProcessadorArquivo.processar("ArquivoVazio.txt"); },
				"Arquivo vazio"
		);
	}
	
	@Test
	void testeFormatoInvalido() {
		assertThrows(
				LeituraArquivoException.class,
				() -> { ProcessadorArquivo.processar("ArquivoFormatoInvalido.txt"); },
				"Formato de arquivo inválido"
		);
	}

}
