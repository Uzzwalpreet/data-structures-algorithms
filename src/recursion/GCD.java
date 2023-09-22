package recursion;

public class GCD {

    public static void main(String[] args) {
        System.out.println(gcd(9000, 980));
    }

    public static int gcd(int m, int n) {
        if (m < 0 || n < 0)
            return -1;
        if (n == 0)
            return m;
        return gcd(n, m % n);
    }
}
