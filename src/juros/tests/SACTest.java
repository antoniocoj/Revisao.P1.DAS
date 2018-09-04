package juros.tests;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import exception.JurosVaziosException;
import exception.ParcelasVaziasException;
import exception.ValorPrincipalVazioException;
import juros.app.CalculoAmortizacao;

@RunWith(Parameterized.class)
@Category(TSTAmortizacao.class)
public class SACTest {

	double i;
	int n;
	double p;
	double[] r;
	static double[] r1 = {100.00, 100.00, 100.00, 100.00, 100.00, 100.00, 100.00, 100.00, 100.00, 100.00};
	static double[] r2 = {400.00, 400.00, 400.00, 400.00, 400.00};
	static double[] r3 = {62.50, 62.50, 62.50, 62.50, 62.50, 62.50, 62.50, 62.50};
		
	public SACTest (double i, int n, double p, double[] r){
		this.i = i;
		this.n = n;
		this.p = p;
		this.r = r;
	}
		
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{0.01,10,1000.00, r1},
			{0.012,5,2000.00, r2},
			{0.017, 8, 500.00, r3}
		});
	}
		
	@Test(timeout=500)
	public void testSAC() throws JurosVaziosException, ParcelasVaziasException, ValorPrincipalVazioException {
		Assert.assertArrayEquals(r, CalculoAmortizacao.sacCalculo(i,n,p), 0.01);
	}

}
