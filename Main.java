package com.elishabwilukiro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nCalculator\n-----------");

        float number1, number2;

        System.out.print("Enter first number: ");
        number1 = input.nextFloat();

        System.out.print("Enter second: ");
        number2 = input.nextFloat();

        System.out.println("\nResults\n-------");
        System.out.println("Sum: "+(number1+number2));
        System.out.println("Difference: "+(number1-number2));
        System.out.println("Product: "+(number1*number2));
        System.out.println("Quotient: "+(number1/number2));
        System.out.println("Remainder: "+(number1%number2));


    }
}
