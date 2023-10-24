package javaprogramme;
/*
 * Input any alphabet from “A to F” and print their city name accordingly (use if else)
 * any other alphabet should be invalid entry
 * Write above program using switch statement. */

import java.util.Scanner;

public class Programme9_CityNameSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet(A to F): ");
        String input = sc.next();

        if (input.length() == 1) {
            char alphabet = input.charAt(0);

            if (alphabet >= 'A' && alphabet <= 'F') {
                switch (alphabet) {
                    case 'A':
                        System.out.println("City: Amsterdam");
                        break;
                    case 'B':
                        System.out.println("City: Berlin");
                        break;
                    case 'C':
                        System.out.println("City: Chicago");
                        break;
                    case 'D':
                        System.out.println("City: Delhi");
                        break;
                    case 'E':
                        System.out.println("City: Edinburgh");
                        break;
                    case 'F':
                        System.out.println("City: Florence");
                        break;

                }
            } else {
                System.out.println("Invalid entry. Please enter an alphabet from 'A' to 'F'.");
            }
        } else {
            System.out.println("Invalid entry. Please enter a single alphabet.");
        }
        //close the scanner
        sc.close();
    }

}
