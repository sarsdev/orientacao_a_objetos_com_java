package _11HandsOn_TestePizzaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class CarrinhoDeCompras {
	
	private List<Pizza> listaDePizzas;

	public CarrinhoDeCompras() {
		listaDePizzas = new ArrayList<Pizza>();
	}
	
	public void AdicionarPizza(Pizza pizza) throws Exception {
		if(!pizza.ExisteIngrediente()) {
			throw new Exception("Não é possível adicionar uma pizza sem ingredientes!");
		}
		listaDePizzas.add(pizza);
	}
	
	public double getValorTotalDasPizzas() {
		double valorTotal = 0.0;
		for(Pizza pizza : this.listaDePizzas) {
			valorTotal += pizza.getPreco();
		}
		return valorTotal;
	}
	
	public String getResumo() {
		String resumo = "";
		resumo += "### RESUMO DO CARRINHO ###\n";
		resumo += " > Total de pizzas: "+ this.listaDePizzas.size() +"\n";
		resumo += " > Valor total    : "+ this.getValorTotalDasPizzas() +"\n\n";
		
		resumo += "Lista detalhada dos preços das pizzas\n";
		int numeroDaPizzaNaLista = 1;
		for(Pizza pizza : this.listaDePizzas) {			
			resumo += " "+ numeroDaPizzaNaLista +"° Pizza - Preço: "+ pizza.getPreco() +" - Quantidade de Ingredientes: "+ pizza.getQuantidadeDeIngredientes() +";\n";
			numeroDaPizzaNaLista++;
		}
		
		resumo += "\nLista completa de ingredientes e quantidades\n";
		for(Entry<String, Integer> ingrediente : Pizza.listaDeTodosIngredientesDasPizzas.entrySet()) {			
			resumo += " - "+ ingrediente.getKey() +": "+ ingrediente.getValue() +";\n";
		}
		return resumo;
	}
}
