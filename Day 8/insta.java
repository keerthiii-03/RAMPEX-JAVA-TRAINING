import java.util.Scanner;
public class insta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Instagram Username: ");
        String username = sc.nextLine();
        System.out.print("Characters only: ");
        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);
            if (Character.isLetter(ch)) {
                System.out.print(ch);
            }
        }
        sc.close();
    }
}