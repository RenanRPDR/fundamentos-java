package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many students?");
        int quantityStudents = input.nextInt();

        System.out.print("How many grades per student?");
        int quantityGrades = input.nextInt();

        double classNotes[][] = new double[quantityStudents] [quantityGrades];
        double total = 0;
        for (int student = 0; student < classNotes.length ; student++) {
            for (int studentGrade = 0; studentGrade < classNotes[student].length ; studentGrade++) {
                System.out.printf("Report the grade %d to the student %d: ", studentGrade, student);
                classNotes[student][studentGrade] = input.nextDouble();
                total += classNotes[student][studentGrade];
            }
        }

        double average = total / (quantityStudents * quantityGrades);
        System.out.println("Average class is: " + total + ".");

        for (double gradesStudent[] : classNotes) {
            System.out.println(Arrays.toString(gradesStudent));
        }

        input.close();
    }
}
