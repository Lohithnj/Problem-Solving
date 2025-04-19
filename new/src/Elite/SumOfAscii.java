package Elite;

import java.util.Scanner;

public class SumOfAscii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();//abcdABCD
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            sum += (int)str.charAt(i);
        }
        System.out.println(sum);//660
        }
    }

