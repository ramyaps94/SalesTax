package com.salestax;


import java.util.Scanner;

public class salesTaxApplication {
    public static void main(String[] args) {
        String input;
        double salesTax , totalTax = 0;
        SalesTaxCalculator calculator = new SalesTaxCalculator();
        Dispatcher dispatcher = new Dispatcher(calculator);

        System.out.println("Welcome to sales tax problem");
        do {
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
            salesTax = dispatcher.dispatch(input);
            totalTax += salesTax;

        }while(!input.equals("calculate"));
    }
}