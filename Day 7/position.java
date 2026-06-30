import java.util.Scanner;

public class position
 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the element for position " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Position " + i + " = " + arr[i]);
        }

        sc.close();
    }
}