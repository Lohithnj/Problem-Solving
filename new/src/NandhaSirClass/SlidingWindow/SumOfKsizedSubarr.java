package NandhaSirClass.SlidingWindow;

public class SumOfKsizedSubarr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=2;
        int max=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<k;i++)
            sum+=arr[i];
//        System.out.println(sum);
        for(int i=k;i<arr.length;i++)
        {
            sum+=arr[i];
            sum-=arr[i-k];
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }
}
