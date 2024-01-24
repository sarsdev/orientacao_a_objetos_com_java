package _13HandsOn_Banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteContaCorrente {
	
	ContaCorrente cc;

	@BeforeEach
	void antesCadaTeste() {
		cc = new ContaCorrente();
		cc.depositar(200);
	}
	
	@Test
	void testeDeposito() {
		assertEquals(200, cc.saldo);
	}
	
	@Test
	void testeSacar() {
		assertEquals(50, cc.sacar(50));
		assertEquals(150, cc.saldo);
	}
	
	@Test
	void testeSacarMaiorQueSaldo() {
		assertEquals(0, cc.sacar(250));
		assertEquals(200, cc.saldo);
	}

}
