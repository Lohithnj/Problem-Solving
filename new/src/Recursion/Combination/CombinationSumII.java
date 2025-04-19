package Recursion.Combination;
import java.util.*;
public class CombinationSumII {




//    TLE CODE
//    static void find(List<List<Integer>> main,List<Integer> list,int[] arr,int target,int ind)
//    {
//        if(target==0)
//        {
//            if(!main.contains(list))
//                main.add(new ArrayList<>(list));
//            return ;
//        }
//        if(target<0 || ind>=arr.length) return ;
//        list.add(arr[ind]);
//        find(main,list,arr,target-arr[ind],ind+1);
//        list.remove(list.size()-1);
//        find(main,list,arr,target,ind+1);
//
//    }
//
//    public static void main(String[] args) {
//        int[] candidates={10,1,2,7,6,1,5};
//        int target=8;
//        Arrays.sort(candidates);
//        List<List<Integer>> main=new ArrayList<>();
//        find(main,new ArrayList<>(),candidates,target,0);
//        System.out.println(main);
//    }
}
