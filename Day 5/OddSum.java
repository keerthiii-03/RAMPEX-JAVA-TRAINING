import java.util.Scanner;

class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < n; i++) {   // n-1
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("Sum of odd numbers: " + sum);
        sc.close();
    }
}
