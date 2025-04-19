package Recursion;

import java.util.Scanner;

public class FibonacciNthNo {
     static int fun(int n){
         if(n<=1)
             return n;
         return (fun(n-1)+fun(n-2));
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fun(n));
    }
}
