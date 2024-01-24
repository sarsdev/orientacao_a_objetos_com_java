package _22HandsOn_AcessoAData;

import java.util.Calendar;
import java.util.Date;

public class Pessoa {
	
	private Date dataDeNascimento;

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public int getIdade() {
		return Relogio.getAno(Calendar.getInstance()) - Relogio.getAno(this.dataDeNascimento);
	}
	
	public String getSigno() {
		return Signo.getSignoPelaData(this.dataDeNascimento);
	}
	
}
