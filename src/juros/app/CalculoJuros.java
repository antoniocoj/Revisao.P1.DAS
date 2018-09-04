package juros.app;

import exception.JurosVaziosException;
import exception.ParcelasVaziasException;
import exception.ValorPrincipalVazioException;

public class CalculoJuros {

	public static double[] jurosSimplesCalculo(double i, int n, double p) throws JurosVaziosException, ParcelasVaziasException, ValorPrincipalVazioException{
		i = ValidacaoParametros.jurosValidacao(i);
		n = ValidacaoParametros.parcelasValidacao(n);
		p = ValidacaoParametros.valorPrincipalValidacao(p);
		
		double resultado[] = new double[n+1];
		
		i = ValidacaoParametros.jurosValidacao(i);
		
		for (int parcela = 0; parcela <=n; parcela++) {
		resultado[parcela] = p*i*parcela;
		System.out.println(resultado[parcela]);
		}
		
		return resultado;
	}

	public static double[] jurosCompostosCalculo(double i, int n, double p) throws JurosVaziosException, ParcelasVaziasException, ValorPrincipalVazioException {
		i = ValidacaoParametros.jurosValidacao(i);
		n = ValidacaoParametros.parcelasValidacao(n);
		p = ValidacaoParametros.valorPrincipalValidacao(p);
		
		double juros;
		double [] resultado = new double[n+1];
		
	
		for (int parcela = 0; parcela <= n; parcela++) {
			if (parcela == 0) {
				juros = 0.00;
			} else {
				juros = (Math.pow(1+i, parcela)*p)-p;
			}
			resultado[parcela] = juros;
		}
		
		return resultado;
	}
}
