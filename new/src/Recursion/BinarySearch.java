package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,45,67,89,91};
        int target=91;
        System.out.println(binary(arr,target,0,arr.length-1));//it gives index of element.

    }
    static int binary(int[] arr,int target,int start,int end)
    {
        if(start>end)
            return -1;

        int mid=(start+end)/2;
        if(arr[mid]==target)
            return mid;
        if(target>arr[mid])
            return binary(arr,target,mid+1,end);

            return binary(arr,target,start,mid-1);
    }
}
