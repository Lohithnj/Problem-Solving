package SortingAlgo;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {1, 23, 424, 23, 1232, 12};
        int n = arr.length;
        bubbleSort(arr, n);
    }
         static void bubbleSort(int arr[], int n)
        {
            //code here
            int swap=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n-i-1;j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        swap=1;
                    }
                }
                if(swap==0)
                    break;
            }
            System.out.println(Arrays.toString(arr));

        }
    }

