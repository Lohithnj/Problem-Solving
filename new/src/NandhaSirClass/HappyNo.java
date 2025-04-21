package NandhaSirClass;

import java.util.Scanner;

public class HappyNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Happy number means the value should reach zero by the sum of square of digits.
        //When a number is not a happy number then the sum of square while contain '4' in it.
        int n=sc.nextInt();
        while(true) {
            int sum=0;
            while (n > 0) {
                int uni = n % 10;
                sum += uni*uni;
                n/=10;
            }
            n=sum;
            if (sum == 1) {
                System.out.println("Happy Number");
                break;
            }
            if (sum == 4) {
                System.out.println("Not");
                break;
            }
        }
    }
}
