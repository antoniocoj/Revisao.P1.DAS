package juros.tests;

import org.junit.Test;

import exception.JurosVaziosException;
import exception.ParcelasVaziasException;
import exception.ValorPrincipalVazioException;
import juros.app.ValidacaoParametros;

public class ParametrosVaziosTest {

	double i = 0;
	int n = 0;
	double p = 0;
	
	@Test(expected = JurosVaziosException.class)
	public void testSemJuros() throws JurosVaziosException {
		ValidacaoParametros.jurosValidacao(i);
	}
	
	@Test(expected = ParcelasVaziasException.class)
	public void testSemParcelas() throws ParcelasVaziasException {
		ValidacaoParametros.parcelasValidacao(n);
	}
	
	@Test(expected = ValorPrincipalVazioException .class)
	public void testSemValorPrincipal() throws ValorPrincipalVazioException {
		ValidacaoParametros.valorPrincipalValidacao(p);
	}
	
}
