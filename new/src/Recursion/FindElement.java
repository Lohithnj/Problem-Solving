package Recursion;

import java.util.ArrayList;

public class FindElement {
//    find single occurance
    static boolean find(int[] arr, int i, int target){
        if(i==arr.length)
            return false;
        return arr[i]==target ||  find(arr,i+1,target);


    }


    //find multiple occurance.
    static ArrayList<Integer> finder(int[] arr,int index ,int target){
        ArrayList<Integer> list=new ArrayList<>();

        if(index== arr.length)
            return list;

        if(arr[index]==target)
            list.add(index);

        ArrayList<Integer> ansFromBelow= finder(arr,index+1,target);
        list.addAll(ansFromBelow);
        return list;
    }


    public static void main(String[] args) {
        int[] arr={1,2,4,5,7,8};
        int[] arr1={1,2,3,1,4,1};
        int n=arr.length-1;
        int i=0;
        int target=0;
//        System.out.println(find(arr,i,target));//single occ
        System.out.println(finder(arr1,i,target));//multiple occ
    }
}
