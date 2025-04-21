package Recursion;

public class RBS {
    ////check whether any one half is sorted ,here i took first half.
    //If condition is true then it check whether it lies within that if not it goes to another half
    //In second condition it Check whether the key lies within that half if yes then, the start value gets changed.
    //if no then ,the end is reduced to mid-1

    static int binarysearch(int[] arr,int target,int s,int e)
    {
        if(s>e)
            return -1;
        int mid=s+(e-s)/2;
        if(arr[mid]==target)
            return mid;
        if(arr[s] <= arr[mid])
        {
            if(target >= arr[s] && target<= arr[mid])
                return binarysearch(arr,target,s,mid-1);
            else
                return binarysearch(arr,target,mid+1,e);
        }

            if (target >= arr[mid] && target <= arr[e])
                return binarysearch(arr, target, mid + 1, e);
            return binarysearch(arr, target, s, mid - 1);


    }
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,1,2,3};
        int target=6;
        System.out.println(binarysearch(arr,target,0,arr.length-1));
    }
}
