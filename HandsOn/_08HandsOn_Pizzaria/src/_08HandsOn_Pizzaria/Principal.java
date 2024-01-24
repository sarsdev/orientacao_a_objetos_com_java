package _08HandsOn_Pizzaria;

public class Principal {

	public static void main(String[] args) throws Exception {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("Calabresa");
		pizza1.adicionaIngrediente("Queijo");
		pizza1.adicionaIngrediente("Cebola");
		carrinho.AdicionarPizza(pizza1);
		
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("Queijo");
		carrinho.AdicionarPizza(pizza2);
		
		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("Queijo");
		pizza3.adicionaIngrediente("Tomate");
		pizza3.adicionaIngrediente("Cebola");
		pizza3.adicionaIngrediente("Calabresa");
		pizza3.adicionaIngrediente("Catupiri");
		pizza3.adicionaIngrediente("Alho");
		carrinho.AdicionarPizza(pizza3);
		
		System.out.println(carrinho.getResumo());
	}

}
