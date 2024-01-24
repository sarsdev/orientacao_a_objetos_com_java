package _10HandsOn_TesteAntesDepois;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AntesDepois {
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All");
	}
	
	@BeforeEach
	public void before() {
		System.out.println("Before");
	}

	@Test
	void teste1() {
		System.out.println("Teste 1");
	}
	
	@Test
	void teste2() {
		System.out.println("Teste 2");
	}
	
	@Test
	void teste3() {
		System.out.println("Teste 3");
	}
	
	@AfterEach
	public void after() {
		System.out.println("After");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("After All");
	}

}
