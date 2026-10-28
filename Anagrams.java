import java.util.Arrays;
 class Main {
    public static void main(String[] args) {
        String t = "amma";
        String s = "mama";

        char[] a = t.toCharArray();
        char[] b = s.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
