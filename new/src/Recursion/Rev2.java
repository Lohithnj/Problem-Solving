package Recursion;

public class Rev2 {
    static int rever(int n) {
        int digit = (int) Math.log10(n) + 1;
        return helper(n, digit);
    }

    static int helper(int n, int digit) {
        if (n % 10 == n)
            return n;
        int rem = n % 10;
        return rem * (int) Math.pow(10, digit - 1) + helper(n / 10, digit - 1);
    }


    public static void main(String[] args) {
        int res=rever(12345);
        System.out.println(res);
    }
}

