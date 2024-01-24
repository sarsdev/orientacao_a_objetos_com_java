package _11HandsOn_TestePizzaria;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class TestePizza {

	@AfterEach
	void aposCadaTeste() {
		Pizza.removeTodosIngredientesContabilizados();
	}
	
	@Test
	void testeAdicionaIngrediente() {
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente("Salmão");
		pizza.adicionaIngrediente("Alface");
		pizza.adicionaIngrediente("Cebola");
		assertEquals(3, Pizza.listaDeTodosIngredientesDasPizzas.size());
		assertNotNull(Pizza.listaDeTodosIngredientesDasPizzas.get("SALMÃO"));
		assertNotNull(Pizza.listaDeTodosIngredientesDasPizzas.get("ALFACE"));
		assertNotNull(Pizza.listaDeTodosIngredientesDasPizzas.get("CEBOLA"));
	}
	
	@Test
	void testeGetPrecoUmIngrediente() {
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente("Queijo");
		assertEquals(15.0, pizza.getPreco());
	}
	
	@Test
	void testeGetPrecoCincoIngredientes() {
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente("Queijo");
		pizza.adicionaIngrediente("Cebola");
		pizza.adicionaIngrediente("Calabresa");
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Molho");
		assertEquals(20.0, pizza.getPreco());
	}
	
	@Test
	void testeGetPrecoOitoIngredientes() {
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente("Queijo");
		pizza.adicionaIngrediente("Cebola");
		pizza.adicionaIngrediente("Calabresa");
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Molho");
		pizza.adicionaIngrediente("Lombo");
		pizza.adicionaIngrediente("Catupiry");
		pizza.adicionaIngrediente("Pimenta");
		assertEquals(23.0, pizza.getPreco());
	}
	
	@Test
	void testeGetQuantidadeDeIngredientes() {
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente("Cebola");
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Salmão");
		pizza.adicionaIngrediente("Alface");
		pizza.adicionaIngrediente("Tomate");
		assertEquals(5, pizza.getQuantidadeDeIngredientes());
	}
	
	@Test
	void testeExisteIngredienteComIngredientes() {
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente("Cebola");
		pizza.adicionaIngrediente("Tomate");
		assertEquals(true, pizza.ExisteIngrediente());
	}
	
	@Test
	void testeExisteIngredienteSemIngredientes() {
		Pizza pizza = new Pizza();
		assertEquals(false, pizza.ExisteIngrediente());
	}

}
