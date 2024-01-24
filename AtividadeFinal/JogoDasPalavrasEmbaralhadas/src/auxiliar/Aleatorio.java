package auxiliar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aleatorio {
	
	private static Random _random = new Random();
	
	public static int getNumeroAleatorioBaseZero(int numeroFinal) {		
		return _random.nextInt(numeroFinal);
	}

	public static int getNumeroAleatorio(int numeroInicial, int numeroFinal) {		
		return _random.nextInt(numeroInicial, numeroFinal);
	}
	
	public static List<Integer> getListaDeNumerosAleatorios(int numeroFinal) {
		List<Integer> numerosAleatorios = new ArrayList<>();		
		for(int i=0; i<numeroFinal; i++) {
			boolean numeroNovo = false;
			while(!numeroNovo) {
				int numeroAleatorio = _random.nextInt(numeroFinal);
				if(!numerosAleatorios.contains(numeroAleatorio)) {
					numeroNovo = true;
					numerosAleatorios.add(numeroAleatorio);
				}
			}			
		}
		return numerosAleatorios;
	}
	
}
