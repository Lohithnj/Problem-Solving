package Recursion.Combination;
import java.util.*;
public class CombinationSum {
    static void find(List<List<Integer>> main,List<Integer> list,int[] arr,int ind,int sum,int target)
    {
        if(sum==target)
        {
            main.add(new ArrayList<>(list));
            return ;
        }
        if(sum>target)
        {
            return ;
        }
        for(int i=ind;i<arr.length;i++)
        {
            list.add(arr[i]);
            find(main,list,arr,i,sum+arr[i],target);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] candidates={2,3,6,7};
        int target=7;
        Arrays.sort(candidates);
        List<List<Integer>> main=new ArrayList<>();
        find(main,new ArrayList<>(),candidates,0,0,target);
        System.out.println(main);
    }
}

//optimized Approach
//class Solution {
//    List<List<Integer>> res;
//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        res = new ArrayList<>();
//        List<Integer> cur = new ArrayList<>();
//        backtrack(candidates, target, cur, 0);
//        return res;
//    }
//
//    public void backtrack(int[] nums, int target, List<Integer> curr, int i){
//        if(target == 0){
//            res.add(new ArrayList<>(curr));
//            return;
//        }
//        if(target < 0 || i >= nums.length) return;
//
//        curr.add(nums[i]);
//        backtrack(nums, target-nums[i], curr, i);
//        curr.remove(curr.size()-1);
//        backtrack(nums, target, curr, i+1);
//    }
//}
