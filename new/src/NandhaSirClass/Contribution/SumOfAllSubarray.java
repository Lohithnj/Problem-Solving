package NandhaSirClass.Contribution;

public class SumOfAllSubarray {
    public static void main(String[] args) {
        int[] arr={5,6,-2,4};
        int tsum=0;
        for(int i=0;i<arr.length;i++)
        {
            tsum+=(arr[i]*((i+1)*(arr.length-i)));
        }
        System.out.println(tsum);
    }
}
