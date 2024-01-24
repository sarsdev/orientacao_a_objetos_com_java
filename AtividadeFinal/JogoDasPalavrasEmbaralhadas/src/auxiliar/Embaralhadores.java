package auxiliar;

public enum Embaralhadores {
	
	RANDOMICO(1), CIFRA_DE_CESAR(2);

	private final int _valor;
	
	Embaralhadores(int valor) {
		this._valor = valor;
	}

	public int getValor() {
		return _valor;
	}
}
