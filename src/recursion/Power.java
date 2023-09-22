package recursion;

public class Power {

    public static void main(String[] args) {
        System.out.println(power(2,16));
    }

    public static int power(int n, int power) {
        if (power < 0)
            return -1;
        if (power == 0)
            return 1;
        return n * power(n, power-1);
    }
}
