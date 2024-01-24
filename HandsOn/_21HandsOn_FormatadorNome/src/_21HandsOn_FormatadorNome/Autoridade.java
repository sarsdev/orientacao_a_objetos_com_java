package _21HandsOn_FormatadorNome;

public class Autoridade {
	
	private String nome;
	private String sobrenome;
	private FormatadorNome formatador;

	public Autoridade(String nome, String sobrenome) {
		this.inicializaAtributosEmComum(nome, sobrenome);
		this.formatador = new Formatador();
	}
	
	public Autoridade(String nome, String sobrenome, boolean generoMasculino) {
		this.inicializaAtributosEmComum(nome, sobrenome);
		this.formatador = new Formatador(generoMasculino);
	}
	
	public Autoridade(String nome, String sobrenome, String tituloDaAutoridade) {
		this.inicializaAtributosEmComum(nome, sobrenome);
		this.formatador = new Formatador(tituloDaAutoridade);
	}
	
	public String getTratamento() {
		return this.formatador.formatarNome(this.nome, this.sobrenome);
	}
	
	private void inicializaAtributosEmComum(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

}
