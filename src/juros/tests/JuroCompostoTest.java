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
import juros.app.CalculoJuros;

@RunWith(Parameterized.class)
@Category(TSTJuros.class)
public class JuroCompostoTest {
	
	double i;
	int n;
	double p;
	double[] r;
	static double[] r1 = {0.00,10.00,20.10,30.30,40.60,51.01,61.52,72.14,82.86,93.69,104.62};
	static double[] r2 = {0.00, 24.00, 48.29, 72.87, 97.74, 122.91};
	static double[] r3 = {0.00, 8.5, 17.14, 25.94, 34.88, 43.97, 53.22, 62.62, 72.19};
		
	public JuroCompostoTest (double i, int n, double p, double[] r){
		this.i = i;
		this.n = n;
		this.p = p;
		this.r = r;
	}
		
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{0.01,10,1000.00,r1},
			{0.012,5,2000.00,r2},
			{0.017,8,500,r3}
		});
	}

	@Test(timeout=500)
	public void testJuroComposto() throws JurosVaziosException, ParcelasVaziasException, ValorPrincipalVazioException {
		Assert.assertArrayEquals(r, CalculoJuros.jurosCompostosCalculo(i, n, p), 0.01);
	}
}
