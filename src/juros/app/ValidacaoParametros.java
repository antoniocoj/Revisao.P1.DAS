package juros.app;

import exception.JurosVaziosException;
import exception.ParcelasVaziasException;
import exception.ValorPrincipalVazioException;

public class ValidacaoParametros {

	public static double jurosValidacao(double i) throws JurosVaziosException {
		if(i==0) {
			throw new JurosVaziosException();
		} else {
		return i;
		}
	}
	
	public static int parcelasValidacao(int n) throws ParcelasVaziasException {
		if(n==0) {
			throw new ParcelasVaziasException();
		} else {
		return n;
		}
	}
	
	public static double valorPrincipalValidacao(double n) throws ValorPrincipalVazioException {
		if(n==0) {
			throw new ValorPrincipalVazioException();
		} else {
		return n;
		}
	}

}
