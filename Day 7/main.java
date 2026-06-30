public class main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i = i + 2) {
            arr[i] = (2 * i) - 1;
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}