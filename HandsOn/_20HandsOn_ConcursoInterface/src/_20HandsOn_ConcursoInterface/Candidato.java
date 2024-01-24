package _20HandsOn_ConcursoInterface;

public class Candidato implements Comparable<Candidato> {
	
	private int nota;
	private boolean deficiente;
	private int idade;
	
	public Candidato(int nota, boolean deficiente, int idade) {
		super();
		this.nota = nota;
		this.deficiente = deficiente;
		this.idade = idade;
	}

	public int getNota() {
		return nota;
	}

	public boolean isDeficiente() {
		return deficiente;
	}

	public int getIdade() {
		return idade;
	}

	@Override
	public int compareTo(Candidato outro) {
		if(this.nota == outro.nota) {
			if(this.deficiente == outro.isDeficiente()) {
				return outro.getIdade() - this.idade;
			} else {
				if(this.deficiente) {
					return -1;					
				} else {
					return 1;	
				}
			}
		} else {
			return outro.getNota() - this.nota;
		}
	}
	
	@Override
	public String toString() {
		return this.nota +";"+ this.deficiente +";"+ this.idade;
	}

}
