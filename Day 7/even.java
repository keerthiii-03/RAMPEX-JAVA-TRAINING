public class even {
    public static void main(String[] args) {

        int[] arr = new int[5];

        for (int index = 0; index <= 4; index++) {
            arr[index] = index * 2;
        }

        for (int index = 0; index <= 4; index++) {
            System.out.print(arr[index] + " ");
        }
    }
}