package _12HandsOn_TesteIMC;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestePaciente {

	@Test
	void testeObesidadeIII() {
		Paciente paciente = new Paciente(120.0, 1.6);
		assertEquals(46.875, paciente.calcularIMC(), 0.01);
		assertEquals("Obesidade grau III (obesidade mórbida)", paciente.diagnostico());
	}
	
	@Test
	void testeObesidadeII() {
		Paciente paciente = new Paciente(90.0, 1.6);
		assertEquals(35.156, paciente.calcularIMC(), 0.01);
		assertEquals("Obesidade grau II", paciente.diagnostico());
	}
	
	@Test
	void testeObesidadeI() {
		Paciente paciente = new Paciente(90.0, 1.65);
		assertEquals(33.057, paciente.calcularIMC(), 0.01);
		assertEquals("Obesidade grau I", paciente.diagnostico());
	}
	
	@Test
	void testeSobrepeso() {
		Paciente paciente = new Paciente(80.0, 1.7);
		assertEquals(27.68, paciente.calcularIMC(), 0.01);
		assertEquals("Sobrepeso", paciente.diagnostico());
	}
	
	@Test
	void testePesoNormal() {
		Paciente paciente = new Paciente(72.0, 1.75);
		assertEquals(23.51, paciente.calcularIMC(), 0.01);
		assertEquals("Peso normal", paciente.diagnostico());
	}
	
	@Test
	void testeBaixoPeso() {
		Paciente paciente = new Paciente(65.0, 1.95);
		assertEquals(17.09, paciente.calcularIMC(), 0.01);
		assertEquals("Baixo peso", paciente.diagnostico());
	}
	
	@Test
	void testeBaixoPesoGrave() {
		Paciente paciente = new Paciente(48, 1.7);
		assertEquals(16.6, paciente.calcularIMC(), 0.01);
		assertEquals("Baixo peso grave", paciente.diagnostico());
	}
	
	@Test
	void testeBaixoPesoMuitoGrave() {
		Paciente paciente = new Paciente(50.0, 1.78);
		assertEquals(15.78, paciente.calcularIMC(), 0.01);
		assertEquals("Baixo peso muito grave", paciente.diagnostico());
	}

}
