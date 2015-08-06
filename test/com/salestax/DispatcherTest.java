package com.salestax;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DispatcherTest {
    @Test
    public void shouldKnowToDispatchToTheCalulatorOfSalesTaxForOneImportedGoods() {
        SalesTaxCalculator calculator = new SalesTaxCalculator();
        ArrayList<String> taxExemptedGoods = new ArrayList<>();
        taxExemptedGoods.add("chocolates");
        taxExemptedGoods.add("pills");
        taxExemptedGoods.add("book");
        Dispatcher dispatcher = new Dispatcher(calculator ,taxExemptedGoods);
        double actualValue = dispatcher.dispatch("1 imported box of chocolates at 10.00");

        double expectedValue = 10.50;

        assertEquals(expectedValue, actualValue ,0.0);
    }

}