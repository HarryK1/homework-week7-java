package javaprogramme;

/*
 * Write a Java program to sum values of an array.
 */

public class Programme18_SumValue {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        int sum = 0;

        //calculate the sum of the array elements
        for (int number : numbers){
            sum += number;
        }

        System.out.println("The sum of the array elements is: " + sum);
    }
}
