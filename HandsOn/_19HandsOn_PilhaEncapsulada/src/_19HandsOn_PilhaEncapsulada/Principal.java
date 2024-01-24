package _19HandsOn_PilhaEncapsulada;

public class Principal {

	public static void main(String[] args) {
		Pilha pilha = new Pilha(10);
		pilha.empilhar("Eduardo");
		pilha.empilhar("Maria");
		pilha.empilhar("José");
		System.out.println(pilha.topo());
		System.out.println(pilha.tamanho());
		
		System.out.println("----------------");
		System.out.println(pilha.desempilhar());
		System.out.println(pilha.topo());
		System.out.println(pilha.tamanho());
		
		System.out.println("-- Gerando erro por mudar um atributo indevidamente --");
		pilha.setTopo(6);
		System.out.println(pilha.topo());
		System.out.println(pilha.tamanho());
	}
	
}
