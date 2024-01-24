package tela;

public interface Tela {
	
	public String desenhar();
	public <T> T escolherOpcao(String respostaConsole) throws Exception;
	
}
