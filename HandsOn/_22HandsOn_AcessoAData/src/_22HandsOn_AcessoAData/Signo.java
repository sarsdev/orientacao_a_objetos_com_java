package _22HandsOn_AcessoAData;

import java.util.Calendar;
import java.util.Date;

public class Signo {

	private enum Signos {
		ARIES, TOURO, GEMEOS,
		CANCER, LEAO, VIRGEM,
		LIBRA, ESCORPIAO, SARGITARIO,
		CAPRICORNIO, AQUARIO, PEIXES;
	}
	
	public static String getSignoPelaData(Date dataDeNascimento) {
		int ano = Relogio.getAno(dataDeNascimento);
		String nomeSigno = "";
		for(Signos signo : Signos.values()) {
			if( dataDeNascimento.after(getDataInicialSigno(signo, ano)) &&
				dataDeNascimento.before(getDataFinalSigno(signo, ano)) ) {
				nomeSigno = signo.name();
			}
		}
		return nomeSigno;
	}
	
	private static Date getDataInicialSigno(Signos signo, int ano) {
		Calendar data = Calendar.getInstance();
		switch(signo) {
			case ARIES:
				data.set(ano, Calendar.MARCH, 20);
				return data.getTime();
			case TOURO:
				data.set(ano, Calendar.APRIL, 20);
				return data.getTime();
			case GEMEOS:
				data.set(ano, Calendar.MAY, 20);
				return data.getTime();
			case CANCER:
				data.set(ano, Calendar.JUNE, 20);
				return data.getTime();
			case LEAO:
				data.set(ano, Calendar.JULY, 21);
				return data.getTime();
			case VIRGEM:
				data.set(ano, Calendar.AUGUST, 22);
				return data.getTime();
			case LIBRA:
				data.set(ano, Calendar.SEPTEMBER, 22);
				return data.getTime();
			case ESCORPIAO:
				data.set(ano, Calendar.OCTOBER, 22);
				return data.getTime();
			case SARGITARIO:
				data.set(ano, Calendar.NOVEMBER, 21);
				return data.getTime();
			case CAPRICORNIO:
				data.set(ano, Calendar.DECEMBER, 21);
				return data.getTime();
			case AQUARIO:
				data.set(ano, Calendar.JANUARY, 20);
				return data.getTime();
			case PEIXES:
				data.set(ano, Calendar.FEBRUARY, 19);
				return data.getTime();
			default:
				return data.getTime();
		}
	}
	
	private static Date getDataFinalSigno(Signos signo, int ano) {
		Calendar data = Calendar.getInstance();
		switch(signo) {
			case ARIES:
				data.set(ano, Calendar.APRIL, 20);
				return data.getTime();
			case TOURO:
				data.set(ano, Calendar.MAY, 20);
				return data.getTime();
			case GEMEOS:
				data.set(ano, Calendar.JUNE, 20);
				return data.getTime();
			case CANCER:
				data.set(ano, Calendar.JULY, 21);
				return data.getTime();
			case LEAO:
				data.set(ano, Calendar.AUGUST, 22);
				return data.getTime();
			case VIRGEM:
				data.set(ano, Calendar.SEPTEMBER, 22);
				return data.getTime();
			case LIBRA:
				data.set(ano, Calendar.OCTOBER, 22);
				return data.getTime();
			case ESCORPIAO:
				data.set(ano, Calendar.NOVEMBER, 21);
				return data.getTime();
			case SARGITARIO:
				data.set(ano, Calendar.DECEMBER, 21);
				return data.getTime();
			case CAPRICORNIO:
				data.set(ano, Calendar.JANUARY, 20);
				return data.getTime();
			case AQUARIO:
				data.set(ano, Calendar.FEBRUARY, 19);
				return data.getTime();
			case PEIXES:
				data.set(ano, Calendar.MARCH, 20);
				return data.getTime();
			default:
				return data.getTime();
		}
	}
	
}
