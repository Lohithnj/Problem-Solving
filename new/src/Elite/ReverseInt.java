package Elite;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        while(n>0)
        {
            int uni=n%10;
            res=(res*10)+uni;
            n/=10;
        }
        System.out.println(res);
    }

}

