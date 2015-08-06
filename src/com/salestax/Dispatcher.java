package com.salestax;

import java.util.ArrayList;

public class Dispatcher {
    private ArrayList<String> taxExemptedGoods = new ArrayList<>();
    SalesTaxCalculator calculator;

    public Dispatcher(SalesTaxCalculator calculator, ArrayList<String> taxExemptedGoods) {
        this.calculator = calculator;
        this.taxExemptedGoods = taxExemptedGoods;
    }

    public double dispatch(String input) {
        double salesTax = 0;
        String formattedInput[] = input.split(" ");
        if (formattedInput[1].equals("imported")) {
            for (int i = 0; i < formattedInput.length; i++) {
                if (taxExemptedGoods.contains(formattedInput[i])) {

                    salesTax = calculator.calculateImportedSalesTax(formattedInput[0], formattedInput[formattedInput.length - 1]);
                    return salesTax;
                }

            }
                    salesTax = calculator.calculateImportedSalesTaxForNonExemtedGoods(formattedInput[0], formattedInput[formattedInput.length - 1]);

            }
            return salesTax;
        }
    }