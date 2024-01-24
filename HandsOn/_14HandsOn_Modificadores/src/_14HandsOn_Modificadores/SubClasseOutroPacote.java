package _14HandsOn_Modificadores;

import pacote.Referencia;

public class SubClasseOutroPacote extends Referencia {

	public void testeDeAcessoSubClasseOutroPacote() {
		Referencia r = new Referencia();
		//r.modificadorDefault = 0;
		r.modificadorPublico = 0;
		//r.modificadorProtegido = 0;
		//r.modificadorPrivado = 0;
	}
	
}
