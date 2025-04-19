package HashMap_Prob;
import java.util.*;
public class PrintnOrder {
        public static void main(String[] args) {
            int[] arr={1,3,5,4,5,9,2,3,5};
            List<List<Integer>> main =new ArrayList<>();
            Map<Integer,Integer> map=new HashMap<>();
            for(int i:arr)
                map.put(i,map.getOrDefault(i,0)+1);
            for(int i:arr)
            {
                List<Integer> list=new ArrayList<>();
                if(map.containsKey(i) && map.get(i)>0)
                {
                    for(int j=0;j<map.get(i);j++)
                    {
                        list.add(i);
                    }
                    map.put(i,0);
                    main.add(list);
                }
            }
            System.out.print(main);
        }

}
