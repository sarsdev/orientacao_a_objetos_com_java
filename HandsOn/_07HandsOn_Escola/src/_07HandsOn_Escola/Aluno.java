package _07HandsOn_Escola;

/* Os métodos media e passouDeAno foram movidos da classe VerificadoraDeNotas
 * para a classe Aluno, pois assim as responsabilidades ficam
 * nos locais corretos
 */
public class Aluno {

	int bimestre1;
	int bimestre2;
	int bimestre3;
	int bimestre4;
	
	public int media() {
		int total = 0;
		total += this.bimestre1;
		total += this.bimestre2;
		total += this.bimestre3;
		total += this.bimestre4;
		return total/4;
	}
	
	public boolean passouDeAno() {
		int media = this.media();
		return media >= 60 ? true : false;
	}
}
