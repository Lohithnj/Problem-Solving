package NandhaSirClass;

import java.util.Scanner;

public class MagicNo {
    public static void main(String[] args) {


        int n = 1729;
        int c=n;
        int sum = 0;
        while (n > 0) {
            int uni = n % 10;
            sum += uni;
            n /= 10;
        }
        int resum=sum;
        int rev = 0;
        while (sum > 0) {
            int uni = sum % 10;
            rev = (rev * 10) + uni;
            sum /= 10;
        }
        System.out.println((resum*rev == c)?"Yes":"No");
    }
}
