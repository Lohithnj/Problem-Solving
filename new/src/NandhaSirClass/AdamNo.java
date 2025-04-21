package NandhaSirClass;

import java.util.Scanner;

public class AdamNo {
    static int rev(int n)
    {
        int res=0;
        while(n>0)
        {
            int uni=n%10;
            res=res*10+uni;
            n/=10;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reverse=rev(n);
        int squareOfn=n*n;
        int reverseSquare=reverse*reverse;
        int squaredReverse=rev(reverseSquare);
        if(squaredReverse==squareOfn)
            System.out.println("Adam Number");
        else
            System.out.println("Not Adam");
    }
}
