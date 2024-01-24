package _22HandsOn_AcessoAData;

import java.util.Calendar;
import java.util.Date;

public class Relogio {
	
	public static int getAno(Date data) {
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		return calendario.get(Calendar.YEAR);
	}
	
	public static int getAno(Calendar calendario) {
		return calendario.get(Calendar.YEAR);
	}
}
