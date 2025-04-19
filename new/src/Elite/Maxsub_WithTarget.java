package Elite;

import java.util.Scanner;

public class Maxsub_WithTarget {

        public static void main(String[] args) {
            //  System.out.println("Hello, World!");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int target=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            int maxsum=0;
            for(int i=0;i<n;i++)
            {
                int sum=arr[i];
                for(int j=i+1;j<n;j++)
                {
                    if(sum<=target)
                        sum+=arr[j];
                    if(sum>maxsum && sum <=target)
                        maxsum=sum;
                }
            }System.out.print(maxsum);
        }
    }

