package SpiralMatrix.DefaultOwnSpiral;

import java.util.Scanner;

public class SpiraLnXn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        int data=0;
        int top=0;
        int bottom=n-1;
        int right=n-1;
        int left=0;
        while(n>0) {
            for (int i = left; i <= right; i++) {
                arr[top][i] = data++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = data++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                arr[i][bottom] = data++;
            }
            bottom--;
            for (int i = bottom; i > left; i++) {
                arr[left][i] = data++;
            }
            left++;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;i++)
            {
                System.out.printf("%02d",arr[i][j]);
            }
            System.out.println();
        }
    }
}
