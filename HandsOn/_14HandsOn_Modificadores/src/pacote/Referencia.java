package pacote;

public class Referencia {

	int modificadorDefault;
	public int modificadorPublico;
	protected int modificadorProtegido;
	private int modificadorPrivado;
	
	public void testeDeAcessoPropriaClasse() {
		this.modificadorDefault = 0;
		this.modificadorPublico = 0;
		this.modificadorProtegido = 0;
		this.setModificadorPrivado(0);
	}

	public int getModificadorPrivado() {
		return modificadorPrivado;
	}

	public void setModificadorPrivado(int modificadorPrivado) {
		this.modificadorPrivado = modificadorPrivado;
	}
}
