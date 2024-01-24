package _13HandsOn_Banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteContaEspecial extends TesteContaCorrente {

	@BeforeEach
	void antesCadaTeste() {
		cc = new ContaEspecial(100);
		cc.depositar(200);
	}
	
	@Test
	void testeSacarMaiorQueSaldo() {
		assertEquals(0, cc.sacar(350));
		assertEquals(200, cc.saldo);
	}
	
	@Test
	void testeSacarMaiorQueSaldoDentroDoLimite() {
		assertEquals(250, cc.sacar(250));
		assertEquals(-50, cc.saldo);
	}

}
