package ZohoQues;

public class Pattren {
    public static void main(String[] args) {
        int n=5,dec=n;
        int start=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.printf("   ");
            }
            int val=start;
            for(int k=n-i+1;k<=n;k++)
            {
                System.out.printf("%02d ",val);
                val=val-(k);
            }
            start=start+dec;
            dec--;
            System.out.println();
        }
    }
}
