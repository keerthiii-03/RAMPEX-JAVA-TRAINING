public class mini {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5};
        int mini = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }
        System.out.println("Minimum element = " + mini);
    }
}