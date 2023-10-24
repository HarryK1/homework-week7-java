package javaprogramme;

/*
Write a java program to input any number and find out if it’s odd or even
 */
import java.util.Scanner;

public class Programme6_OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if(number % 2==0){
            System.out.println(number + " is even.");
        }else {
            System.out.println(number + " is odd.");
        }
        //close the scanner
        sc.close();
    }
}
