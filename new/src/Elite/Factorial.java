package Elite;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
                System.out.println(i+" "+n/i);
        }
        if(n%Math.sqrt(n)==0)
            System.out.println((int)Math.sqrt(n));

    }
}
