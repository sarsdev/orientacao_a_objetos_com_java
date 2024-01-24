package auxiliar;

public enum Telas {
	
	APRESENTACAO(1), MENU_TEMA(2), MENU_MODO(3), MENU_NIVEL(4), JOGO(5), DESPEDIDA(6);

	private final int _valor;
	
	Telas(int valor) {
		this._valor = valor;
	}

	public int getValor() {
		return _valor;
	}
}
