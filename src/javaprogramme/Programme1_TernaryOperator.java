package javaprogramme;

/*
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class Programme1_TernaryOperator {
    //create scanner, use ternary operator, close the scanner
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        String result = (number % 2 ==0) ? "even" : "odd";

        System.out.println("The entered number is " + result + " . ");
        sc.close();

    }


}
