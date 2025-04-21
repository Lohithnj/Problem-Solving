package SortingAlgo;

import java.util.Scanner;
//Select 1. Array becomes 1 4 3 9 7.
//Select 3. Array becomes 1 3 4 9 7.
//Select 4. Array becomes 1 3 4 9 7.
//Select 7. Array becomes 1 3 4 7 9.
//Select 9. Array becomes 1 3 4 7 9.
public class Selection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for(int i=0;i<test;i++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++)
                arr[j]=sc.nextInt();
            SelectionSort(arr, n);
        }
    }
    static void SelectionSort(int[] arr,int n){
        for(int i=n-1;i>0;i--)
        {
            int max=i,flag=0;
            for(int j=i-1;j>=0;j--)
            {
                if(arr[max]<=arr[j])
                {
                    max=j;
                    flag=1;
                }
            }
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;

            System.out.print((flag==1)?max:i);
            System.out.print(" ");
        }
        System.out.println();
    }
}
