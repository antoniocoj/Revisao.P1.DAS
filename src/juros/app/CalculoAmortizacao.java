package juros.app;

import exception.JurosVaziosException;
import exception.ParcelasVaziasException;
import exception.ValorPrincipalVazioException;

public class CalculoAmortizacao {

	public static double[] sacCalculo(double i, int n, double p) throws JurosVaziosException, ParcelasVaziasException, ValorPrincipalVazioException {
		i = ValidacaoParametros.jurosValidacao(i);
		n = ValidacaoParametros.parcelasValidacao(n);
		p = ValidacaoParametros.valorPrincipalValidacao(p);
		
		double[] resultado = new double[n];
		
		for (int parcela = 0; parcela <n; parcela++) {
			resultado[parcela] = p/n;
		}
		
		return resultado;
	}

	public static double[] priceCalculo(double i, int n, double p) throws JurosVaziosException, ParcelasVaziasException, ValorPrincipalVazioException {
		i = ValidacaoParametros.jurosValidacao(i);
		n = ValidacaoParametros.parcelasValidacao(n);
		p = ValidacaoParametros.valorPrincipalValidacao(p);
		
		double[] resultado = new double[n];
		
		
		double pmt = p*((Math.pow(1+i, n)*i)/(Math.pow(1+i, n)-1));
		
		for (int parcela = 0; parcela < n; parcela++) {
			double juros = p*i;
			resultado[parcela] = pmt-juros;
			p = p - (pmt-juros);
		}
		return resultado;
	}
}
