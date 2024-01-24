package _21HandsOn_FormatadorNome;

public class Formatador implements FormatadorNome {
	
	private String complementoSaudacao;

	public Formatador() {
		this.complementoSaudacao = "";
	}
	
	public Formatador(boolean generoMasculino) {
		this.complementoSaudacao = generoMasculino ? "Sr." : "Sra.";
	}
	
	public Formatador(String titulo) {
		this.complementoSaudacao = titulo;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		if(this.complementoSaudacao == "") {
			return nome;
		} else {
			return this.complementoSaudacao + " " + nome + " " + sobrenome;
		}
	}

}
