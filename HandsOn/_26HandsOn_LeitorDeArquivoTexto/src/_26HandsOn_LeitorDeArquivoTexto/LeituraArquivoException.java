package _26HandsOn_LeitorDeArquivoTexto;

public class LeituraArquivoException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public LeituraArquivoException(String message) {
		super(message);
	}

	public LeituraArquivoException(Throwable cause) {
		super(cause);
	}

	public LeituraArquivoException(String message, Throwable cause) {
		super(message, cause);
	}

	public LeituraArquivoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
