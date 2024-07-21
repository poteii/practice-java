package org.example;

import java.util.Scanner;

public class BasicFunction {

    public static void teatime() {
        System.out.println("Waiting.. tea time....");
        System.out.println("Enter any word to start tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's tea time");

    }

    public static double calculateTotalMealPrice(double listedPrice,
                                               double tipRate,
                                               double taxRate) {
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double result = listedPrice + tip + tax;
        System.out.println("Your total meal price is " + result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to tea shop");
        teatime();
        System.out.println("Bill");

        double groupTotalMealCost = calculateTotalMealPrice(250,
                .1, .08);
        System.out.println(groupTotalMealCost);

        double individualTotalMealCost = groupTotalMealCost / 5;
        System.out.println(individualTotalMealCost);

        double result = Math.pow(2,4);
        System.out.println(result);


    }
}
