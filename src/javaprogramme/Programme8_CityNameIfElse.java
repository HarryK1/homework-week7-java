package javaprogramme;

/*
 * Input any alphabet from “A to F” and print their city name accordingly (use if else)
 * any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Programme8_CityNameIfElse {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Enter an alphabet(A to F)");
        String input = t.next();

        if (input.length()==1) {
            char alphabet = input.toUpperCase().charAt(0); // Ignore case sensitivity and convert to uppercase

            if (alphabet == 'A') {
                System.out.println("City: Ahmedabad");
            } else if (alphabet == 'B') {
                System.out.println("City: Bhopal");
            } else if (alphabet == 'C') {
                System.out.println("City: Chandigarh");
            } else if (alphabet == 'D') {
                System.out.println("City: Delhi");
            } else if (alphabet == 'E') {
                System.out.println("City: Edinburgh");
            } else if (alphabet == 'F') {
                System.out.println("City: Florence");
            } else {
                System.out.println("Invalid entry. Please enter an alphabet from 'A' to 'F'.");
            }
        }
            else{
                System.out.println("Invalid entry. Please enter a single alphabet.");
            }
            //close the scanner
            t.close();
        }

    }

