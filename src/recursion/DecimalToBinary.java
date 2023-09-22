package recursion;

public class DecimalToBinary {

    public static void main(String[] args) {
        System.out.println(deciToBin(14));
    }

    public static String deciToBin(int n) {
        if (n == 1)
            return "1";
        if (n == 0)
            return "0";
        return deciToBin(n/2) + n%2;
    }
}
