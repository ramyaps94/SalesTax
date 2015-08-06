package com.salestax;

public class Dispatcher {
    SalesTaxCalculator calculator;
    public Dispatcher(SalesTaxCalculator calculator) {
        this.calculator = calculator;
    }
    public double dispatch(String input) {
        double salesTax = 0;
        String formattedInput[ ] = input.split(" ");
        if(formattedInput[1].equals("imported")) {
            salesTax = calculator.calculateImportedSalesTax(formattedInput[0], formattedInput[formattedInput.length - 1]);
        }
        return salesTax;
    }
}