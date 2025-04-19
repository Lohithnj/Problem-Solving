package SortingAlgo;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int low,int high)
    {
        //Important return statement.
        if(low>high)
            return ;

        int s=low;
        int e=high;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];

        while(s<=e)
        {
            while(arr[s] < pivot)
            {
                s++;
            }
            while(pivot < arr[e])
            {
                e--;
            }
            //if array is already sorted and their start value is greater than end so,it does not work in this condition.
            if(s<=e)
            {
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        //this is to call the remaining two half of the array.
        sort(arr,low,e);
        sort(arr,s,high);
    }
}
