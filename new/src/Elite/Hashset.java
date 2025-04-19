package Elite;

import java.util.HashSet;
import java.util.Scanner;

public class Hashset {
    public static void main(String[] args) {
        Scanner scc=new Scanner(System.in);
        HashSet<String> set=new HashSet();
        set.add("Red");
        set.add("Green");
        set.add("Blue");

        System.out.println(set.contains("Red"));

        for(String color:set)
            System.out.println(color);
    }
}
