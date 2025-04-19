package ZohoQues;

import java.util.ArrayList;
import java.util.List;

public class NoRecusion {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(4);
        int n=15,temp=0;
        while(list.size()<=n)
        {
            list.add(list.get(temp)*10+3);

            list.add(list.get(temp)*10+4);
            temp++;
        }
        System.out.println(list);
    }
}
