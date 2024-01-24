package _04HandsOn_IMC;

public class Principal {

	public static void main(String[] args) {
		Paciente paciente1 = new Paciente(55.0, 1.65);
		System.out.println("Paciente 1: IMC "+ paciente1.calcularIMC() +" - "+ paciente1.diagnostico());
		
		Paciente paciente2 = new Paciente(90.0, 1.73);
		System.out.println("Paciente 2: IMC "+ paciente2.calcularIMC() +" - "+ paciente2.diagnostico());
		
		Paciente paciente3 = new Paciente(126.0, 1.69);
		System.out.println("Paciente 3: IMC "+ paciente3.calcularIMC() +" - "+ paciente3.diagnostico());
	}

}
