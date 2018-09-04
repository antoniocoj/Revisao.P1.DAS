package exception;

public class JurosVaziosException extends ParametroException{
	public static final String msg = "O valor do juros eh igual a zero!";
	
	public JurosVaziosException() {
		super(msg);
	}
	
	public JurosVaziosException(String msg) {
		super(msg);
	}

}
