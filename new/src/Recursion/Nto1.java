package Recursion;

import java.util.Scanner;

public class Nto1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNto1(n);
    }
    static void printNto1(int n){
        if(n==1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNto1(n-1);
    }
}
