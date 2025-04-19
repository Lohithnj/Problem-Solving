package Elite;

import java.util.Scanner;

public class IdentifyOddUniqueWithXor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//9
        int[] arr=new int[n];//2 3 6 8 2 3 7 8 6
        int res=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            res^=arr[i];
        }
        System.out.println(res);//7
    }
}
