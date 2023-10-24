package javaprogramme;

/*
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

import java.util.Scanner;

public class Programme12_InputValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char input = s.next().charAt(0);

        if (Character.isDigit(input)){
            System.out.println("The input is a number.");
        } else if (Character.isLetter(input)) {
            System.out.println("The input is an alphabet (letter).");
        }else {
            System.out.println("The input is a symbol.");
        }
        //close the scanner
        s.close();
    }
}
