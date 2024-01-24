package _11HandsOn_TestePizzaria;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TesteCarrinhoDeCompras {

	@Test
	void testePizzaSemIngrediente() {
		Pizza pizza = new Pizza();
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		assertThrows(Exception.class, () -> carrinho.AdicionarPizza(pizza), "Não é possível adicionar uma pizza sem ingredientes!");
	}
	
	@Test
	void testeGetValorTotalDasPizzas() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("Calabresa");
		pizza1.adicionaIngrediente("Queijo");
		pizza1.adicionaIngrediente("Cebola");
		
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("Queijo");
		
		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("Queijo");
		pizza3.adicionaIngrediente("Tomate");
		pizza3.adicionaIngrediente("Cebola");
		pizza3.adicionaIngrediente("Calabresa");
		pizza3.adicionaIngrediente("Catupiri");
		pizza3.adicionaIngrediente("Alho");
		
		try {
			carrinho.AdicionarPizza(pizza1);
			carrinho.AdicionarPizza(pizza2);
			carrinho.AdicionarPizza(pizza3);
		} catch (Exception e) {
			fail("Erro inesperado ao adicionar as pizzas");
		}
		
		assertEquals(58.0, carrinho.getValorTotalDasPizzas());
	}

}
