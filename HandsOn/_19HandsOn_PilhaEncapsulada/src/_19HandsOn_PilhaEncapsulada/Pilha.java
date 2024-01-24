package _19HandsOn_PilhaEncapsulada;

public class Pilha {
	
	private Object[] elementos;
	private int topo;

	public Pilha(int tamanhoMaximo) {
		this.elementos = new Object[tamanhoMaximo];
		this.topo = 0;
	}
	
	public void empilhar(Object elemento) {
		this.elementos[topo] = elemento;
		this.topo++;
	}
	
	public Object desempilhar() {
		this.topo--;
		return this.elementos[this.topo];
	}
	
	public Object topo() {
		return this.elementos[this.topo - 1];
	}
	
	public int tamanho() {
		return this.topo;
	}
	
	public Object[] getElementos() {
		return this.elementos;
	}
	
	public void setElementos(Object[] elementos) {
		this.elementos = elementos;
	}
	
	public void setTopo(int topo) {
		this.topo = topo;
	}

}
