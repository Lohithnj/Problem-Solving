package Elite;

import java.util.Scanner;

public class MinimunQuantity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give annual Consumption");
        int anunalCon=sc.nextInt();//200000
        System.out.println("Give cost of Making one product");
        int costPro=sc.nextInt();//20
        System.out.println("Give Storage cost");
        int stocost=sc.nextInt();//10
        System.out.println("Minimum Quantity of product is:");
        System.out.println((int)Math.sqrt((2*anunalCon*costPro)/stocost));
    }
}
