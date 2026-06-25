import java.util.Scanner;

class SwiggyIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Veg");
        System.out.println("2. Non-Veg");
        System.out.println("3. Desserts");
        System.out.println("4. Exit");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Veg Menu: Paneer, Dosa");
        } else if (choice == 2) {
            System.out.println("Non-Veg Menu: Chicken, Fish");
        } else if (choice == 3) {
            System.out.println("Desserts: Ice Cream, Cake");
        } else if (choice == 4) {
            System.out.println("Exit");
        } else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
