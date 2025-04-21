package Diamond_pattern;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<space;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("* ");
            }
            space--;
            System.out.println();
        }
        int spa=0;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<spa;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("* ");
            }
            spa++;
            System.out.println();
        }
    }
}
