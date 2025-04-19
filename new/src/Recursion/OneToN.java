package Recursion;

import java.util.Scanner;

public class OneToN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print1ton(n);
    }
    static void print1ton(int n)
    {
        if(n==0)
            return;
        print1ton(n-1);
        System.out.println(n);
    }
}
