package NandhaSirClass;

import java.util.HashMap;
import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            if(!map.containsKey(a))
                map.put(a,1);
            else
                map.remove(a);
        }
        for(int iter:map.values())
            System.out.println(iter+" ");


    }
}
