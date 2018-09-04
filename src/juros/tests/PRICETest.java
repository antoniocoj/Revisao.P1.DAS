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
public class PRICETest {

	double i;
	int n;
	double p;
	double[] r;
	static double[] r1 = {95.58, 96.54, 97.50, 98.48, 99.46, 100.46, 101.46, 102.48, 103.50, 104.54};
	static double[] r2 = {390.51, 395.20, 399.94, 404.74, 409.60};
	static double[] r3 = {58.88, 59.88, 60.89, 61.93, 62.98, 64.05, 65.14, 66.25};
		
	public PRICETest (double i, int n, double p, double[] r){
		this.i = i;
		this.n = n;
		this.p = p;
		this.r = r;
	}
		
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{0.01, 10, 1000.00, r1},
			{0.012, 5, 2000.00, r2},
			{0.017, 8, 500.00, r3}
		});
	}

	@Test(timeout=500)
	public void testPRICE() throws JurosVaziosException, ParcelasVaziasException, ValorPrincipalVazioException {
		Assert.assertArrayEquals(r, CalculoAmortizacao.priceCalculo(i, n, p), 0.01);
	}

}
