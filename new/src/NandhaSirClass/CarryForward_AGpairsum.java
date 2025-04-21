package NandhaSirClass;

public class CarryForward_AGpairsum {
    public static void main(String[] args) {
        char[] arr={'a','b','c','d','e','g','g','a','a','a','g'};
        //count a-g pairs
        int ans=0;
        int count_a=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='a')
            {
                count_a++;
            }
            if(arr[i]=='g')
            {
                ans+=count_a;
            }
        }
        System.out.println(ans);

    }
}
