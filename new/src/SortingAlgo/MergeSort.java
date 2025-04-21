package SortingAlgo;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};

//        arr=merge(arr);// normal merge main function
        mergeInPlace(arr,0,arr.length);//Inplace merge main function
        System.out.println(Arrays.toString(arr));
    }

//    divide array untill it gets to single element.
    public static int[] merge(int[] arr)
    {
        if(arr.length==1)
            return arr;

        int mid=arr.length/2;

        int[] left=merge(Arrays.copyOfRange(arr,0,mid));
        int[] right=merge(Arrays.copyOfRange(arr,mid,arr.length));

        return combine(left,right);
    }
    //merge two sorted array.
    private static int[] combine(int[] left, int[] right) {
        int i=0;
        int j=0;
        int k=0;

        int[] newarr=new int[left.length+right.length];
        while(i< left.length && j<right.length)
        {
            if(left[i] < right[j])
            {
                newarr[k]=left[i];
                i++;
            }
            else
            {
                newarr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i< left.length)
        {
            newarr[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length)
        {
            newarr[k]=right[j];
            j++;
            k++;
        }return newarr;
    }

    //MergeInPlace
    public static void mergeInPlace(int[] arr,int s,int e)
    {
        if(e-s==1)
            return ;

        int mid=(s+e)/2;

        mergeInPlace(arr,s,mid);
        mergeInPlace(arr,mid,e);//resume here.

        combine(arr,s,mid,e);
    }
    //merge two sorted array.
    private static void combine(int[] arr ,int left,int mid, int right) {
        int i=left;
        int j=mid;
        int k=0;

        int[] mix=new int[right-left];
        while(i< mid && j<right)
        {
            if(arr[i] < arr[j])
            {
                mix[k]=arr[i];
                i++;
            }
            else
            {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i< mid)
        {
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<right)
        {
            mix[k]=arr[j];
            j++;
            k++;
        }

        for (int c=0;c<mix.length;c++)
        {
            arr[left+c]=mix[c];
        }return ;
    }

}
