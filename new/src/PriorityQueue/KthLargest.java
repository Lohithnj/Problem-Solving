package PriorityQueue;

import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        int[]  arr={3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(arr,4));
    }
    public static int findKthLargest(int[] nums, int k) {
        int temp=-1;
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();//Heap concept ,it defaultly store min values in heap.
         for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]*-1);
        }
        for(int i=1;i<=k;i++)
        {
            temp=pq.poll();
        }
        return temp*-1;

        // PriorityQueue<Integer> pq=new PriorityQueue<Integer>((a,b) -> (b-a));
        // for(int i=0;i<nums.length;i++)
        // {
        //     pq.add(nums[i]);
        // }
        // for(int i=1;i<=k;i++)
        // {
        //     temp=pq.poll();
        // }
        // return temp;
    }
}
