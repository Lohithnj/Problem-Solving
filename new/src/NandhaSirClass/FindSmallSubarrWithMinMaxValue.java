package NandhaSirClass;

public class FindSmallSubarrWithMinMaxValue {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,3,1,4,6,1,3,1,6};
        int min_ind=-1;
        int max_ind=-1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
                min=arr[i];
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(min+" "+max);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==min)
            {
                min_ind=i;
                if(max_ind!=-1)
                    ans=Math.min(ans,min_ind-max_ind+1);
            }
            if(arr[i]==max)
            {
                max_ind=i;
                if(min_ind!=-1)
                    ans=Math.min(ans,max_ind-min_ind+1);
            }
        }
        System.out.println(ans);
    }
}
