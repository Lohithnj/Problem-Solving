package NandhaSirClass;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixEvenSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7};
        int[] l={0,2,3,2};//querys in range
        int[] r={3,4,5,3};
        //prefix sum
//        for(int j=1;j<arr.length;j++)
//        {
//            arr[j]=arr[j-1]+arr[j];
//        }
//        for(int i=0;i<l.length;i++)
//        {
//            int ans=0;
//            int left=l[i],right=r[i];
//            if(left  != 0)
//                ans=arr[right]-arr[left-1];
//            else
//                ans=arr[right];
//            System.out.println(ans+" ");
//        }

        //PrefixEvenSum {1,2,3,4,5,6}
//        for(int i=1;i<arr.length;i++)
//        {
//            if(i%2 !=0)
//                arr[i]=arr[i-1];
//            else
//                arr[i]=arr[i-1]+arr[i];
//        }
//        for(int i=0;i<l.length;i++)
//        {
//            int ans=0;
//            int left=l[i];
//            int right=r[i];
//            if(left  != 0)
//                ans=arr[right]-arr[left-1];
//            else
//                ans=arr[right];
//            System.out.println(ans+" ");
//        }
//        System.out.println(Arrays.toString(arr));

        //prefixOddSum
        arr[0]=0;
        for(int i=1;i<arr.length;i++)
        {
            if(i%2 ==0)
                arr[i]=arr[i-1];
            else
                arr[i]=arr[i-1]+arr[i];
        }
        for(int i=0;i<l.length;i++)
        {
            int ans=0;
            int left=l[i];
            int right=r[i];
            if(left  != 0)
                ans=arr[right]-arr[left-1];
            else
                ans=arr[right];
            System.out.println(ans+" ");
        }
        System.out.println(Arrays.toString(arr));
    }
}
