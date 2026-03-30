package com.example;

public class Main {
    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();

        double income = 600000;
        double tax = calculator.calculateTax(income);

        System.out.println("Income: " + income);
        System.out.println("Tax: " + tax);
    }
}