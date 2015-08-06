package com.salestax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DispatcherTest {
    @Test
    public void shouldKnowToDispatchToTheCalulatorOfSalesTaxForOneImportedGoods() {
        SalesTaxCalculator calculator = new SalesTaxCalculator();
        Dispatcher dispatcher = new Dispatcher(calculator);
        double actualValue = dispatcher.dispatch("1 imported box of chocolates at 10.00");

        double expectedValue = 10.50;

        assertEquals(expectedValue, actualValue ,0.0);
    }

}