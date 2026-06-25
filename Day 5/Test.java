import java.util.Scanner;

class Test {
    public static void main(String[] args) {

        int sum = 1;
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }

        System.out.println(sum);

        scn.close();
    }
}