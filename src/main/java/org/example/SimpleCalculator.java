package org.example;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter 2 numbers
        System.out.println("enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Prompt user to choose operation
        System.out.println("Choose operation (+, -, *, /");
        char operation = scanner.next().charAt(0);

        double result = 0;

        // Perform the calculation based on the operation
        switch (operation) {
            case '+':
                result = num1 + num2; // Addition
                break;
            case '-':
                result = num1 - num2; // Subtraction
                break;
            case '*':
                result = num1 * num2; // Multiplication
                break;
            case '/':
                if(num2 != 0) {
                    result = num1 / num2; // Division , check for division by zero.
                } else {
                    System.out.println("Error: Cannot divide by zero");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation");
                return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
