package juros.tests;

import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({JuroCompostoTest.class, JuroSimplesTest.class, PRICETest.class, SACTest.class, ParametrosVaziosTest.class})
@IncludeCategory(TSTAmortizacao.class)
@ExcludeCategory(TSTJuros.class)
public class AllTests {

}
