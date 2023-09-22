package recursion;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("amanaplanacanalpanama"));
    }

    public static boolean isPalindrome(String str) {
       // System.out.println(str);
        if (str.isEmpty() || str.length() == 1)
            return true;
        if (str.charAt(0) != str.charAt(str.length() - 1))
            return false;
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}
