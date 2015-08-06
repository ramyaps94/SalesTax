package com.salestax;

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

    @Test
    public void shouldKnowToCalculateTheSalesTaxForMoreThanOneImportedGoods() {
        SalesTaxCalculator calculator = new SalesTaxCalculator();
        double actualValue = calculator.calculateImportedSalesTax("2","10.00");

        double expectedValue = 21.00;

        assertEquals(expectedValue, actualValue, 0.0);
    }

    @Test
    public void shouldKnowToCalculateTheSalesTaxForOneImportedGoodsOfDifferentKind() {
        SalesTaxCalculator calculator = new SalesTaxCalculator();
        double actualValue = calculator.calculateImportedSalesTaxForNonExemtedGoods("1","47.50");

        double expectedValue = 54.625;

        assertEquals(expectedValue, actualValue ,0.0);
    }

}
