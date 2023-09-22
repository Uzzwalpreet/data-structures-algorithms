package recursion;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("java"));
    }

    public static String reverseString(String str) {
        if (str.isEmpty())
            return str;
        return reverseString(str.substring(1)) + String.valueOf(str.charAt(0));
    }
}
