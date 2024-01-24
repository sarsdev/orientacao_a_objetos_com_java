package _24HandsOn_Exceptions;

public class PrincipalComTryCatch {

	public static void main(String[] args) {
		a(100);
		System.out.println("Executado o main");
	}
	
	public static void a(int i) {
		System.out.println("executando o método A");
		try {
			b(i);
		} catch(Exception e) {
			System.out.println("Gerou Exception no método A: " + e.getMessage());
		}
		System.out.println("Executado o método A");
	}
	
	public static void b(int i) throws Exception {
		System.out.println("executando o método B");
		throw new Exception("Mensagem"); 
	}

}
