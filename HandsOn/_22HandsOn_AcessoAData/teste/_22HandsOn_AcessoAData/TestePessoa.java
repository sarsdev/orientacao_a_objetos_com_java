package _22HandsOn_AcessoAData;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Calendar;

class TestePessoa {
	
	Calendar calendario;
	Pessoa pessoa;
	
	TestePessoa() {
		calendario = Calendar.getInstance();
		pessoa = new Pessoa();
	}

	@Test
	void testeAquariano() {
		calendario.set(1999, Calendar.FEBRUARY, 19);
		pessoa.setDataDeNascimento(calendario.getTime());
		assertEquals("AQUARIO", pessoa.getSigno());
		assertEquals(24, pessoa.getIdade());
	}
	
	@Test
	void testeLibra() {
		calendario.set(1985, Calendar.OCTOBER, 22);
		pessoa.setDataDeNascimento(calendario.getTime());
		assertEquals("LIBRA", pessoa.getSigno());
		assertEquals(38, pessoa.getIdade());
	}
	
	@Test
	void testeLeao() {
		calendario.set(1992, Calendar.JULY, 22);
		pessoa.setDataDeNascimento(calendario.getTime());
		assertEquals("LEAO", pessoa.getSigno());
		assertEquals(31, pessoa.getIdade());
	}
	
	@Test
	void testeTouro() {
		calendario.set(2015, Calendar.APRIL, 21);
		pessoa.setDataDeNascimento(calendario.getTime());
		assertEquals("TOURO", pessoa.getSigno());
		assertEquals(8, pessoa.getIdade());
	}

}
