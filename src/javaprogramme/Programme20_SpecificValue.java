package javaprogramme;

/*
 * Write a Java program to test if an array contains a specific value.
 */
public class Programme20_SpecificValue {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        int targetValue = 30;
        boolean containsValue = false;

        for (int number : numbers){
            if (number == targetValue){
                containsValue = true;
                break;//Exit the loop early if the value is found
            }
        }
        if (containsValue){
            System.out.println("The array contains the value " + targetValue);
        }else {
            System.out.println("The array does not contain the value " + targetValue);
        }
    }
}
