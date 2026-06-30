import java.util.Scanner;

public class subject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] subjects = {"Tamil", "English", "Maths", "Science", "Social"};
        int[] marks = new int[5];

        int total = 0;
        double percentage;

        // Get marks
        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        // Calculate percentage
        percentage = (double) total / subjects.length;

        // Display marks
        System.out.println("\n----- MARK SHEET -----");

        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + " : " + marks[i]);
        }

        System.out.println("----------------------");
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}