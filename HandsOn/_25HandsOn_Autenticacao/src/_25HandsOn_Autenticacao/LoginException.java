package _25HandsOn_Autenticacao;

public class LoginException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private String login;

	public LoginException(String message, String login) {
		super(message);
		this.login = login;
	}

	public String getLogin() {
		return login;
	}
	
}
