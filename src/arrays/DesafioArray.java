package arrays;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many notes do you use to inform student average? Response:");
        int sizeArrayNotes = scanner.nextInt();

        double[] notes = new double[sizeArrayNotes];

        for (int i = 0; i < notes.length; i++) {
            System.out.print("Set your note " + ( i + 1) + ": ");
            notes[i] = scanner.nextDouble();
        }

        double total = 0;
        for (double nota: notes) {
            total += nota;
        }

        double average = total / notes.length;
        System.out.print("Student average is: " + average + ".");

        scanner.close();
    }
}