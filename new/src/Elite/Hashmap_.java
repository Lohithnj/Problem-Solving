package Elite;

import java.util.HashMap;
import java.util.Scanner;

public class Hashmap_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        map.put("lohi",1);
        map.put("ohi",2);
        map.put("hi",3);
        System.out.println(map);

        for(String name:map.keySet())
            System.out.println(name+" "+map.get(name));
    }
}
