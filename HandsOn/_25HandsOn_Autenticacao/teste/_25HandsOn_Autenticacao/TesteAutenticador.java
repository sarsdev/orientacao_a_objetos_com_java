package _25HandsOn_Autenticacao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteAutenticador {

	@Test
	void testeLoginComSucesso() throws LoginException {
		Autenticador autenticador = new Autenticador();
		Usuario usuario = autenticador.logar("guerra", "senhadoguerra");
		assertEquals("guerra", usuario.getLogin());
	}
	
	@Test
	void testeLoginFalho() throws LoginException {
		Autenticador autenticador = new Autenticador();
		assertThrows(
				LoginException.class,
				() -> autenticador.logar("guerra", "senhad1guerra"),
				"O usuário e a senha não batem!"
		);
	}

}
