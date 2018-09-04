package exception;

public class ValorPrincipalVazioException extends ParametroException{
	public static final String msg = "O valor principal eh igual a zero!";
	
	public ValorPrincipalVazioException() {
		super(msg);
	}
	
	public ValorPrincipalVazioException(String msg) {
		super(msg);
	}
}
