package palavras;

import auxiliar.Aleatorio;
import auxiliar.Temas;

public class BancoDePalavras {
	
	private String[] listaDePalavras;
	
	public BancoDePalavras(Temas tema) throws Exception {
		FabricaDePalavras fabrica = new FabricaDePalavras();
		this.listaDePalavras = fabrica.getListaDePalavrasDoTema(tema).getListaDePalavras();
	}

	public String getPalavraAleatoria() {
		return this.listaDePalavras[Aleatorio.getNumeroAleatorioBaseZero(this.listaDePalavras.length)];
	}

}