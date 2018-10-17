package com.epam.mariia_iasakova.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Maths maths = new Maths();

        while (true) {
            System.out.print("Enter 1st number: ");
            double inputA = input.nextDouble();

            System.out.print("Enter 2d number: ");
            double inputB = input.nextDouble();

            System.out.print("Enter operation: ");
            char operator = input.next().charAt(0);

            double answer = calculate(maths, inputA, inputB, operator);

            System.out.println(String.format("%.1f %s %.1f = %.2f", inputA, operator, inputB, answer));
        }
    }

    private static double calculate(Maths maths, double inputA, double inputB, char operator) {
        switch (operator) {
            case '+':
                return maths.add(inputA, inputB);
            case '-':
                return maths.subtract(inputA, inputB);
            case '*':
                return maths.multiply(inputA, inputB);
            case '/':
                return maths.divide(inputA, inputB);
            case '^':
                return maths.power(inputA, inputB);
            default:
                    throw new UnsupportedOperationException();
        }
    }

}
