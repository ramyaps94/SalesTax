package com.salestax;


import java.util.ArrayList;
import java.util.Scanner;

public class salesTaxApplication {
    public static void main(String[] args) {
        String input;
        ArrayList<String> taxExemptedGoods = new ArrayList<>();
        double salesTax , totalTax = 0;
        taxExemptedGoods.add("chocolates");
        taxExemptedGoods.add("pills");
        taxExemptedGoods.add("book");
        SalesTaxCalculator calculator = new SalesTaxCalculator();
        Dispatcher dispatcher = new Dispatcher(calculator , taxExemptedGoods);

        System.out.println("Welcome to sales tax problem");
        System.out.println("Enter Inputs and enter calculate");
        do {
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
            if(input.equals("calculate")) break;
            salesTax = dispatcher.dispatch(input);
            totalTax += salesTax;

        }while(true);
        System.out.println(totalTax);
    }
}