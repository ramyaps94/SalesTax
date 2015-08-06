import com.salestax.SalesTaxCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class salesTaxTest {

    @Test
    public void shouldKnowToCalculateTheSalesTaxForOneImportedGoods() {
        SalesTaxCalculator calculator = new SalesTaxCalculator();
        double actualValue = calculator.calculateImportedSalesTax("1","10.00");

        double expectedValue = 10.50;

        assertEquals(expectedValue, actualValue ,0.0);
    }

}
