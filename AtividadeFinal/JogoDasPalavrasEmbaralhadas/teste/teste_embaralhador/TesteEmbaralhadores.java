package teste_embaralhador;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import embaralhador.Embaralhador;
import embaralhador.EmbaralhadorCifraDeCesar;
import embaralhador.EmbaralhadorRandomico;

class TesteEmbaralhadores {
	
	private static int _LETRA_A = 65;
	private static int _LETRA_Z = 90;
	private static Embaralhador _randomico;
	private static Embaralhador _cifraDeCesar;
	
	@BeforeAll
	static void antesDeTodosOsTeste() {
		_randomico = new EmbaralhadorRandomico();
		_cifraDeCesar = new EmbaralhadorCifraDeCesar();
	}

	@Test
	void testeRandomicoEmbaralharPalavra() {
		Map<String, Integer> mapLetrasPalavra = new HashMap<String, Integer>();
		Map<String, Integer> mapLetrasPalavraEmbaralhada = new HashMap<String, Integer>();
		String palavra = "ABACAXI";
		String palavraEmbaralhada = _randomico.embaralharPalavra(palavra);
		
		if(palavra.length() != palavraEmbaralhada.length()) {
			fail("A palavra embaralhada não deve ter um número diferente de letras em relação a palavra origem! ERRO: QtdLetrasEsperado: "+ palavra.length() +" - QtdLetrasEncontrada: "+ palavraEmbaralhada.length());			
		}
		
		var letrasPalavra = palavra.toCharArray();
		var letrasPalavraEmbaralhada = palavraEmbaralhada.toCharArray();
		for(int i=0; i<palavra.length(); i++) {
			mapLetrasPalavra.put(String.valueOf(letrasPalavra[i]), mapLetrasPalavra.getOrDefault(String.valueOf(letrasPalavra[i]), 0) + 1);
			mapLetrasPalavraEmbaralhada.put(String.valueOf(letrasPalavraEmbaralhada[i]), mapLetrasPalavraEmbaralhada.getOrDefault(String.valueOf(letrasPalavraEmbaralhada[i]), 0) + 1);
		}
		for(Entry<String, Integer> letra : mapLetrasPalavraEmbaralhada.entrySet()) {
			if(letra.getValue() != mapLetrasPalavra.getOrDefault(letra.getKey(), 0)) {
				fail("A palavra embaralhada não deve ter letras diferentes ou em quantidades diferentes em relação a palavra origem! ERRO: Letra e Qtd Esperado: "+ letra.getKey() +"/"+ mapLetrasPalavra.getOrDefault(letra.getKey(), 0) +" - Letra e Qtd Encontrado: "+ letra.getKey() +"/"+ letra.getValue());
			}
		}
	}
	
	@Test
	void testeRandomicoDica() {
		assertEquals(null, _randomico.getDica());
	}
	
	@Test
	void testeCifraDeCesarEmbaralharPalavra() {
		String palavra = "ABACAXI";
		String palavraEmbaralhada = _cifraDeCesar.embaralharPalavra(palavra);
		String dica = _cifraDeCesar.getDica();
		int deslocamento = Integer.valueOf(dica.split(" ")[3]);
		
		if(palavra.length() != palavraEmbaralhada.length()) {
			fail("A palavra embaralhada não deve ter um número diferente de letras em relação a palavra origem! ERRO: QtdLetrasEsperado: "+ palavra.length() +" - QtdLetrasEncontrada: "+ palavraEmbaralhada.length());			
		}
		
		int posicao = 0;
		for(char letra : palavra.toCharArray()) {
			int codigoDaLetra = (int)letra;
			int codigoDaLetraEmbaralhada = (int)palavraEmbaralhada.toCharArray()[posicao];
			if(codigoDaLetraEmbaralhada - deslocamento < _LETRA_A) {
				codigoDaLetraEmbaralhada = _LETRA_Z - (_LETRA_A - (codigoDaLetraEmbaralhada - deslocamento));
			} else {
				codigoDaLetraEmbaralhada = codigoDaLetraEmbaralhada - deslocamento;
			}
			if(codigoDaLetra != codigoDaLetraEmbaralhada) {
				fail("A palavra embaralhada tem letra com deslocamento incorreto! ERRO: Letra Esperada: "+ (char)codigoDaLetra +" - Letra Encontrada: "+ (char)codigoDaLetraEmbaralhada);
			}
			posicao++;
		}
	}
	
	@Test
	void testeCifraDeCesarDica() {
		String palavra = "ABACAXI";
		String palavraEmbaralhada = _cifraDeCesar.embaralharPalavra(palavra);
		String dica = _cifraDeCesar.getDica();
		int deslocamento = Integer.valueOf(dica.split(" ")[3]);
		int codigoDaLetra = (int)palavra.toCharArray()[0];
		int codigoDaLetraEmbaralhada = (int)palavraEmbaralhada.toCharArray()[0];
		if(codigoDaLetraEmbaralhada - deslocamento < _LETRA_A) {
			codigoDaLetraEmbaralhada = _LETRA_Z - (_LETRA_A - (codigoDaLetraEmbaralhada - deslocamento));
		} else {
			codigoDaLetraEmbaralhada = codigoDaLetraEmbaralhada - deslocamento;
		}
		if(codigoDaLetra != codigoDaLetraEmbaralhada) {
			fail("A dica está com deslocamento incorreto!");
		}
	}

}
