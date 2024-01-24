package _08HandsOn_Pizzaria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pizza {
	
	public static HashMap<String, Integer> listaDeTodosIngredientesDasPizzas = new HashMap<String, Integer>();
	private List<String> listaDeIngredientesDaPizza;
	
	public Pizza() {
		this.listaDeIngredientesDaPizza = new ArrayList<String>();
	}
	
	public void adicionaIngrediente(String ingrediente) {
		this.listaDeIngredientesDaPizza.add(ingrediente.toUpperCase());
		contabilizaIngrediente(ingrediente.toUpperCase());
	}
	
	public static void contabilizaIngrediente(String ingrediente) {
		Integer quantidadeAtualDoIngrediente = listaDeTodosIngredientesDasPizzas.get(ingrediente);
		if(quantidadeAtualDoIngrediente == null) {
			quantidadeAtualDoIngrediente = 0;
		}
		listaDeTodosIngredientesDasPizzas.put(ingrediente, ++quantidadeAtualDoIngrediente);
	}
	
	public static void removeTodosIngredientesContabilizados() {
		listaDeTodosIngredientesDasPizzas.clear();
	}
	
	public double getPreco() {
		int quantidadeDeIngredientes = this.listaDeIngredientesDaPizza.size();
		if(quantidadeDeIngredientes <= 2) {
			return 15.0;
		} else if(quantidadeDeIngredientes <= 5) {
			return 20.0;
		} else {
			return 23.0;
		}
	}
	
	public int getQuantidadeDeIngredientes() {
		return listaDeIngredientesDaPizza.size();
	}
	
	public boolean ExisteIngrediente() {
		return this.listaDeIngredientesDaPizza.size() == 0 ? false : true;
	}
	
}
