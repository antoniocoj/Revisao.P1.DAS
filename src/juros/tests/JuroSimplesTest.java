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
public class JuroSimplesTest {

 	double i;
	int n;
	double p;
	double[] r;
	static double[] r1 = {0.0,10.0,20.0,30.0,40.0,50.0,60.0,70.0,80.0,90.0,100.0};
	static double[] r2 = {0.0, 24.0, 48.0, 72.0, 96.0, 120.0};
	static double[] r3 = {0.0, 8.5, 17.0, 25.5, 34.0, 42.5, 51.0, 59.5, 68.0};
	
	public JuroSimplesTest (double i, int n, double p, double[] r){
		this.i = i;
		this.n = n;
		this.p = p;
		this.r = r;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{0.01,10,1000.00, r1 },
			{0.012,5,2000.00, r2},
			{0.017, 8, 500.00, r3}
		});
	}
	
	@Test(timeout=500)
	public void testJurosSimples() throws JurosVaziosException, ParcelasVaziasException, ValorPrincipalVazioException {
		Assert.assertArrayEquals(r, CalculoJuros.jurosSimplesCalculo(i, n, p), 0.01);
	}
	
	
}
