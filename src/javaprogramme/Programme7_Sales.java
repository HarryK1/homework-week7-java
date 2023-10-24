package javaprogramme;
/*
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

import java.util.Scanner;

public class Programme7_Sales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input sales details
        System.out.println("Enter Sales ID: ");
        int salesId = scanner.nextInt();

        System.out.println("Enter Seller's Name: ");
        scanner.nextLine(); //Consume the newline character
        String sellerName = scanner.nextLine();

        System.out.println("Enter Sales Amount: ");
        double salesAmount = scanner.nextDouble();

        System.out.println("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        //calculate sales commission
        double commission;

        if (salesAmount >= 50000){
            commission = salesAmount * 0.35;
        }else if (salesAmount >= 30000){
            commission = salesAmount * 0.20;
        }else if (salesAmount >= 20000) {
            commission = salesAmount * 0.10;
        }else if (salesAmount >= 10000) {
            commission = salesAmount * 0.05;
        }else {
            commission = salesAmount * 0.02;
        }

        //calculate total salary
        double totalSalary = basicSalary + commission;

        //Print the results
        System.out.println("Sales ID: " + salesId);
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Commission: " + commission);
        System.out.println("Total Salary: " + totalSalary);

        scanner.close();

    }
}
