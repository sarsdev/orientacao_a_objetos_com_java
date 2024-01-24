package jogo;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import auxiliar.Embaralhadores;
import auxiliar.Modos;
import auxiliar.Rodada;
import auxiliar.Telas;
import auxiliar.Temas;
import mecanica.FabricaMecanicaDoJogo;
import mecanica.MecanicaDoJogo;
import tela.TelaDoJogo;
import tela.FabricaDeTelas;
import tela.Tela;

public class Principal {
	
	private record Menu(Temas temaDoJogo, Modos modoDoJogo, Embaralhadores nivelDoJogo){}
	private static final int _QUANT_QUEBRAS_DE_LINHA_NOVA_TELA = 10;
	private static final int _TEMPO_TRANSICAO_APRESENTACAO = 5;
	private static final int _TEMPO_TRANSICAO_DURANTE_JOGO = 3;
	private static Scanner _console = new Scanner(System.in);
	private static Menu _menu;
	
	public static void main(String[] args) throws Exception {
		telaDeApresentacao();
		menuPrincipal();
		
		FabricaMecanicaDoJogo fabrMecanicas = new FabricaMecanicaDoJogo();
		var modoDoJogo = fabrMecanicas.getMecanicaDoJogo(_menu.modoDoJogo, _menu.temaDoJogo, _menu.nivelDoJogo);
		
		do {
			var dadosDaRodada = modoDoJogo.getDadosNovaRodada();
			telaDoJogo(dadosDaRodada);
			
			String resposta = getLinhaConsole();
			if(modoDoJogo.jogadorDesistiu(resposta)) {
				escreveLinhaConsole("### A palavra era: " + dadosDaRodada.palavraSelecionada());
			} else {
				if(modoDoJogo.jogadorAcertou(dadosDaRodada.palavraSelecionada(), resposta)) {
					escreveLinhaConsole("### ACERTOU!!!");
				} else {
					escreveLinhaConsole("### :( ERROU!... A palavra era: " + dadosDaRodada.palavraSelecionada());
				}
			}
			transicaoDeTela(_TEMPO_TRANSICAO_DURANTE_JOGO);					
		} while(!modoDoJogo.jogoTerminou());

		telaDeDespedida(modoDoJogo);
	}
	
	private static void telaDeApresentacao() throws Exception {
		escreveLinhaConsole(new FabricaDeTelas().getTela(Telas.APRESENTACAO).desenhar());
		transicaoDeTela(_TEMPO_TRANSICAO_APRESENTACAO);
	}
	
	private static void telaDeDespedida(MecanicaDoJogo modo) throws Exception {
		escreveLinhaConsole(new FabricaDeTelas().getTela(Telas.DESPEDIDA).desenhar());
		escreveLinhaConsole(modo.mensagemDoResultado());
	}
	
	private static void menuPrincipal() throws Exception {
		Tela menuTema = new FabricaDeTelas().getTela(Telas.MENU_TEMA);
		escreveLinhaConsole(menuTema.desenhar());
		Temas temaDoJogo = menuTema.escolherOpcao(getLinhaConsole());
		transicaoDeTela();
		
		Tela menuModo = new FabricaDeTelas().getTela(Telas.MENU_MODO);
		escreveLinhaConsole(menuModo.desenhar());
		Modos modoDoJogo = menuModo.escolherOpcao(getLinhaConsole());
		transicaoDeTela();
		
		Tela menuNivel = new FabricaDeTelas().getTela(Telas.MENU_NIVEL);
		escreveLinhaConsole(menuNivel.desenhar());
		Embaralhadores nivelDoJogo = menuNivel.escolherOpcao(getLinhaConsole());
		transicaoDeTela();
		
		_menu = new Menu(temaDoJogo, modoDoJogo, nivelDoJogo);
	}
	
	private static void telaDoJogo(Rodada rodada) throws Exception {		
		TelaDoJogo jogo = new FabricaDeTelas().getTelaDoJogo();
		jogo.setNroDaRodada(rodada.numero());
		jogo.setPalavraEmbaralhada(rodada.palavraCifrada());
		jogo.setDica(rodada.dica());
		escreveLinhaConsole(jogo.desenhar());
	}
	
	private static String getLinhaConsole() {
		return _console.nextLine();
	}
	
	private static void escreveLinhaConsole(String texto) {
		System.out.println(texto);
	}
	
	private static void escreveNaMesmaLinhaConsole(String texto) {
		System.out.print(texto);
	}
	
	private static void transicaoDeTela() {
		limparConsole();
	}
	
	private static void transicaoDeTela(int tempoEmSegundosDelay) throws Exception {
		escreveNaMesmaLinhaConsole("(transição em " + tempoEmSegundosDelay + " segundos): ");
		for(int i=0; i<tempoEmSegundosDelay; i++) {
			TimeUnit.SECONDS.sleep(1);
			escreveNaMesmaLinhaConsole("*");
		}
		transicaoDeTela();
	}
	
	private static void limparConsole() {
		for(int i=0; i<_QUANT_QUEBRAS_DE_LINHA_NOVA_TELA; i++) {
			escreveLinhaConsole("\n");
		}
	}
	
}