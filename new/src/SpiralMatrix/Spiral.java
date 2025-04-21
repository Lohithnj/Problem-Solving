package SpiralMatrix;

import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//5
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
               // System.out.print(arr[i][j]);
            }
        }
        int top=0;
        int right=n-1;
        int bottom=n-1;
        int left=0;
        while(n>0)
        {
            for(int i=left;i<=right;i++)
            {
                System.out.print(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++) {
                System.out.print(arr[i][right]);
            }
            right--;
            for(int i=right;i>=left;i--)
            {
                System.out.print(arr[bottom][i]);
            }
            bottom--;
            for(int i=bottom;i>left;i--)
            {
                System.out.print(arr[i][left]);
            }
            left++;
            n--;
            System.out.println();
        }



    }
}
