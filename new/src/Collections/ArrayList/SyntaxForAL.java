package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class SyntaxForAL {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        Iterator itr= list.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
