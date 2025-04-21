package NandhaSirClass.Contribution;

public class ConsOnesByFlipOneZero {
    public static void main(String[] args) {
        int[] arr={1,0,1,0,1,1,1,0,1,1};
        int len=arr.length-1;
        int max=0,c=0;
        for(int i=0;i<=len;i++)
        {
            if(arr[i]==0)
            {
                arr[i]=(c+1)*-1;
                c=0;
            }
            c++;
        }
        int count=0;
        for(int i=0;i<=len;i++)
        {
            if(arr[i]!=1)
            {
                count=arr[i]*-1;
                i++;
                while(i<=len && arr[i]!=1)
                {
                    count++;
                    i++;
                }
                max=Math.max(max,count);
            }
        }
    }
}
