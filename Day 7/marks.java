import java.util.Scanner;

public class marks{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;
        double percentage;

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        percentage = (double) total / 5;

        System.out.println("\n----- Student Mark Report -----");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + " = " + marks[i]);
        }

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}