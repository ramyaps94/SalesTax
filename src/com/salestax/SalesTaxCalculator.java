package com.salestax;

public class SalesTaxCalculator {
    public double calculateImportedSalesTax(String quantity, String amount) {
        double amountOfGoods = Double.parseDouble(amount);
        double numberOfGoods = Double.parseDouble(quantity);
        double salesTax =  amountOfGoods * numberOfGoods * 0.05 + amountOfGoods * numberOfGoods;
        return salesTax;
    }

    public double calculateImportedSalesTaxForNonExemtedGoods(String quantity, String amount) {
        double amountOfGoods = Double.parseDouble(amount);
        double numberOfGoods = Double.parseDouble(quantity);
        double salesTax =  amountOfGoods * numberOfGoods * 0.05 + amountOfGoods * numberOfGoods;
        double salesTaxBasic = amountOfGoods * numberOfGoods * 0.1 ;
        return salesTax + salesTaxBasic;
    }
}