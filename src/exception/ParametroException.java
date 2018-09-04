package exception;

public class ParametroException extends Exception{
	public static final String msg = "Excecao gerenica de parametro.";
	
	public ParametroException(String msg) {
		super(msg);
	}
	
	public ParametroException() {
		super(msg);
	}

}
