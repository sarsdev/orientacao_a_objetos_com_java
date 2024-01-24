package auxiliar;

public enum Temas {
	
	DIA_A_DIA(1), FRUTAS(2), PAISES(3);

	private final int _valor;
	
	Temas(int valor) {
		this._valor = valor;
	}

	public int getValor() {
		return _valor;
	}
}
