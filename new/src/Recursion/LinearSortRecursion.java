package Recursion;

public class LinearSortRecursion {
    static boolean linear(int[] arr,int i,int n){
        if(i==n)
            return true;
        return (arr[i]<arr[i+1] && linear(arr,i+1,n));


    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,100};
        int n= arr.length-1,i=0;
        System.out.println(linear(arr,i,n));
    }
}
