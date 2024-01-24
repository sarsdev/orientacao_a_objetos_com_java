package _09HandsOn_TesteParaCarros;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TesteCarro {

	@Test
	void testeParado() {
		Carro c = new Carro();
		c.potencia = 10;
		assertEquals(0, c.getVelocidade());
	}
	
	@Test
	void testeAcelerar() {
		Carro c = new Carro();
		c.potencia = 10;
		c.acelerar();
		assertEquals(10, c.getVelocidade());
	}
	
	@Test
	void testeFrear() {
		Carro c = new Carro();
		c.potencia = 10;
		c.acelerar();
		c.frear();
		assertEquals(5, c.getVelocidade());
	}
	
	@Test
	void testeFrearAteZero() {
		Carro c = new Carro();
		c.potencia = 10;
		c.acelerar();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		assertEquals(0, c.getVelocidade());
	}

}
