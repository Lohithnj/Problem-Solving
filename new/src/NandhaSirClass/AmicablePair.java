package NandhaSirClass;

import java.util.Scanner;

public class AmicablePair {
    static int amicable(int n)
    {
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
                sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int a=220;
        int b=284;
        int n1=amicable(a);
        int n2=amicable(b);
        System.out.println((n1==b && n2==a)?"Amicable":"Not");
    }
}
