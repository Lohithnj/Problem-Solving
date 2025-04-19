package TCS;

import java.util.*;

public class InputWithoutsize {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();//1 2 3 4 5
//        Scanner scc= new Scanner(str);

        String str=sc.nextLine();//1,2,3,4,5,6
        Scanner scc=new Scanner(str).useDelimiter(",");
        int sum=0;
        while(scc.hasNextInt()) {
            int n = scc.nextInt();
            sum += n;
        }
        System.out.print(sum);
    }
}
