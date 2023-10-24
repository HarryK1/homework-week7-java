package javaprogramme;
/*
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

import java.util.Scanner;

public class Programme3_MarkSheet {
    public static void main(String[] args) {
        //use scanner
        Scanner scanner = new Scanner(System.in);

        //input student details
        System.out.println("Enter student Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Roll No: ");
        int rollNo = scanner.nextInt();

        System.out.println("Enter Math marks (0-100): ");
        int mathMarks = scanner.nextInt();
        if (mathMarks < 0 || mathMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 and 100");

            return;
        }
        System.out.println("Enter Science marks(0-100): ");
        int scienceMarks = scanner.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100){
            System.out.println("Invalid Input, Marks should be between 0 and 100");
            return;
        }
        System.out.println("Enter English marks (0-100): ");
        int englishMarks = scanner.nextInt();
        if (englishMarks < 0 || englishMarks > 100){
            System.out.println("Invalid Input, Marks should be between 0 and 100");
            return;
        }
        //Calculate total and percentage
        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (totalMarks / 300.0) * 100;

        // Determine result and grade
        String result = (percentage >=35) ? "Pass" : "Fail";
        String grade;
        if(percentage >=80){
            grade = "A+";
        } else if (percentage >=60){
            grade = "A";
        } else if (percentage >=50){
            grade = "B";
        } else {
            grade = "C";
        }
        //print Mark Sheet
        System.out.println("-------------------------------------");
        System.out.println("|                                   |");
        System.out.println("|            Mark Sheet             |");
        System.out.println("|___________________________________|");
        System.out.println("|  Name: " + name + "                       |");
        System.out.println("|  Roll No: " + rollNo + "                      |");
        System.out.println("|___________________________________|");
        System.out.println("|        Subjects: Marks            |");
        System.out.println("|___________________________________|");
        System.out.println("|  Math: " + mathMarks + "                         |");
        System.out.println("|  Science: " + scienceMarks + "                      |");
        System.out.println("|  English: " + englishMarks + "                      |");
        System.out.println("|___________________________________|");
        System.out.println("|  Total: " + totalMarks + "                       |");
        System.out.println("|___________________________________|");
        System.out.println("| Percentage: " + percentage + "     |");
        System.out.println("|      Result: " + result + "                 |");
        System.out.println("|       Grade: " + grade + "                   |");
        System.out.println("|___________________________________|");

        //close the scanner
        scanner.close();
    }
}
