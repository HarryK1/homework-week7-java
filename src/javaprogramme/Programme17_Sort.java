package javaprogramme;

/*
 * Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class Programme17_Sort {
    public static void main(String[] args) {
        //sort a numeric array
        int[] numericArray = {5,2,9,1,5,6,8,3};
        Arrays.sort(numericArray);

        System.out.println("Sorted Numeric Array: ");
        for (int num : numericArray){
            System.out.print(num + " ");
        }
        //sort a string array
        String[] stringArray = {"apple","banana","cherry","date","grape","fig"};
        Arrays.sort(stringArray);

        System.out.println("\nSorted String Array: ");
        for (String str : stringArray){
            System.out.print(str + " ");
        }
    }

}
