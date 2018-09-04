package exception;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParcelasVaziasException extends ParametroException{
	public static final String msg = "O valor de parcelas eh igual a zero!";
	
	public ParcelasVaziasException() {
		super(msg);
	}
	
	public ParcelasVaziasException(String msg) {
		super(msg);
	}

}
