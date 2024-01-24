package _24HandsOn_Exceptions;

public class Principal {

	public static void main(String[] args) throws Exception {
		a(100);
	}
	
	public static void a(int i) throws Exception {
		System.out.println("executando o método A");
		b(i);
	}
	
	public static void b(int i) throws Exception {
		System.out.println("executando o método B");
		throw new Exception("Mensagem"); 
	}
	
}
