package _07HandsOn_Escola;

/* Classe criada para auxiliar na verificação das notas
 * Mas note que isso foge dos princípios da orientação a objetos
 * Pois, essas responsabilidades deveriam ser da classe Aluno
 */
public class VerificadoraDeNotas {

	public static int mediaAluno(Aluno a) {
		int total = 0;
		total += a.bimestre1;
		total += a.bimestre2;
		total += a.bimestre3;
		total += a.bimestre4;
		return total/4;
	}
	
	public static boolean passouDeAno(Aluno a) {
		int media = mediaAluno(a);
		return media >= 60 ? true : false;
	}
}
