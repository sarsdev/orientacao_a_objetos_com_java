package _16HandsOn_CarrosUsandoAbstracao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteCarroMultiplica {
	
	CarroDeCorrida c;
	
	@BeforeEach
	public void antesDeCadaTeste() {
		c = new CarroMultiplica("teste", 1.5, 100);
	}

	@Test
	public void testeParado() {
		assertEquals(0, c.getVelocidade());
	}
	
	@Test
	public void testeAcelerarUmaVez() {
		c.acelerar();
		assertEquals(10, c.getVelocidade());
	}
	
	@Test
	public void testeAcelerarDuasVezes() {
		c.acelerar();
		c.acelerar();
		assertEquals(15, c.getVelocidade());
	}
	
	@Test
	public void testeFrear() {
		c.acelerar();
		c.frear();
		assertEquals(5, c.getVelocidade());
	}
	
	@Test
	public void testeFrearAteZero() {
		c.acelerar();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		assertEquals(0, c.getVelocidade());
	}
	
	@Test
	public void testeAcelerarAteVelocidadeMaxima() {
		for(int i=0; i<14; i++) {
			c.acelerar();
		}
		assertEquals(100, c.getVelocidade());
	}

}
