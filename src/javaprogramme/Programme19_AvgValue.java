package javaprogramme;

/*
 * Write a Java program to calculate the average value of array elements.
 */
public class Programme19_AvgValue {
    public static void main(String[] args) {
        double[] numbers = {10.5,20.2,30.7,40.3,50.8};
        double sum = 0.0;

        //calculate the sum of the array elements
        for (double number : numbers){
            sum += number;
        }

        //calculate the average
        double average = sum / numbers.length;

        System.out.println("The average value of the array elements is: " + average);
    }

}
