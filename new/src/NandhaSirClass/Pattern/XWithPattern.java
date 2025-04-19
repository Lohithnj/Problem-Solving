package NandhaSirClass.Pattern;

public class XWithPattern {
    public static void main(String[] args) {
        int n=3;
        //upper
        for(int i=1;i<n;i++) //remove one iteration.
        {
            int ans=i;
            for(int j=1;j<=2*n-1;j++)
            {
                if(i>=j)
                {
                    System.out.print(j);
                    if(i==n && i==j)
                        ans--;
                }
                else if(i+j>=2*n)
                {
                    System.out.print(ans);
                    --ans;
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        //lower
        for(int i=n;i>=1;i--)
        {
            int ans=i;
            for(int j=1;j<=2*n-1;j++)
            {
                if(i>=j)
                {
                    System.out.print(j);
                    if(i==n && i==j)
                        ans--;
                }
                else if(i+j>=2*n)
                {
                    System.out.print(ans);
                    --ans;
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
