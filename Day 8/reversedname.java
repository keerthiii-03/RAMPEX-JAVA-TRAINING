public class reversedname {
    public static void main(String[] args) {
        String name1 = new String("Keerthi");
        for (int i = name1.length() - 1; i >= 0; i--) {
            System.out.print(name1.charAt(i));
        }
    }
}