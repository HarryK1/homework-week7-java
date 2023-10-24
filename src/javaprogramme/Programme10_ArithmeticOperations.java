package javaprogramme;

/*
 * c
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

import java.util.Scanner;

public class Programme10_ArithmeticOperations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = s.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = s.nextDouble();

        System.out.println("Enter the symbol (+,-,*,/): ");
        char symbol = s.next().charAt(0);

        double result;

        if (symbol == '+') {
            result = num1 + num2;
        } else if (symbol == '-') {
            result = num1 - num2;
        } else if (symbol == '*') {
            result = num1 * num2;
        } else if (symbol == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            }else{
                System.out.println("Invalid symbol!");
                result = Double.NaN; // Set result to NaN if division by zero is attempted
            }
        }else {
            System.out.println("Invalid symbol. Please use +, -, *, or /.");
            result = Double.NaN;// Set result to NaN for an invalid symbol
        }
        if (!Double.isNaN(result)){
            System.out.println("Result: " + result);
        }
        //close the scanner
        s.close();
    }

}
