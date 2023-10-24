package javaprogramme;
/*
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
import java.util.Scanner;


public class Programme2_Year {
    //create scanner, condition for leap year, close the scanner
    public static void main(String[] args) {
        int y;
        System.out.println("Enter any Year ");
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();

        if (y % 100 == 0 && y % 400 == 0 || y % 100 != 0 && y % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");

            sc.close();
        }

    }

}
