public class secondmax {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 4, 2, 5, 5};
        int max = arr[0];
        int secondMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }
        System.out.println("Maximum = " + max);
        System.out.println("Second Maximum = " + secondMax);
    }
}