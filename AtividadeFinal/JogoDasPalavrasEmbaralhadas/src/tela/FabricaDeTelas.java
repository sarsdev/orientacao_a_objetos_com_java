package tela;

import auxiliar.Telas;

public class FabricaDeTelas {

	public Tela getTela(Telas tela) throws Exception {
		switch(tela) {
			case APRESENTACAO: return (Tela) new TelaDeAprensentacao();
			case MENU_TEMA: return new TelaMenuTema();
			case MENU_MODO: return new TelaMenuModo();
			case MENU_NIVEL: return  new TelaMenuNivel();
			case JOGO: return this.getTelaDoJogo();
			case DESPEDIDA: return new TelaDeDespedida();
			default: throw new Exception("Erro interno: A tela informado não existe! - Valor informador: " + tela.name());
		}
	}
	
	public TelaDoJogo getTelaDoJogo() {
		return new TelaDoJogo();
	}
	
}
