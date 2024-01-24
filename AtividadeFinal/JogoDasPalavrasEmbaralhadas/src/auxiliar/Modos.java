package auxiliar;

public enum Modos {
	
	MELHOR_DE_TRES(1), MORTE_SUBITA(2);

	private final int _valor;
	
	Modos(int valor) {
		this._valor = valor;
	}

	public int getValor() {
		return _valor;
	}
}
