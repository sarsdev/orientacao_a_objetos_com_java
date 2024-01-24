package _07HandsOn_Escola;

public class Principal {

	public static void main(String[] args) {
		Aluno guerra = new Aluno();
		guerra.bimestre1 = 70;
		guerra.bimestre2 = 60;
		guerra.bimestre3 = 80;
		guerra.bimestre4 = 70;
		
		/* Executando com a classe auxiliar - EVITAR ISSO */
		System.out.println(VerificadoraDeNotas.mediaAluno(guerra));
		System.out.println(VerificadoraDeNotas.passouDeAno(guerra));
		
		/* Executando com a classe adequada Aluno - FAÇA ISSO */
		System.out.println(guerra.media());
		System.out.println(guerra.passouDeAno());
	}

}
