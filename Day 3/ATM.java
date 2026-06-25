import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        // Check PIN
        if (pin < 0 || pin < 1000 || pin > 9999) {
            System.out.println("Invalid PIN");
            return;
        }

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        // Check amount
        if (amount < 0) {
            System.out.println("Invalid Amount");
            return;
        }

        System.out.println("Transaction Successful");

        sc.close();
    }
}
