package _06HandsOn_EstaticaVsInstancia;

public class Somador {

	public String nome;
	public int valorInstancia = 0;
	public static int valorEstatico = 0;
	
	public void somar() {
		this.valorInstancia++;
		valorEstatico++;
	}
	
	public void imprimir() {
		System.out.println("O somador "+this.nome+" valorInstancia="+this.valorInstancia+" e valorEstatico="+valorEstatico);
	}
}
