import java.util.Scanner;
class ProductOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int product = 1;
        for (int i = 3; i <= n - 2; i++) {
            if (i % 2 != 0) {
                product *= i;
            }
        }
        System.out.println("Product of odd numbers: " + product);
        sc.close();
    }
}
