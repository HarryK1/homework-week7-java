package javaprogramme;
/*
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
import java.util.Scanner;


public class Programme16_CheckNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = s.nextInt();

        if (number > 0){
            System.out.println("POSITIVE");
        }else if (number < 0){
            System.out.println("NEGATIVE");
        }else {
            System.out.println("ZERO");
        }
        //Close the scanner
        s.close();
    }
}
